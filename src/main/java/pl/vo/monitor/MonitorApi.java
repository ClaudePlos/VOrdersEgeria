/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.vo.monitor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.common.dao.GenericDao;
import pl.models.DocDTO;
import pl.models.DocItemDTO;

/**
 *
 * @author k.skowronski
 */

@Stateful(name = "MonitorApi", mappedName = "MonitorApi")
@LocalBean
public class MonitorApi implements Serializable {
    
    
    @PersistenceContext(name = "pu")
    protected EntityManager em;
    
    
    public List<DocItemDTO> getDocumentItemsForNipAndYear(String nip, String rok) {
        
        ustawVendiKonsolidacja();
        
        List<Object[]> docItemsOb = null;
        List<DocItemDTO> docItems = new ArrayList<DocItemDTO>();
        
        
         String sql = "SELECT ROZ_NUMER, ROZ_TYP, \n" +
            "SUM(PL_KWOTA_WALUTY_WN),SUM(PL_KWOTA_WALUTY_MA),(SUM(PL_KWOTA_WALUTY_WN) - \n" +
            "SUM(PL_KWOTA_WALUTY_MA))\n" +
            ", MIN (rozliczony) \n" +
            ", MIN(rozliczony_na_dzis)\n" +
            ", roz_rp_rok||'-'||substr('0'||roz_oksp_miesiac,-2) okres  \n" +
            ", roz_id\n" +
            "FROM NZT_ROZRACHUNKI, NZT_PLATNOSCI p, (SELECT TO_DATE(to_char(sysdate,'DD-MM-YYYY'),'DD-MM-YYYY') NA_DZIEN,'%' POTW FROM DUAL) DATA,\n" +
            "			(SELECT r.pl_id rozl_pl_id, \n" +
            "			        CASE WHEN (TO_DATE(to_char(sysdate,'DD-MM-YYYY'),'DD-MM-YYYY')  >= \n" +
            "			                    nzp_status_platnosci.data_zaplaty(r.pl_id, 'N','%'))\n" +
            "			             THEN DECODE(r.PL_F_ROZNICA_KURSOWA, 'N',  r.PL_F_ROZLICZONA ,'T')\n" +
            " 			             ELSE  r.PL_F_ROZNICA_KURSOWA END rozliczony,\n" +
            "		       	 DECODE(r.PL_F_ROZNICA_KURSOWA, 'N',\n" +
            "			     nzp_status_platnosci.f_rozliczona(r.pl_id,NULL,'%') ,'T') rozliczony_na_dzis\n" +
            "FROM nzt_platnosci r) rozl  WHERE ( pl_roz_id = roz_id AND pl_f_anulowana = 'N' and rozl_pl_id = pl_id ) \n" +
            "AND (((( roz_kl_kod = (select max(KLD_KL_KOD) from ckk_klienci_dane where replace(kld_nip,'-','') = replace('" + nip + "','-','')) )) AND ( roz_rp_rok = '" + rok + "')))\n" +
            "GROUP BY DATA.NA_DZIEN, roz_id, roz_numer,roz_typ, roz_wal_id, roz_kl_kod, roz_rp_rok, roz_oksp_miesiac \n" +
            "ORDER BY roz_oksp_miesiac" ; 
         
         
        try { 
            
            docItemsOb =  em.createNativeQuery(sql).getResultList();
            
            
             for ( Object[] i : docItemsOb)
             {
               DocItemDTO item = new DocItemDTO();
               item.setRozNumer( (String) i[0] );
               item.setRozTyp( (String) i[1] );
               item.setWn( (BigDecimal) i[2] );
               item.setMa( (BigDecimal) i[3] );
               item.setSaldo( (BigDecimal) i[4] );
               item.setRozliczony((String) i[5] );
               item.setRozliczonyNaDzis((String) i[6] ); 
               item.setOkres((String) i[7] );
               item.setRozId((BigDecimal) i[8] );
               docItems.add(item);
             }
            
            
        }
        catch ( Exception  ex) {
            throw new RuntimeException(ex);
        } 
        
        return docItems; 
    }
    
    
    
    public List<DocDTO> getDocumentForRowId( Long rozId ) {
        
        ustawVendiKonsolidacja();
        
        List<Object[]> docOb = null;
        List<DocDTO> doc = new ArrayList<DocDTO>();
        
        
         String sql = "SELECT DOK.DOK_NUMER_WLASNY,DOK.DOK_NUMER_OBCY,\n" +
            "to_char(DOK.DOK_DATA_WYSTAWIENIA,'YYYY-MM-DD'),to_char(DOK.DOK_DATA_ZAKSIEGOWANIA,'YYYY-MM-DD'),to_char(PL_DATA_WYMAGALNOSCI,'YYYY-MM-DD')\n" +
            ",PL_F_ZAPLATA,PL_F_ROZLICZONA\n" +
            ",DOK.DOK_OPIS, PL_OPIS\n" +
            ",PL_KWOTA_WN,PL_KWOTA_MA\n" +
            " FROM nzt_platnosci, \n" +
            "kgt_dokumenty dok, kgt_dokumenty zap, ckk_umowy, nzt_grupy_rozrachunkow, \n" +
            "nzt_rozrachunki WHERE ((( pl_roz_id = " + rozId + " ) AND (pl_um_id = um_id (+) AND \n" +
            "pl_roz_id = roz_id AND roz_gr_id = gr_id(+) AND pl_dok_id = dok.dok_id AND \n" +
            "dok.dok_dok_id_zap = zap.dok_id (+) AND pl_f_anulowana = 'N' )))" ; 
         
         
        try { 
            
            docOb =  em.createNativeQuery(sql).getResultList();
            
            
             for ( Object[] i : docOb)
             {
               DocDTO item = new DocDTO();
               item.setNumerWlasny((String) i[0] );
               item.setNumerObcy((String) i[1] );
               
               item.setDataWystawienia((String) i[2] );
               item.setDataZaksiegowania((String) i[3] );
               item.setDataWymagalnosci((String) i[4] );
               
               item.setZaplata((String) i[5] );
               item.setRozliczona((String) i[6] ); 
               
               item.setDokOpis((String) i[7] );
               item.setPlOpis((String) i[8] );
               
               item.setWn((BigDecimal) i[9] );
               item.setMa((BigDecimal) i[10] );
               
               doc.add(item);
             }
            
            
        }
        catch ( Exception  ex) {
            throw new RuntimeException(ex);
        } 
        
        return doc; 
    }
    
    
    
    
    public void ustawVendiKonsolidacja()
    {
        String sql = " eap_globals.ustaw_firme('300038'); ";
        executeSqlProc ( sql );
        sql = " eap_globals.USTAW_konsolidacje('N'); ";
        executeSqlProc ( sql ); 
        
    }
    
    
    
    protected void executeSqlProc( String par )
    {
        String sql = "begin "; 
        //sql += " inaprzod_Ctx.set_inaprzod_user( ' " + pobierzAktUzytkownika().getUzNazwa() + "'); ";
        sql += par; 
        sql += " end ;";
        try {
            em.createNativeQuery( sql ).executeUpdate();
        }
        catch ( Exception  ex) {
            throw new RuntimeException(ex);
        } 
    }
    
}

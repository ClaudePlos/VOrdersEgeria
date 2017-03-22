/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author k.skowronski
 */
public class DocDTO {
    
    private String numerWlasny;
    private String numerObcy;
    
    private Date dataWystawienia;
    private Date dataZaksiegowania;
    private Date dataWymagalnosci;
    
    private String zaplata;
    private String rozliczona;
    
    private String dokOpis;
    private String plOpis;
    
    private BigDecimal wn;
    private BigDecimal ma;

    public String getNumerWlasny() {
        return numerWlasny;
    }

    public void setNumerWlasny(String numerWlasny) {
        this.numerWlasny = numerWlasny;
    }

    public String getNumerObcy() {
        return numerObcy;
    }

    public void setNumerObcy(String numerObcy) {
        this.numerObcy = numerObcy;
    }

    public Date getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public Date getDataZaksiegowania() {
        return dataZaksiegowania;
    }

    public void setDataZaksiegowania(Date dataZaksiegowania) {
        this.dataZaksiegowania = dataZaksiegowania;
    }

    public Date getDataWymagalnosci() {
        return dataWymagalnosci;
    }

    public void setDataWymagalnosci(Date dataWymagalnosci) {
        this.dataWymagalnosci = dataWymagalnosci;
    }

    public String getZaplata() {
        return zaplata;
    }

    public void setZaplata(String zaplata) {
        this.zaplata = zaplata;
    }

    public String getRozliczona() {
        return rozliczona;
    }

    public void setRozliczona(String rozliczona) {
        this.rozliczona = rozliczona;
    }

    public String getDokOpis() {
        return dokOpis;
    }

    public void setDokOpis(String dokOpis) {
        this.dokOpis = dokOpis;
    }

    public String getPlOpis() {
        return plOpis;
    }

    public void setPlOpis(String plOpis) {
        this.plOpis = plOpis;
    }

    public BigDecimal getWn() {
        return wn;
    }

    public void setWn(BigDecimal wn) {
        this.wn = wn;
    }

    public BigDecimal getMa() {
        return ma;
    }

    public void setMa(BigDecimal ma) {
        this.ma = ma;
    }

    
    
    
    
}

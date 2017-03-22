/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author k.skowronski
 */
@Entity
@Table(name = "CKK_KLIENCI_AKT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CkkKlienciAkt.findAll", query = "SELECT c FROM CkkKlienciAkt c")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKod = :klKod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlSkrot", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klSkrot = :klSkrot")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlWlasciciel", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klWlasciciel = :klWlasciciel")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlFOsobaFizyczna", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klFOsobaFizyczna = :klFOsobaFizyczna")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlZrodloDanych", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klZrodloDanych = :klZrodloDanych")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klId = :klId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKlKod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKlKod = :klKlKod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlTyp", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klTyp = :klTyp")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlNazwa", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klNazwa = :klNazwa")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlZatwierdzony", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klZatwierdzony = :klZatwierdzony")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlFAktualne", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klFAktualne = :klFAktualne")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlUtworzyl", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klUtworzyl = :klUtworzyl")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKiedyUtworzyl", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKiedyUtworzyl = :klKiedyUtworzyl")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKntId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKntId = :klKntId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlNip", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klNip = :klNip")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlRegon", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klRegon = :klRegon")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlPesel", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klPesel = :klPesel")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlFormaWlasnosci", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klFormaWlasnosci = :klFormaWlasnosci")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlStanDokumentacji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klStanDokumentacji = :klStanDokumentacji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlUrzadSkarbowy", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klUrzadSkarbowy = :klUrzadSkarbowy")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlUrzadStatystyczny", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klUrzadStatystyczny = :klUrzadStatystyczny")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKgn", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKgn = :klKgn")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKontoKg", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKontoKg = :klKontoKg")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKomentarz", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKomentarz = :klKomentarz")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDataPowstania", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDataPowstania = :klDataPowstania")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef0", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef0 = :klDef0")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef1", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef1 = :klDef1")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef2", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef2 = :klDef2")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef3", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef3 = :klDef3")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef4", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef4 = :klDef4")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDef5", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDef5 = :klDef5")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlModyfikowal", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klModyfikowal = :klModyfikowal")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKiedyModyfikowal", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKiedyModyfikowal = :klKiedyModyfikowal")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlOddzial", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klOddzial = :klOddzial")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlSad", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klSad = :klSad")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlNrRejestru", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klNrRejestru = :klNrRejestru")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDataModyfikacji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDataModyfikacji = :klDataModyfikacji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlPowodModyfikacji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klPowodModyfikacji = :klPowodModyfikacji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrId = :klAdrId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrKlKod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrKlKod = :klAdrKlKod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrTypUlicy", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrTypUlicy = :klAdrTypUlicy")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrUlica", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrUlica = :klAdrUlica")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrNumerDomu", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrNumerDomu = :klAdrNumerDomu")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrNumerLokalu", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrNumerLokalu = :klAdrNumerLokalu")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrMiejscowosc", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrMiejscowosc = :klAdrMiejscowosc")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrKodPocztowy", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrKodPocztowy = :klAdrKodPocztowy")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrPoczta", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrPoczta = :klAdrPoczta")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrGmina", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrGmina = :klAdrGmina")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrPowiat", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrPowiat = :klAdrPowiat")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrKrId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrKrId = :klAdrKrId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrWojId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrWojId = :klAdrWojId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrPowId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrPowId = :klAdrPowId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrGmId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrGmId = :klAdrGmId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrMsId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrMsId = :klAdrMsId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrUlId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrUlId = :klAdrUlId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlAdrZatwierdzony", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klAdrZatwierdzony = :klAdrZatwierdzony")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlDataRejestracji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klDataRejestracji = :klDataRejestracji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlNumerNierezydenta", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klNumerNierezydenta = :klNumerNierezydenta")
    , @NamedQuery(name = "CkkKlienciAkt.findByKlKodObcy", query = "SELECT c FROM CkkKlienciAkt c WHERE c.klKodObcy = :klKodObcy")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOstatniRokObrachTypPit", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOstatniRokObrachTypPit = :kldOstatniRokObrachTypPit")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKapitalZakladowy", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKapitalZakladowy = :kldKapitalZakladowy")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKapitalWplacony", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKapitalWplacony = :kldKapitalWplacony")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOrganEwidencyjny", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOrganEwidencyjny = :kldOrganEwidencyjny")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKrs", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKrs = :kldKrs")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOpisRodzDzialaln", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOpisRodzDzialaln = :kldOpisRodzDzialaln")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOstatniRokObrach", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOstatniRokObrach = :kldOstatniRokObrach")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOstatniRokObrachPrzych", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOstatniRokObrachPrzych = :kldOstatniRokObrachPrzych")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOstatniRokObrachDochod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOstatniRokObrachDochod = :kldOstatniRokObrachDochod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldMiesiacDeklaracji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldMiesiacDeklaracji = :kldMiesiacDeklaracji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldBiezaceSprawozdPrzychod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldBiezaceSprawozdPrzychod = :kldBiezaceSprawozdPrzychod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldBiezaceSprawozdDochod", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldBiezaceSprawozdDochod = :kldBiezaceSprawozdDochod")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldSumaKredytowPozaBzwbk", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldSumaKredytowPozaBzwbk = :kldSumaKredytowPozaBzwbk")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldSumaRatNettoPozaBzwbk", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldSumaRatNettoPozaBzwbk = :kldSumaRatNettoPozaBzwbk")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKodRyzyka", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKodRyzyka = :kldKodRyzyka")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKategoriaRyzyka", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKategoriaRyzyka = :kldKategoriaRyzyka")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKodRyzykaNaleznNajg", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKodRyzykaNaleznNajg = :kldKodRyzykaNaleznNajg")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldCrmTyp", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldCrmTyp = :kldCrmTyp")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldCrmPodsegment", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldCrmPodsegment = :kldCrmPodsegment")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldCrmKlasaISegmObslugi", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldCrmKlasaISegmObslugi = :kldCrmKlasaISegmObslugi")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldSwift", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldSwift = :kldSwift")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNipPrefiks", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNipPrefiks = :kldNipPrefiks")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNipDane", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNipDane = :kldNipDane")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFRezydent", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFRezydent = :kldFRezydent")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKrId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKrId = :kldKrId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFUdostGrupa", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFUdostGrupa = :kldFUdostGrupa")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFZgodaNaKoresp", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFZgodaNaKoresp = :kldFZgodaNaKoresp")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFZgodaNaKontakt", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFZgodaNaKontakt = :kldFZgodaNaKontakt")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldPrefFormaKontaktu", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldPrefFormaKontaktu = :kldPrefFormaKontaktu")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFSprzPrzetwDanych", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFSprzPrzetwDanych = :kldFSprzPrzetwDanych")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDoradca1", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDoradca1 = :kldDoradca1")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDoradca2", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDoradca2 = :kldDoradca2")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDoradca3", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDoradca3 = :kldDoradca3")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDecyzja", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDecyzja = :kldDecyzja")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldPlec", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldPlec = :kldPlec")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldTerminZaplaty", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldTerminZaplaty = :kldTerminZaplaty")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldTerminZaplatyVat", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldTerminZaplatyVat = :kldTerminZaplatyVat")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldSposobZaplaty", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldSposobZaplaty = :kldSposobZaplaty")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldWarunkiZaplaty", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldWarunkiZaplaty = :kldWarunkiZaplaty")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldPkd", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldPkd = :kldPkd")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFKapitalZagr", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFKapitalZagr = :kldFKapitalZagr")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNace", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNace = :kldNace")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldIsic", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldIsic = :kldIsic")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldWyksztalcenie", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldWyksztalcenie = :kldWyksztalcenie")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldStan", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldStan = :kldStan")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldImie", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldImie = :kldImie")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNazwisko", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNazwisko = :kldNazwisko")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNazwiskoDrugie", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNazwiskoDrugie = :kldNazwiskoDrugie")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDrugieImie", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDrugieImie = :kldDrugieImie")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldImieMatki", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldImieMatki = :kldImieMatki")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldImieOjca", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldImieOjca = :kldImieOjca")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDataUrodzenia", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDataUrodzenia = :kldDataUrodzenia")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldDataZgonu", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldDataZgonu = :kldDataZgonu")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldMiejsceUrodzenia", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldMiejsceUrodzenia = :kldMiejsceUrodzenia")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOddzialCis", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOddzialCis = :kldOddzialCis")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldStatusGiodo", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldStatusGiodo = :kldStatusGiodo")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldTkId", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldTkId = :kldTkId")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldTypKursu", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldTypKursu = :kldTypKursu")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldKlKodTkl", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldKlKodTkl = :kldKlKodTkl")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFZwolnionyCert", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFZwolnionyCert = :kldFZwolnionyCert")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFGenerowacWezwania", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFGenerowacWezwania = :kldFGenerowacWezwania")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOgrnNumer", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOgrnNumer = :kldOgrnNumer")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOgrnData", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOgrnData = :kldOgrnData")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldOgrnOrganRej", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldOgrnOrganRej = :kldOgrnOrganRej")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldFPodejrzany", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldFPodejrzany = :kldFPodejrzany")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNazwaReferatuEgzekucji", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNazwaReferatuEgzekucji = :kldNazwaReferatuEgzekucji")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNazwaOrganuEgzekucyjnego", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNazwaOrganuEgzekucyjnego = :kldNazwaOrganuEgzekucyjnego")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldNazwaNaWydruki", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldNazwaNaWydruki = :kldNazwaNaWydruki")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldEfEFaktura", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldEfEFaktura = :kldEfEFaktura")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldEfDataWycofania", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldEfDataWycofania = :kldEfDataWycofania")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldEfMail", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldEfMail = :kldEfMail")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldEfDataZgody", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldEfDataZgody = :kldEfDataZgody")
    , @NamedQuery(name = "CkkKlienciAkt.findByKldEfMailCc", query = "SELECT c FROM CkkKlienciAkt c WHERE c.kldEfMailCc = :kldEfMailCc")})
public class CkkKlienciAkt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_KOD")
    @Id
    private long klKod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "KL_SKROT")
    private String klSkrot;
    @Size(max = 1)
    @Column(name = "KL_WLASCICIEL")
    private String klWlasciciel;
    @Size(max = 1)
    @Column(name = "KL_F_OSOBA_FIZYCZNA")
    private String klFOsobaFizyczna;
    @Size(max = 3)
    @Column(name = "KL_ZRODLO_DANYCH")
    private String klZrodloDanych;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_ID")
    private long klId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_KL_KOD")
    private long klKlKod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KL_TYP")
    private String klTyp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 240)
    @Column(name = "KL_NAZWA")
    private String klNazwa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KL_ZATWIERDZONY")
    private String klZatwierdzony;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KL_F_AKTUALNE")
    private String klFAktualne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "KL_UTWORZYL")
    private String klUtworzyl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KL_KIEDY_UTWORZYL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date klKiedyUtworzyl;
    @Column(name = "KL_KNT_ID")
    private Long klKntId;
    @Size(max = 25)
    @Column(name = "KL_NIP")
    private String klNip;
    @Size(max = 20)
    @Column(name = "KL_REGON")
    private String klRegon;
    @Size(max = 11)
    @Column(name = "KL_PESEL")
    private String klPesel;
    @Size(max = 3)
    @Column(name = "KL_FORMA_WLASNOSCI")
    private String klFormaWlasnosci;
    @Size(max = 1)
    @Column(name = "KL_STAN_DOKUMENTACJI")
    private String klStanDokumentacji;
    @Size(max = 240)
    @Column(name = "KL_URZAD_SKARBOWY")
    private String klUrzadSkarbowy;
    @Size(max = 240)
    @Column(name = "KL_URZAD_STATYSTYCZNY")
    private String klUrzadStatystyczny;
    @Size(max = 30)
    @Column(name = "KL_KGN")
    private String klKgn;
    @Size(max = 200)
    @Column(name = "KL_KONTO_KG")
    private String klKontoKg;
    @Size(max = 240)
    @Column(name = "KL_KOMENTARZ")
    private String klKomentarz;
    @Column(name = "KL_DATA_POWSTANIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date klDataPowstania;
    @Size(max = 240)
    @Column(name = "KL_DEF0")
    private String klDef0;
    @Size(max = 240)
    @Column(name = "KL_DEF1")
    private String klDef1;
    @Size(max = 240)
    @Column(name = "KL_DEF2")
    private String klDef2;
    @Size(max = 240)
    @Column(name = "KL_DEF3")
    private String klDef3;
    @Size(max = 240)
    @Column(name = "KL_DEF4")
    private String klDef4;
    @Size(max = 240)
    @Column(name = "KL_DEF5")
    private String klDef5;
    @Size(max = 30)
    @Column(name = "KL_MODYFIKOWAL")
    private String klModyfikowal;
    @Column(name = "KL_KIEDY_MODYFIKOWAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date klKiedyModyfikowal;
    @Size(max = 3)
    @Column(name = "KL_ODDZIAL")
    private String klOddzial;
    @Size(max = 1024)
    @Column(name = "KL_SAD")
    private String klSad;
    @Size(max = 256)
    @Column(name = "KL_NR_REJESTRU")
    private String klNrRejestru;
    @Column(name = "KL_DATA_MODYFIKACJI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date klDataModyfikacji;
    @Size(max = 240)
    @Column(name = "KL_POWOD_MODYFIKACJI")
    private String klPowodModyfikacji;
    @Column(name = "KL_ADR_ID")
    private Long klAdrId;
    @Column(name = "KL_ADR_KL_KOD")
    private Long klAdrKlKod;
    @Size(max = 2)
    @Column(name = "KL_ADR_TYP_ULICY")
    private String klAdrTypUlicy;
    @Size(max = 100)
    @Column(name = "KL_ADR_ULICA")
    private String klAdrUlica;
    @Size(max = 40)
    @Column(name = "KL_ADR_NUMER_DOMU")
    private String klAdrNumerDomu;
    @Size(max = 40)
    @Column(name = "KL_ADR_NUMER_LOKALU")
    private String klAdrNumerLokalu;
    @Size(max = 50)
    @Column(name = "KL_ADR_MIEJSCOWOSC")
    private String klAdrMiejscowosc;
    @Size(max = 10)
    @Column(name = "KL_ADR_KOD_POCZTOWY")
    private String klAdrKodPocztowy;
    @Size(max = 50)
    @Column(name = "KL_ADR_POCZTA")
    private String klAdrPoczta;
    @Size(max = 255)
    @Column(name = "KL_ADR_GMINA")
    private String klAdrGmina;
    @Size(max = 30)
    @Column(name = "KL_ADR_POWIAT")
    private String klAdrPowiat;
    @Column(name = "KL_ADR_KR_ID")
    private Long klAdrKrId;
    @Column(name = "KL_ADR_WOJ_ID")
    private Long klAdrWojId;
    @Column(name = "KL_ADR_POW_ID")
    private Long klAdrPowId;
    @Column(name = "KL_ADR_GM_ID")
    private Long klAdrGmId;
    @Column(name = "KL_ADR_MS_ID")
    private Long klAdrMsId;
    @Column(name = "KL_ADR_UL_ID")
    private Long klAdrUlId;
    @Size(max = 1)
    @Column(name = "KL_ADR_ZATWIERDZONY")
    private String klAdrZatwierdzony;
    @Column(name = "KL_DATA_REJESTRACJI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date klDataRejestracji;
    @Size(max = 256)
    @Column(name = "KL_NUMER_NIEREZYDENTA")
    private String klNumerNierezydenta;
    @Size(max = 10)
    @Column(name = "KL_KOD_OBCY")
    private String klKodObcy;
    @Size(max = 1)
    @Column(name = "KLD_OSTATNI_ROK_OBRACH_TYP_PIT")
    private String kldOstatniRokObrachTypPit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "KLD_KAPITAL_ZAKLADOWY")
    private BigDecimal kldKapitalZakladowy;
    @Column(name = "KLD_KAPITAL_WPLACONY")
    private BigDecimal kldKapitalWplacony;
    @Size(max = 100)
    @Column(name = "KLD_ORGAN_EWIDENCYJNY")
    private String kldOrganEwidencyjny;
    @Size(max = 50)
    @Column(name = "KLD_KRS")
    private String kldKrs;
    @Size(max = 100)
    @Column(name = "KLD_OPIS_RODZ_DZIALALN")
    private String kldOpisRodzDzialaln;
    @Column(name = "KLD_OSTATNI_ROK_OBRACH")
    private Short kldOstatniRokObrach;
    @Column(name = "KLD_OSTATNI_ROK_OBRACH_PRZYCH")
    private BigDecimal kldOstatniRokObrachPrzych;
    @Column(name = "KLD_OSTATNI_ROK_OBRACH_DOCHOD")
    private BigDecimal kldOstatniRokObrachDochod;
    @Size(max = 2)
    @Column(name = "KLD_MIESIAC_DEKLARACJI")
    private String kldMiesiacDeklaracji;
    @Column(name = "KLD_BIEZACE_SPRAWOZD_PRZYCHOD")
    private BigDecimal kldBiezaceSprawozdPrzychod;
    @Column(name = "KLD_BIEZACE_SPRAWOZD_DOCHOD")
    private BigDecimal kldBiezaceSprawozdDochod;
    @Column(name = "KLD_SUMA_KREDYTOW_POZA_BZWBK")
    private BigDecimal kldSumaKredytowPozaBzwbk;
    @Column(name = "KLD_SUMA_RAT_NETTO_POZA_BZWBK")
    private BigDecimal kldSumaRatNettoPozaBzwbk;
    @Size(max = 4)
    @Column(name = "KLD_KOD_RYZYKA")
    private String kldKodRyzyka;
    @Size(max = 4)
    @Column(name = "KLD_KATEGORIA_RYZYKA")
    private String kldKategoriaRyzyka;
    @Size(max = 4)
    @Column(name = "KLD_KOD_RYZYKA_NALEZN_NAJG")
    private String kldKodRyzykaNaleznNajg;
    @Size(max = 4)
    @Column(name = "KLD_CRM_TYP")
    private String kldCrmTyp;
    @Size(max = 4)
    @Column(name = "KLD_CRM_PODSEGMENT")
    private String kldCrmPodsegment;
    @Size(max = 4)
    @Column(name = "KLD_CRM_KLASA_I_SEGM_OBSLUGI")
    private String kldCrmKlasaISegmObslugi;
    @Size(max = 100)
    @Column(name = "KLD_SWIFT")
    private String kldSwift;
    @Size(max = 3)
    @Column(name = "KLD_NIP_PREFIKS")
    private String kldNipPrefiks;
    @Size(max = 22)
    @Column(name = "KLD_NIP_DANE")
    private String kldNipDane;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_F_REZYDENT")
    private String kldFRezydent;
    @Column(name = "KLD_KR_ID")
    private BigInteger kldKrId;
    @Column(name = "KLD_F_UDOST_GRUPA")
    private Integer kldFUdostGrupa;
    @Size(max = 1)
    @Column(name = "KLD_F_ZGODA_NA_KORESP")
    private String kldFZgodaNaKoresp;
    @Size(max = 1)
    @Column(name = "KLD_F_ZGODA_NA_KONTAKT")
    private String kldFZgodaNaKontakt;
    @Size(max = 2)
    @Column(name = "KLD_PREF_FORMA_KONTAKTU")
    private String kldPrefFormaKontaktu;
    @Size(max = 2)
    @Column(name = "KLD_F_SPRZ_PRZETW_DANYCH")
    private String kldFSprzPrzetwDanych;
    @Size(max = 240)
    @Column(name = "KLD_DORADCA1")
    private String kldDoradca1;
    @Size(max = 240)
    @Column(name = "KLD_DORADCA2")
    private String kldDoradca2;
    @Size(max = 240)
    @Column(name = "KLD_DORADCA3")
    private String kldDoradca3;
    @Column(name = "KLD_DECYZJA")
    private BigInteger kldDecyzja;
    @Size(max = 1)
    @Column(name = "KLD_PLEC")
    private String kldPlec;
    @Column(name = "KLD_TERMIN_ZAPLATY")
    private Short kldTerminZaplaty;
    @Column(name = "KLD_TERMIN_ZAPLATY_VAT")
    private Short kldTerminZaplatyVat;
    @Size(max = 5)
    @Column(name = "KLD_SPOSOB_ZAPLATY")
    private String kldSposobZaplaty;
    @Size(max = 3)
    @Column(name = "KLD_WARUNKI_ZAPLATY")
    private String kldWarunkiZaplaty;
    @Size(max = 240)
    @Column(name = "KLD_PKD")
    private String kldPkd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_F_KAPITAL_ZAGR")
    private String kldFKapitalZagr;
    @Lob
    @Size(max = 0)
    @Column(name = "KLD_DEF6")
    private String kldDef6;
    @Size(max = 240)
    @Column(name = "KLD_NACE")
    private String kldNace;
    @Size(max = 240)
    @Column(name = "KLD_ISIC")
    private String kldIsic;
    @Column(name = "KLD_WYKSZTALCENIE")
    private Short kldWyksztalcenie;
    @Size(max = 10)
    @Column(name = "KLD_STAN")
    private String kldStan;
    @Size(max = 50)
    @Column(name = "KLD_IMIE")
    private String kldImie;
    @Size(max = 240)
    @Column(name = "KLD_NAZWISKO")
    private String kldNazwisko;
    @Size(max = 240)
    @Column(name = "KLD_NAZWISKO_DRUGIE")
    private String kldNazwiskoDrugie;
    @Size(max = 50)
    @Column(name = "KLD_DRUGIE_IMIE")
    private String kldDrugieImie;
    @Size(max = 50)
    @Column(name = "KLD_IMIE_MATKI")
    private String kldImieMatki;
    @Size(max = 50)
    @Column(name = "KLD_IMIE_OJCA")
    private String kldImieOjca;
    @Column(name = "KLD_DATA_URODZENIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kldDataUrodzenia;
    @Column(name = "KLD_DATA_ZGONU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kldDataZgonu;
    @Size(max = 100)
    @Column(name = "KLD_MIEJSCE_URODZENIA")
    private String kldMiejsceUrodzenia;
    @Column(name = "KLD_ODDZIAL_CIS")
    private BigInteger kldOddzialCis;
    @Size(max = 1)
    @Column(name = "KLD_STATUS_GIODO")
    private String kldStatusGiodo;
    @Column(name = "KLD_TK_ID")
    private Long kldTkId;
    @Size(max = 1)
    @Column(name = "KLD_TYP_KURSU")
    private String kldTypKursu;
    @Column(name = "KLD_KL_KOD_TKL")
    private Long kldKlKodTkl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_F_ZWOLNIONY_CERT")
    private String kldFZwolnionyCert;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_F_GENEROWAC_WEZWANIA")
    private String kldFGenerowacWezwania;
    @Column(name = "KLD_OGRN_NUMER")
    private Long kldOgrnNumer;
    @Column(name = "KLD_OGRN_DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kldOgrnData;
    @Size(max = 100)
    @Column(name = "KLD_OGRN_ORGAN_REJ")
    private String kldOgrnOrganRej;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_F_PODEJRZANY")
    private String kldFPodejrzany;
    @Size(max = 50)
    @Column(name = "KLD_NAZWA_REFERATU_EGZEKUCJI")
    private String kldNazwaReferatuEgzekucji;
    @Size(max = 50)
    @Column(name = "KLD_NAZWA_ORGANU_EGZEKUCYJNEGO")
    private String kldNazwaOrganuEgzekucyjnego;
    @Size(max = 1000)
    @Column(name = "KLD_NAZWA_NA_WYDRUKI")
    private String kldNazwaNaWydruki;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "KLD_EF_E_FAKTURA")
    private String kldEfEFaktura;
    @Column(name = "KLD_EF_DATA_WYCOFANIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kldEfDataWycofania;
    @Size(max = 120)
    @Column(name = "KLD_EF_MAIL")
    private String kldEfMail;
    @Column(name = "KLD_EF_DATA_ZGODY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date kldEfDataZgody;
    @Size(max = 1000)
    @Column(name = "KLD_EF_MAIL_CC")
    private String kldEfMailCc;

    public CkkKlienciAkt() {
    }

    public long getKlKod() {
        return klKod;
    }

    public void setKlKod(long klKod) {
        this.klKod = klKod;
    }

    public String getKlSkrot() {
        return klSkrot;
    }

    public void setKlSkrot(String klSkrot) {
        this.klSkrot = klSkrot;
    }

    public String getKlWlasciciel() {
        return klWlasciciel;
    }

    public void setKlWlasciciel(String klWlasciciel) {
        this.klWlasciciel = klWlasciciel;
    }

    public String getKlFOsobaFizyczna() {
        return klFOsobaFizyczna;
    }

    public void setKlFOsobaFizyczna(String klFOsobaFizyczna) {
        this.klFOsobaFizyczna = klFOsobaFizyczna;
    }

    public String getKlZrodloDanych() {
        return klZrodloDanych;
    }

    public void setKlZrodloDanych(String klZrodloDanych) {
        this.klZrodloDanych = klZrodloDanych;
    }

    public long getKlId() {
        return klId;
    }

    public void setKlId(long klId) {
        this.klId = klId;
    }

    public long getKlKlKod() {
        return klKlKod;
    }

    public void setKlKlKod(long klKlKod) {
        this.klKlKod = klKlKod;
    }

    public String getKlTyp() {
        return klTyp;
    }

    public void setKlTyp(String klTyp) {
        this.klTyp = klTyp;
    }

    public String getKlNazwa() {
        return klNazwa;
    }

    public void setKlNazwa(String klNazwa) {
        this.klNazwa = klNazwa;
    }

    public String getKlZatwierdzony() {
        return klZatwierdzony;
    }

    public void setKlZatwierdzony(String klZatwierdzony) {
        this.klZatwierdzony = klZatwierdzony;
    }

    public String getKlFAktualne() {
        return klFAktualne;
    }

    public void setKlFAktualne(String klFAktualne) {
        this.klFAktualne = klFAktualne;
    }

    public String getKlUtworzyl() {
        return klUtworzyl;
    }

    public void setKlUtworzyl(String klUtworzyl) {
        this.klUtworzyl = klUtworzyl;
    }

    public Date getKlKiedyUtworzyl() {
        return klKiedyUtworzyl;
    }

    public void setKlKiedyUtworzyl(Date klKiedyUtworzyl) {
        this.klKiedyUtworzyl = klKiedyUtworzyl;
    }

    public Long getKlKntId() {
        return klKntId;
    }

    public void setKlKntId(Long klKntId) {
        this.klKntId = klKntId;
    }

    public String getKlNip() {
        return klNip;
    }

    public void setKlNip(String klNip) {
        this.klNip = klNip;
    }

    public String getKlRegon() {
        return klRegon;
    }

    public void setKlRegon(String klRegon) {
        this.klRegon = klRegon;
    }

    public String getKlPesel() {
        return klPesel;
    }

    public void setKlPesel(String klPesel) {
        this.klPesel = klPesel;
    }

    public String getKlFormaWlasnosci() {
        return klFormaWlasnosci;
    }

    public void setKlFormaWlasnosci(String klFormaWlasnosci) {
        this.klFormaWlasnosci = klFormaWlasnosci;
    }

    public String getKlStanDokumentacji() {
        return klStanDokumentacji;
    }

    public void setKlStanDokumentacji(String klStanDokumentacji) {
        this.klStanDokumentacji = klStanDokumentacji;
    }

    public String getKlUrzadSkarbowy() {
        return klUrzadSkarbowy;
    }

    public void setKlUrzadSkarbowy(String klUrzadSkarbowy) {
        this.klUrzadSkarbowy = klUrzadSkarbowy;
    }

    public String getKlUrzadStatystyczny() {
        return klUrzadStatystyczny;
    }

    public void setKlUrzadStatystyczny(String klUrzadStatystyczny) {
        this.klUrzadStatystyczny = klUrzadStatystyczny;
    }

    public String getKlKgn() {
        return klKgn;
    }

    public void setKlKgn(String klKgn) {
        this.klKgn = klKgn;
    }

    public String getKlKontoKg() {
        return klKontoKg;
    }

    public void setKlKontoKg(String klKontoKg) {
        this.klKontoKg = klKontoKg;
    }

    public String getKlKomentarz() {
        return klKomentarz;
    }

    public void setKlKomentarz(String klKomentarz) {
        this.klKomentarz = klKomentarz;
    }

    public Date getKlDataPowstania() {
        return klDataPowstania;
    }

    public void setKlDataPowstania(Date klDataPowstania) {
        this.klDataPowstania = klDataPowstania;
    }

    public String getKlDef0() {
        return klDef0;
    }

    public void setKlDef0(String klDef0) {
        this.klDef0 = klDef0;
    }

    public String getKlDef1() {
        return klDef1;
    }

    public void setKlDef1(String klDef1) {
        this.klDef1 = klDef1;
    }

    public String getKlDef2() {
        return klDef2;
    }

    public void setKlDef2(String klDef2) {
        this.klDef2 = klDef2;
    }

    public String getKlDef3() {
        return klDef3;
    }

    public void setKlDef3(String klDef3) {
        this.klDef3 = klDef3;
    }

    public String getKlDef4() {
        return klDef4;
    }

    public void setKlDef4(String klDef4) {
        this.klDef4 = klDef4;
    }

    public String getKlDef5() {
        return klDef5;
    }

    public void setKlDef5(String klDef5) {
        this.klDef5 = klDef5;
    }

    public String getKlModyfikowal() {
        return klModyfikowal;
    }

    public void setKlModyfikowal(String klModyfikowal) {
        this.klModyfikowal = klModyfikowal;
    }

    public Date getKlKiedyModyfikowal() {
        return klKiedyModyfikowal;
    }

    public void setKlKiedyModyfikowal(Date klKiedyModyfikowal) {
        this.klKiedyModyfikowal = klKiedyModyfikowal;
    }

    public String getKlOddzial() {
        return klOddzial;
    }

    public void setKlOddzial(String klOddzial) {
        this.klOddzial = klOddzial;
    }

    public String getKlSad() {
        return klSad;
    }

    public void setKlSad(String klSad) {
        this.klSad = klSad;
    }

    public String getKlNrRejestru() {
        return klNrRejestru;
    }

    public void setKlNrRejestru(String klNrRejestru) {
        this.klNrRejestru = klNrRejestru;
    }

    public Date getKlDataModyfikacji() {
        return klDataModyfikacji;
    }

    public void setKlDataModyfikacji(Date klDataModyfikacji) {
        this.klDataModyfikacji = klDataModyfikacji;
    }

    public String getKlPowodModyfikacji() {
        return klPowodModyfikacji;
    }

    public void setKlPowodModyfikacji(String klPowodModyfikacji) {
        this.klPowodModyfikacji = klPowodModyfikacji;
    }

    public Long getKlAdrId() {
        return klAdrId;
    }

    public void setKlAdrId(Long klAdrId) {
        this.klAdrId = klAdrId;
    }

    public Long getKlAdrKlKod() {
        return klAdrKlKod;
    }

    public void setKlAdrKlKod(Long klAdrKlKod) {
        this.klAdrKlKod = klAdrKlKod;
    }

    public String getKlAdrTypUlicy() {
        return klAdrTypUlicy;
    }

    public void setKlAdrTypUlicy(String klAdrTypUlicy) {
        this.klAdrTypUlicy = klAdrTypUlicy;
    }

    public String getKlAdrUlica() {
        return klAdrUlica;
    }

    public void setKlAdrUlica(String klAdrUlica) {
        this.klAdrUlica = klAdrUlica;
    }

    public String getKlAdrNumerDomu() {
        return klAdrNumerDomu;
    }

    public void setKlAdrNumerDomu(String klAdrNumerDomu) {
        this.klAdrNumerDomu = klAdrNumerDomu;
    }

    public String getKlAdrNumerLokalu() {
        return klAdrNumerLokalu;
    }

    public void setKlAdrNumerLokalu(String klAdrNumerLokalu) {
        this.klAdrNumerLokalu = klAdrNumerLokalu;
    }

    public String getKlAdrMiejscowosc() {
        return klAdrMiejscowosc;
    }

    public void setKlAdrMiejscowosc(String klAdrMiejscowosc) {
        this.klAdrMiejscowosc = klAdrMiejscowosc;
    }

    public String getKlAdrKodPocztowy() {
        return klAdrKodPocztowy;
    }

    public void setKlAdrKodPocztowy(String klAdrKodPocztowy) {
        this.klAdrKodPocztowy = klAdrKodPocztowy;
    }

    public String getKlAdrPoczta() {
        return klAdrPoczta;
    }

    public void setKlAdrPoczta(String klAdrPoczta) {
        this.klAdrPoczta = klAdrPoczta;
    }

    public String getKlAdrGmina() {
        return klAdrGmina;
    }

    public void setKlAdrGmina(String klAdrGmina) {
        this.klAdrGmina = klAdrGmina;
    }

    public String getKlAdrPowiat() {
        return klAdrPowiat;
    }

    public void setKlAdrPowiat(String klAdrPowiat) {
        this.klAdrPowiat = klAdrPowiat;
    }

    public Long getKlAdrKrId() {
        return klAdrKrId;
    }

    public void setKlAdrKrId(Long klAdrKrId) {
        this.klAdrKrId = klAdrKrId;
    }

    public Long getKlAdrWojId() {
        return klAdrWojId;
    }

    public void setKlAdrWojId(Long klAdrWojId) {
        this.klAdrWojId = klAdrWojId;
    }

    public Long getKlAdrPowId() {
        return klAdrPowId;
    }

    public void setKlAdrPowId(Long klAdrPowId) {
        this.klAdrPowId = klAdrPowId;
    }

    public Long getKlAdrGmId() {
        return klAdrGmId;
    }

    public void setKlAdrGmId(Long klAdrGmId) {
        this.klAdrGmId = klAdrGmId;
    }

    public Long getKlAdrMsId() {
        return klAdrMsId;
    }

    public void setKlAdrMsId(Long klAdrMsId) {
        this.klAdrMsId = klAdrMsId;
    }

    public Long getKlAdrUlId() {
        return klAdrUlId;
    }

    public void setKlAdrUlId(Long klAdrUlId) {
        this.klAdrUlId = klAdrUlId;
    }

    public String getKlAdrZatwierdzony() {
        return klAdrZatwierdzony;
    }

    public void setKlAdrZatwierdzony(String klAdrZatwierdzony) {
        this.klAdrZatwierdzony = klAdrZatwierdzony;
    }

    public Date getKlDataRejestracji() {
        return klDataRejestracji;
    }

    public void setKlDataRejestracji(Date klDataRejestracji) {
        this.klDataRejestracji = klDataRejestracji;
    }

    public String getKlNumerNierezydenta() {
        return klNumerNierezydenta;
    }

    public void setKlNumerNierezydenta(String klNumerNierezydenta) {
        this.klNumerNierezydenta = klNumerNierezydenta;
    }

    public String getKlKodObcy() {
        return klKodObcy;
    }

    public void setKlKodObcy(String klKodObcy) {
        this.klKodObcy = klKodObcy;
    }

    public String getKldOstatniRokObrachTypPit() {
        return kldOstatniRokObrachTypPit;
    }

    public void setKldOstatniRokObrachTypPit(String kldOstatniRokObrachTypPit) {
        this.kldOstatniRokObrachTypPit = kldOstatniRokObrachTypPit;
    }

    public BigDecimal getKldKapitalZakladowy() {
        return kldKapitalZakladowy;
    }

    public void setKldKapitalZakladowy(BigDecimal kldKapitalZakladowy) {
        this.kldKapitalZakladowy = kldKapitalZakladowy;
    }

    public BigDecimal getKldKapitalWplacony() {
        return kldKapitalWplacony;
    }

    public void setKldKapitalWplacony(BigDecimal kldKapitalWplacony) {
        this.kldKapitalWplacony = kldKapitalWplacony;
    }

    public String getKldOrganEwidencyjny() {
        return kldOrganEwidencyjny;
    }

    public void setKldOrganEwidencyjny(String kldOrganEwidencyjny) {
        this.kldOrganEwidencyjny = kldOrganEwidencyjny;
    }

    public String getKldKrs() {
        return kldKrs;
    }

    public void setKldKrs(String kldKrs) {
        this.kldKrs = kldKrs;
    }

    public String getKldOpisRodzDzialaln() {
        return kldOpisRodzDzialaln;
    }

    public void setKldOpisRodzDzialaln(String kldOpisRodzDzialaln) {
        this.kldOpisRodzDzialaln = kldOpisRodzDzialaln;
    }

    public Short getKldOstatniRokObrach() {
        return kldOstatniRokObrach;
    }

    public void setKldOstatniRokObrach(Short kldOstatniRokObrach) {
        this.kldOstatniRokObrach = kldOstatniRokObrach;
    }

    public BigDecimal getKldOstatniRokObrachPrzych() {
        return kldOstatniRokObrachPrzych;
    }

    public void setKldOstatniRokObrachPrzych(BigDecimal kldOstatniRokObrachPrzych) {
        this.kldOstatniRokObrachPrzych = kldOstatniRokObrachPrzych;
    }

    public BigDecimal getKldOstatniRokObrachDochod() {
        return kldOstatniRokObrachDochod;
    }

    public void setKldOstatniRokObrachDochod(BigDecimal kldOstatniRokObrachDochod) {
        this.kldOstatniRokObrachDochod = kldOstatniRokObrachDochod;
    }

    public String getKldMiesiacDeklaracji() {
        return kldMiesiacDeklaracji;
    }

    public void setKldMiesiacDeklaracji(String kldMiesiacDeklaracji) {
        this.kldMiesiacDeklaracji = kldMiesiacDeklaracji;
    }

    public BigDecimal getKldBiezaceSprawozdPrzychod() {
        return kldBiezaceSprawozdPrzychod;
    }

    public void setKldBiezaceSprawozdPrzychod(BigDecimal kldBiezaceSprawozdPrzychod) {
        this.kldBiezaceSprawozdPrzychod = kldBiezaceSprawozdPrzychod;
    }

    public BigDecimal getKldBiezaceSprawozdDochod() {
        return kldBiezaceSprawozdDochod;
    }

    public void setKldBiezaceSprawozdDochod(BigDecimal kldBiezaceSprawozdDochod) {
        this.kldBiezaceSprawozdDochod = kldBiezaceSprawozdDochod;
    }

    public BigDecimal getKldSumaKredytowPozaBzwbk() {
        return kldSumaKredytowPozaBzwbk;
    }

    public void setKldSumaKredytowPozaBzwbk(BigDecimal kldSumaKredytowPozaBzwbk) {
        this.kldSumaKredytowPozaBzwbk = kldSumaKredytowPozaBzwbk;
    }

    public BigDecimal getKldSumaRatNettoPozaBzwbk() {
        return kldSumaRatNettoPozaBzwbk;
    }

    public void setKldSumaRatNettoPozaBzwbk(BigDecimal kldSumaRatNettoPozaBzwbk) {
        this.kldSumaRatNettoPozaBzwbk = kldSumaRatNettoPozaBzwbk;
    }

    public String getKldKodRyzyka() {
        return kldKodRyzyka;
    }

    public void setKldKodRyzyka(String kldKodRyzyka) {
        this.kldKodRyzyka = kldKodRyzyka;
    }

    public String getKldKategoriaRyzyka() {
        return kldKategoriaRyzyka;
    }

    public void setKldKategoriaRyzyka(String kldKategoriaRyzyka) {
        this.kldKategoriaRyzyka = kldKategoriaRyzyka;
    }

    public String getKldKodRyzykaNaleznNajg() {
        return kldKodRyzykaNaleznNajg;
    }

    public void setKldKodRyzykaNaleznNajg(String kldKodRyzykaNaleznNajg) {
        this.kldKodRyzykaNaleznNajg = kldKodRyzykaNaleznNajg;
    }

    public String getKldCrmTyp() {
        return kldCrmTyp;
    }

    public void setKldCrmTyp(String kldCrmTyp) {
        this.kldCrmTyp = kldCrmTyp;
    }

    public String getKldCrmPodsegment() {
        return kldCrmPodsegment;
    }

    public void setKldCrmPodsegment(String kldCrmPodsegment) {
        this.kldCrmPodsegment = kldCrmPodsegment;
    }

    public String getKldCrmKlasaISegmObslugi() {
        return kldCrmKlasaISegmObslugi;
    }

    public void setKldCrmKlasaISegmObslugi(String kldCrmKlasaISegmObslugi) {
        this.kldCrmKlasaISegmObslugi = kldCrmKlasaISegmObslugi;
    }

    public String getKldSwift() {
        return kldSwift;
    }

    public void setKldSwift(String kldSwift) {
        this.kldSwift = kldSwift;
    }

    public String getKldNipPrefiks() {
        return kldNipPrefiks;
    }

    public void setKldNipPrefiks(String kldNipPrefiks) {
        this.kldNipPrefiks = kldNipPrefiks;
    }

    public String getKldNipDane() {
        return kldNipDane;
    }

    public void setKldNipDane(String kldNipDane) {
        this.kldNipDane = kldNipDane;
    }

    public String getKldFRezydent() {
        return kldFRezydent;
    }

    public void setKldFRezydent(String kldFRezydent) {
        this.kldFRezydent = kldFRezydent;
    }

    public BigInteger getKldKrId() {
        return kldKrId;
    }

    public void setKldKrId(BigInteger kldKrId) {
        this.kldKrId = kldKrId;
    }

    public Integer getKldFUdostGrupa() {
        return kldFUdostGrupa;
    }

    public void setKldFUdostGrupa(Integer kldFUdostGrupa) {
        this.kldFUdostGrupa = kldFUdostGrupa;
    }

    public String getKldFZgodaNaKoresp() {
        return kldFZgodaNaKoresp;
    }

    public void setKldFZgodaNaKoresp(String kldFZgodaNaKoresp) {
        this.kldFZgodaNaKoresp = kldFZgodaNaKoresp;
    }

    public String getKldFZgodaNaKontakt() {
        return kldFZgodaNaKontakt;
    }

    public void setKldFZgodaNaKontakt(String kldFZgodaNaKontakt) {
        this.kldFZgodaNaKontakt = kldFZgodaNaKontakt;
    }

    public String getKldPrefFormaKontaktu() {
        return kldPrefFormaKontaktu;
    }

    public void setKldPrefFormaKontaktu(String kldPrefFormaKontaktu) {
        this.kldPrefFormaKontaktu = kldPrefFormaKontaktu;
    }

    public String getKldFSprzPrzetwDanych() {
        return kldFSprzPrzetwDanych;
    }

    public void setKldFSprzPrzetwDanych(String kldFSprzPrzetwDanych) {
        this.kldFSprzPrzetwDanych = kldFSprzPrzetwDanych;
    }

    public String getKldDoradca1() {
        return kldDoradca1;
    }

    public void setKldDoradca1(String kldDoradca1) {
        this.kldDoradca1 = kldDoradca1;
    }

    public String getKldDoradca2() {
        return kldDoradca2;
    }

    public void setKldDoradca2(String kldDoradca2) {
        this.kldDoradca2 = kldDoradca2;
    }

    public String getKldDoradca3() {
        return kldDoradca3;
    }

    public void setKldDoradca3(String kldDoradca3) {
        this.kldDoradca3 = kldDoradca3;
    }

    public BigInteger getKldDecyzja() {
        return kldDecyzja;
    }

    public void setKldDecyzja(BigInteger kldDecyzja) {
        this.kldDecyzja = kldDecyzja;
    }

    public String getKldPlec() {
        return kldPlec;
    }

    public void setKldPlec(String kldPlec) {
        this.kldPlec = kldPlec;
    }

    public Short getKldTerminZaplaty() {
        return kldTerminZaplaty;
    }

    public void setKldTerminZaplaty(Short kldTerminZaplaty) {
        this.kldTerminZaplaty = kldTerminZaplaty;
    }

    public Short getKldTerminZaplatyVat() {
        return kldTerminZaplatyVat;
    }

    public void setKldTerminZaplatyVat(Short kldTerminZaplatyVat) {
        this.kldTerminZaplatyVat = kldTerminZaplatyVat;
    }

    public String getKldSposobZaplaty() {
        return kldSposobZaplaty;
    }

    public void setKldSposobZaplaty(String kldSposobZaplaty) {
        this.kldSposobZaplaty = kldSposobZaplaty;
    }

    public String getKldWarunkiZaplaty() {
        return kldWarunkiZaplaty;
    }

    public void setKldWarunkiZaplaty(String kldWarunkiZaplaty) {
        this.kldWarunkiZaplaty = kldWarunkiZaplaty;
    }

    public String getKldPkd() {
        return kldPkd;
    }

    public void setKldPkd(String kldPkd) {
        this.kldPkd = kldPkd;
    }

    public String getKldFKapitalZagr() {
        return kldFKapitalZagr;
    }

    public void setKldFKapitalZagr(String kldFKapitalZagr) {
        this.kldFKapitalZagr = kldFKapitalZagr;
    }

    public String getKldDef6() {
        return kldDef6;
    }

    public void setKldDef6(String kldDef6) {
        this.kldDef6 = kldDef6;
    }

    public String getKldNace() {
        return kldNace;
    }

    public void setKldNace(String kldNace) {
        this.kldNace = kldNace;
    }

    public String getKldIsic() {
        return kldIsic;
    }

    public void setKldIsic(String kldIsic) {
        this.kldIsic = kldIsic;
    }

    public Short getKldWyksztalcenie() {
        return kldWyksztalcenie;
    }

    public void setKldWyksztalcenie(Short kldWyksztalcenie) {
        this.kldWyksztalcenie = kldWyksztalcenie;
    }

    public String getKldStan() {
        return kldStan;
    }

    public void setKldStan(String kldStan) {
        this.kldStan = kldStan;
    }

    public String getKldImie() {
        return kldImie;
    }

    public void setKldImie(String kldImie) {
        this.kldImie = kldImie;
    }

    public String getKldNazwisko() {
        return kldNazwisko;
    }

    public void setKldNazwisko(String kldNazwisko) {
        this.kldNazwisko = kldNazwisko;
    }

    public String getKldNazwiskoDrugie() {
        return kldNazwiskoDrugie;
    }

    public void setKldNazwiskoDrugie(String kldNazwiskoDrugie) {
        this.kldNazwiskoDrugie = kldNazwiskoDrugie;
    }

    public String getKldDrugieImie() {
        return kldDrugieImie;
    }

    public void setKldDrugieImie(String kldDrugieImie) {
        this.kldDrugieImie = kldDrugieImie;
    }

    public String getKldImieMatki() {
        return kldImieMatki;
    }

    public void setKldImieMatki(String kldImieMatki) {
        this.kldImieMatki = kldImieMatki;
    }

    public String getKldImieOjca() {
        return kldImieOjca;
    }

    public void setKldImieOjca(String kldImieOjca) {
        this.kldImieOjca = kldImieOjca;
    }

    public Date getKldDataUrodzenia() {
        return kldDataUrodzenia;
    }

    public void setKldDataUrodzenia(Date kldDataUrodzenia) {
        this.kldDataUrodzenia = kldDataUrodzenia;
    }

    public Date getKldDataZgonu() {
        return kldDataZgonu;
    }

    public void setKldDataZgonu(Date kldDataZgonu) {
        this.kldDataZgonu = kldDataZgonu;
    }

    public String getKldMiejsceUrodzenia() {
        return kldMiejsceUrodzenia;
    }

    public void setKldMiejsceUrodzenia(String kldMiejsceUrodzenia) {
        this.kldMiejsceUrodzenia = kldMiejsceUrodzenia;
    }

    public BigInteger getKldOddzialCis() {
        return kldOddzialCis;
    }

    public void setKldOddzialCis(BigInteger kldOddzialCis) {
        this.kldOddzialCis = kldOddzialCis;
    }

    public String getKldStatusGiodo() {
        return kldStatusGiodo;
    }

    public void setKldStatusGiodo(String kldStatusGiodo) {
        this.kldStatusGiodo = kldStatusGiodo;
    }

    public Long getKldTkId() {
        return kldTkId;
    }

    public void setKldTkId(Long kldTkId) {
        this.kldTkId = kldTkId;
    }

    public String getKldTypKursu() {
        return kldTypKursu;
    }

    public void setKldTypKursu(String kldTypKursu) {
        this.kldTypKursu = kldTypKursu;
    }

    public Long getKldKlKodTkl() {
        return kldKlKodTkl;
    }

    public void setKldKlKodTkl(Long kldKlKodTkl) {
        this.kldKlKodTkl = kldKlKodTkl;
    }

    public String getKldFZwolnionyCert() {
        return kldFZwolnionyCert;
    }

    public void setKldFZwolnionyCert(String kldFZwolnionyCert) {
        this.kldFZwolnionyCert = kldFZwolnionyCert;
    }

    public String getKldFGenerowacWezwania() {
        return kldFGenerowacWezwania;
    }

    public void setKldFGenerowacWezwania(String kldFGenerowacWezwania) {
        this.kldFGenerowacWezwania = kldFGenerowacWezwania;
    }

    public Long getKldOgrnNumer() {
        return kldOgrnNumer;
    }

    public void setKldOgrnNumer(Long kldOgrnNumer) {
        this.kldOgrnNumer = kldOgrnNumer;
    }

    public Date getKldOgrnData() {
        return kldOgrnData;
    }

    public void setKldOgrnData(Date kldOgrnData) {
        this.kldOgrnData = kldOgrnData;
    }

    public String getKldOgrnOrganRej() {
        return kldOgrnOrganRej;
    }

    public void setKldOgrnOrganRej(String kldOgrnOrganRej) {
        this.kldOgrnOrganRej = kldOgrnOrganRej;
    }

    public String getKldFPodejrzany() {
        return kldFPodejrzany;
    }

    public void setKldFPodejrzany(String kldFPodejrzany) {
        this.kldFPodejrzany = kldFPodejrzany;
    }

    public String getKldNazwaReferatuEgzekucji() {
        return kldNazwaReferatuEgzekucji;
    }

    public void setKldNazwaReferatuEgzekucji(String kldNazwaReferatuEgzekucji) {
        this.kldNazwaReferatuEgzekucji = kldNazwaReferatuEgzekucji;
    }

    public String getKldNazwaOrganuEgzekucyjnego() {
        return kldNazwaOrganuEgzekucyjnego;
    }

    public void setKldNazwaOrganuEgzekucyjnego(String kldNazwaOrganuEgzekucyjnego) {
        this.kldNazwaOrganuEgzekucyjnego = kldNazwaOrganuEgzekucyjnego;
    }

    public String getKldNazwaNaWydruki() {
        return kldNazwaNaWydruki;
    }

    public void setKldNazwaNaWydruki(String kldNazwaNaWydruki) {
        this.kldNazwaNaWydruki = kldNazwaNaWydruki;
    }

    public String getKldEfEFaktura() {
        return kldEfEFaktura;
    }

    public void setKldEfEFaktura(String kldEfEFaktura) {
        this.kldEfEFaktura = kldEfEFaktura;
    }

    public Date getKldEfDataWycofania() {
        return kldEfDataWycofania;
    }

    public void setKldEfDataWycofania(Date kldEfDataWycofania) {
        this.kldEfDataWycofania = kldEfDataWycofania;
    }

    public String getKldEfMail() {
        return kldEfMail;
    }

    public void setKldEfMail(String kldEfMail) {
        this.kldEfMail = kldEfMail;
    }

    public Date getKldEfDataZgody() {
        return kldEfDataZgody;
    }

    public void setKldEfDataZgody(Date kldEfDataZgody) {
        this.kldEfDataZgody = kldEfDataZgody;
    }

    public String getKldEfMailCc() {
        return kldEfMailCc;
    }

    public void setKldEfMailCc(String kldEfMailCc) {
        this.kldEfMailCc = kldEfMailCc;
    }
    
}

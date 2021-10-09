import java.sql.Time;
import java.util.Date;

public class Hemsire extends Personel {

	private Kurs Kursu;
	private Date SonGidisZamani;
	public Hemsire(int calisanNo, String adi, String adresi, String telNo, String yakinAkraba, Kurs kursu, Date sonGidisZamani) {
		super(calisanNo, adi, adresi, telNo, yakinAkraba);
		Kursu = kursu;
		SonGidisZamani = sonGidisZamani;
	}
	public String toString(){
		return "Diş Hekimi Bilgisi Calisan No="+getCalisanNo()+" Adi=" + getAdi() + " Adresi=" + getAdi() +" Tel=" + getTelNo() +" Yakin Akraba=" + getYakinAkraba()
				+" Kurs Adı= "+getKursu().getKursAdi()+" Son Gidiş Tarihi= "+getSonGidisZamani().toString();
	}
	public void kursaGit(){
		System.out.println(getAdi()+" Adlı hemşire kursa gitti. Gelecek sene tekrar gidecek.");
		setSonGidisZamani(new Date());
	}

	public Kurs getKursu() {
		return Kursu;
	}

	public void setKursu(Kurs kursu) {
		Kursu = kursu;
	}

	public Date getSonGidisZamani() {
		return SonGidisZamani;
	}

	public void setSonGidisZamani(Date sonGidisZamani) {
		SonGidisZamani = sonGidisZamani;
	}



}
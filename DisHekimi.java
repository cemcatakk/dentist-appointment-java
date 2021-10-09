import java.util.Date;

public class DisHekimi extends Personel {

	private final int KayitNumarasi;
	private final Date KayitNoVerilisTarihi;

	public DisHekimi(int calisanNo, String adi, String adresi, String telNo, String yakinAkraba, int kayitNumarasi, Date kayitNoVerilisTarihi) {
		super(calisanNo, adi, adresi, telNo, yakinAkraba);
		KayitNumarasi = kayitNumarasi;
		KayitNoVerilisTarihi = kayitNoVerilisTarihi;
	}
	@Override
	public String toString(){
		return "Diş Hekimi Bilgisi Calisan No="+getCalisanNo()+" Adi=" + getAdi() + " Adresi=" + getAdresi() +" Tel=" + getTelNo() +" Yakin Akraba=" + getYakinAkraba()
				+" Kayıt Numarası= "+KayitNumarasi+" Veriliş Tarihi= "+KayitNoVerilisTarihi.toString();
	}
	public int getKayitNumarasi() {
		return KayitNumarasi;
	}


	public Date getKayitNoVerilisTarihi() {
		return KayitNoVerilisTarihi;
	}





}
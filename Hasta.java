import java.util.ArrayList;

public class Hasta {

	private int HastaNo;
	private String HastaAdi;
	private String Adres;
	private String Cep;
	private ArrayList Randevular;
	private int kacirilanRandevu;

	public int getKacirilanRandevu() {
		return kacirilanRandevu;
	}

	public void setKacirilanRandevu(int kacirilanRandevu) {
		this.kacirilanRandevu = kacirilanRandevu;
	}

	public Hasta(int hastaNo, String hastaAdi,  String adres, String cep) {
		HastaNo = hastaNo;
		HastaAdi = hastaAdi;
		Adres = adres;
		Cep = cep;
		Randevular = new ArrayList<Randevu>();
		kacirilanRandevu=0;
	}

	public int getHastaNo() {
		return HastaNo;
	}

	public void setHastaNo(int hastaNo) {
		HastaNo = hastaNo;
	}

	public String getHastaAdi() {
		return HastaAdi;
	}

	public void setHastaAdi(String hastaAdi) {
		HastaAdi = hastaAdi;
	}


	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

	public ArrayList getRandevular() {
		return Randevular;
	}

	public void setRandevular(ArrayList randevular) {
		Randevular = randevular;
	}


	@Override
	public String toString() {
		return "Hasta Bilgisi " +
				"HastaNo=" + HastaNo +
				", HastaAdi='" + HastaAdi + '\'' +
				", Adres='" + Adres + '\'' +
				", Cep='" + Cep + '\'' +
				", Randevular=" + Randevular +
				", Kaçırılan Randevular=" + kacirilanRandevu;
	}
}
import java.util.Date;

public class Randevu {

	private Hasta GelecekHasta;
	private DisHekimi AlinanDisHekimi;
	private Date RandevuTarihi;
	private Boolean Geldimi;
	public Randevu(Hasta gelecekHasta, DisHekimi alinanDisHekimi, Date randevuTarihi) {
		GelecekHasta = gelecekHasta;
		AlinanDisHekimi = alinanDisHekimi;
		RandevuTarihi = randevuTarihi;
		Geldimi = false;
	}
	public void sureKontrol(){
		if (!getGeldimi()){
			Date bugun = new Date();
			if (getRandevuTarihi().getDay()-bugun.getDay()<=2){
				this.mesajGonder();
			}
			else if (getRandevuTarihi().getDay()>bugun.getDay()){
				System.out.println("Hasta randevusunu kaçırdı.");
				getGelecekHasta().setKacirilanRandevu(getGelecekHasta().getKacirilanRandevu()+1);
			}
			if (getGelecekHasta().getKacirilanRandevu()>=4){
				System.out.println(getGelecekHasta().getHastaAdi()+" Adlı hastaya çok sayıda randevu kaçırdığı için 100TL para cezası kesildi.");
			}
		}
	}
	public void mesajGonder(){
		System.out.println(this.getGelecekHasta().getHastaAdi()+" Adli kisiye randevuya 2 gün kaldığına dair mesaj gönderildi.");
	}
	public void hastaGeldi(){
		System.out.println(getGelecekHasta().getHastaAdi()+" Adlı hasta "+getRandevuTarihi().toString()+" Tarihli "+getAlinanDisHekimi().getAdi()+" Diş Hekimine olan randevusuna geldi.");
		setGeldimi(true);
	}

	public Hasta getGelecekHasta() {
		return GelecekHasta;
	}

	public void setGelecekHasta(Hasta gelecekHasta) {
		GelecekHasta = gelecekHasta;
	}

	public DisHekimi getAlinanDisHekimi() {
		return AlinanDisHekimi;
	}

	public void setAlinanDisHekimi(DisHekimi alinanDisHekimi) {
		AlinanDisHekimi = alinanDisHekimi;
	}

	public Date getRandevuTarihi() {
		return RandevuTarihi;
	}

	public void setRandevuTarihi(Date randevuTarihi) {
		RandevuTarihi = randevuTarihi;
	}

	public Boolean getGeldimi() {
		return Geldimi;
	}

	public void setGeldimi(Boolean geldimi) {
		Geldimi = geldimi;
	}

	@Override
	public String toString() {
		return "Randevu Bilgisi\nGelecek Hasta=" + GelecekHasta.toString()+ "\n"+
				", Diş Hekimi=" + AlinanDisHekimi.toString() +
				"\n RandevuTarihi=" + RandevuTarihi.toString() +
				"\n Randevuya " + ( Geldimi?"Geldi":"Gelmedi" );
	}
}
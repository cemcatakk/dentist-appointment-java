public class Firma {

	public Firma(String firmaAdi) {
		FirmaAdi = firmaAdi;
	}

	public String getFirmaAdi() {
		return FirmaAdi;
	}

	public void setFirmaAdi(String firmaAdi) {
		FirmaAdi = firmaAdi;
	}

	private String FirmaAdi;


	@Override
	public String toString() {
		return "Firma Adi=" + FirmaAdi+"\n";
	}
}
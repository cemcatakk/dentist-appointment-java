public class Kurs {

	@Override
	public String toString() {
		return "KursAdi= "+ KursAdi;
	}

	public Kurs(String kursAdi) {
		KursAdi = kursAdi;
	}

	public String getKursAdi() {
		return KursAdi;
	}

	public void setKursAdi(String kursAdi) {
		KursAdi = kursAdi;
	}

	private String KursAdi;



}
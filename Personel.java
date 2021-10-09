public class Personel {

	private int CalisanNo;
	private String Adi;
	private String Adresi;
	private String TelNo;
	private String YakinAkraba;

	@Override
	public String toString() {
		return "Personel Bilgisi Calisan No="+CalisanNo+" Adi=" + Adi + " Adresi=" + Adresi +" Tel=" + TelNo +" Yakin Akraba=" + YakinAkraba;
	}

	public Personel(int calisanNo, String adi, String adresi, String telNo, String yakinAkraba) {
		CalisanNo = calisanNo;
		Adi = adi;
		Adresi = adresi;
		TelNo = telNo;
		YakinAkraba = yakinAkraba;
	}

	public int getCalisanNo() {
		return CalisanNo;
	}

	public void setCalisanNo(int calisanNo) {
		CalisanNo = calisanNo;
	}

	public String getAdi() {
		return Adi;
	}

	public void setAdi(String adi) {
		Adi = adi;
	}

	public String getAdresi() {
		return Adresi;
	}

	public void setAdresi(String adresi) {
		Adresi = adresi;
	}

	public String getTelNo() {
		return TelNo;
	}

	public void setTelNo(String telNo) {
		TelNo = telNo;
	}

	public String getYakinAkraba() {
		return YakinAkraba;
	}

	public void setYakinAkraba(String yakinAkraba) {
		YakinAkraba = yakinAkraba;
	}


}
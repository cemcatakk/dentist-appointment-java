import java.util.Date;

public class TedaviKoltugu {

	private final Boolean DeriKaplimi;
	private final Boolean Ortopedikmi;
	private final Firma UreticiFirma;
	private  final int UretimNo;
	private final Date UretimTarihi;
	private Boolean KanalTedavisi;
	private Boolean DistasiTemizligi;
	private Boolean DisCekimi;
	private Boolean GenelMuayene;
	private Boolean Muzik;

	public TedaviKoltugu(Firma ureticiFirma, int uretimNo, Date uretimTarihi, Boolean kanalTedavisi, Boolean distasiTemizligi, Boolean disCekimi, Boolean genelMuayene, Boolean muzik) {
		DeriKaplimi = true;
		Ortopedikmi = true;
		UreticiFirma = ureticiFirma;
		UretimNo = uretimNo;
		UretimTarihi = uretimTarihi;
		KanalTedavisi = kanalTedavisi;
		DistasiTemizligi = distasiTemizligi;
		DisCekimi = disCekimi;
		GenelMuayene = genelMuayene;
		Muzik = muzik;
	}

	public Boolean getDeriKaplimi() {
		return DeriKaplimi;
	}


	public Boolean getOrtopedikmi() {
		return Ortopedikmi;
	}


	public Firma getUreticiFirma() {
		return UreticiFirma;
	}
	public int getUretimNo() {
		return UretimNo;
	}
	public Date getUretimTarihi() {
		return UretimTarihi;
	}


	public Boolean getKanalTedavisi() {
		return KanalTedavisi;
	}

	public void setKanalTedavisi(Boolean kanalTedavisi) {
		KanalTedavisi = kanalTedavisi;
	}

	public Boolean getDistasiTemizligi() {
		return DistasiTemizligi;
	}

	public void setDistasiTemizligi(Boolean distasiTemizligi) {
		DistasiTemizligi = distasiTemizligi;
	}

	public Boolean getDisCekimi() {
		return DisCekimi;
	}

	public void setDisCekimi(Boolean disCekimi) {
		DisCekimi = disCekimi;
	}

	public Boolean getGenelMuayene() {
		return GenelMuayene;
	}

	public void setGenelMuayene(Boolean genelMuayene) {
		GenelMuayene = genelMuayene;
	}

	public Boolean getMuzik() {
		return Muzik;
	}

	public void setMuzik(Boolean muzik) {
		Muzik = muzik;
	}


	@Override
	public String toString() {
		String str=  "Tedavi Koltugu " +
				"Deri Kaplimi=" + DeriKaplimi +
				", Ortopedikmi=" + Ortopedikmi +
				", Uretici Firma=" + UreticiFirma +
				", Uretim No=" + UretimNo +
				", Uretim Tarihi=" + UretimTarihi +
				", Kanal Tedavisi=" + KanalTedavisi +
				", Distasi Temizligi=" + DistasiTemizligi +
				", Dis Cekimi=" + DisCekimi +
				", Genel Muayene=" + GenelMuayene +
				", Muzik=" + Muzik;
		str.replace("true","Evet");
		str.replace("false","Hayır");
		return str;
	}
}
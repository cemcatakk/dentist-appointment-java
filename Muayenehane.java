import java.util.ArrayList;
import java.util.Date;

public class Muayenehane {

	private ArrayList<TedaviKoltugu> Koltuklar;
	private ArrayList<Hasta> hastalar;

	public Muayenehane() {
		Koltuklar = new ArrayList<TedaviKoltugu>();
		hastalar = new ArrayList<Hasta>();
	}
	public ArrayList<Hasta> getHastalar() {
		return hastalar;
	}
	public void koltukEkle(String firmaAdi, int uretimNo, Date uretimTarihi,boolean kanalTedavisi,boolean distasiTemizligi,boolean disCekimi,boolean muzik){
		Koltuklar.add(new TedaviKoltugu(new Firma(firmaAdi),uretimNo,uretimTarihi,kanalTedavisi,distasiTemizligi,disCekimi,true,muzik));
	}
	public void randevuKabulEt(Hasta hasta){
		hastalar.add(hasta);
	}
	public void setHastalar(ArrayList<Hasta> hastalar) {
		this.hastalar = hastalar;
	}

	public ArrayList getKoltuklar() {
		return Koltuklar;
	}

	public void setKoltuklar(ArrayList koltuklar) {
		Koltuklar = koltuklar;
	}

	@Override
	public String toString() {
		String str="Muayenehane bilgisi=\n";
		for (TedaviKoltugu k:Koltuklar){
			str+=k.toString()+"\n";
		}
		for (Hasta h: hastalar){
			str+=h.toString()+"\n";
		}
		return str;
	}
}
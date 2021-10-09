import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Sistem {

	private ArrayList<Personel> Personeller;
	private ArrayList<Hasta> Hastalar;
	private ArrayList<Muayenehane> MuayeneHaneler;
	private ArrayList<Randevu> Randevular;



	public Sistem() {
		Personeller = new ArrayList<Personel>();
		Hastalar = new ArrayList<Hasta>();
		MuayeneHaneler = new ArrayList<Muayenehane>();
		Randevular = new ArrayList<Randevu>();
	}
	public void Baslat(){
		this.DisHekimiEkle(1234,"Ahmet Şefik","İzmir","555 145 3652","Gül Şefik",5847693,new Date());
		this.DisHekimiEkle(5842,"Melek Kaya","İstanbul","507 855 3641","Talat Kaya",8512254,new Date());
		MuayenehaneEkle();
		HastaEkle("Kubilay Cenk","Kastamonu","505 452 1125");
		HastaEkle("Ayşe Çalık","Adıyaman","550 665 2145");
		Personeller.add(new Hemsire(9845,"Gül Bostan","İzmir","553 251 4585","Mehmet",new Kurs("A Kursu"),new Date()));
		Personeller.add(new Hizmetli(8547,"Fatma Ermiş","İstanbul","504 114 3648","Şefik"));
		personelleriYazdir();
		HastalariYazdir();
		MuayeneHaneleriYazdir();
		RandevuEkle();
		Randevular.get(0).sureKontrol();
		Randevular.get(0).hastaGeldi();
		randevuIstatistikler();


	}
	public void HastalariYazdir(){
		for (Hasta h: Hastalar){
			System.out.println(h.toString());
		}
	}
	public void MuayeneHaneleriYazdir(){
		for (Muayenehane m:MuayeneHaneler){
			System.out.println(m.toString());
		}
	}
	public void RandevuEkle(){
		Randevular.add(new Randevu((Hasta)getHastalar().get(0),(DisHekimi)Personeller.get(0),new Date()));
		Randevular.add(new Randevu((Hasta)getHastalar().get(1),(DisHekimi)Personeller.get(1),new Date()));
	}
	public void personelleriYazdir(){
		System.out.println("---Personel Bilgileri---");
		for (Personel p:Personeller){
			System.out.println(p.toString());
		}
	}
	public void randevuIstatistikler(){
		System.out.println("---Randevu Bilgileri---");
		for (Randevu r:Randevular){
			System.out.println(r.toString());
		}
	}

	public void DisHekimiEkle(int calisanNo, String adi, String adresi, String telNo, String yakinAkraba, int kayitNumarasi, Date verilisTarihi){
	Personeller.add(new DisHekimi(calisanNo,adi,adresi,telNo,yakinAkraba,kayitNumarasi,verilisTarihi));
	}
	public void MuayenehaneEkle(){
		Muayenehane m1 = new Muayenehane();
		m1.koltukEkle("A",1258,new Date(),true,false,false,true);
		m1.koltukEkle("B",1524,new Date(),true,false,false,true);
		m1.koltukEkle("C",1123,new Date(),false,true,true,false);
		MuayeneHaneler.add(m1);
	}
	public void HastaEkle(String hastaAdi,String adres,String cep){
		int hastaNo;
		Random rnd = new Random();
		hastaNo = rnd.nextInt(8999999)+1000000;
		getHastalar().add(new Hasta(hastaNo,hastaAdi,adres,cep));
	}
	public int hastaSayisi(){
		int sayac=0;
		for (Muayenehane muayenehane:MuayeneHaneler){
			sayac+=muayenehane.getHastalar().size();
		}
		return sayac;
	}

	public ArrayList<Randevu> getRandevular() {
		return Randevular;
	}

	public void setRandevular(ArrayList<Randevu> randevular) {
		Randevular = randevular;
	}
	public ArrayList getPersoneller() {
		return Personeller;
	}

	public void setPersoneller(ArrayList<Personel> personeller) {
		Personeller = personeller;
	}

	public ArrayList getHastalar() {
		return Hastalar;
	}

	public void setHastalar(ArrayList<Hasta> hastalar) {
		Hastalar = hastalar;
	}

	public ArrayList getMuayeneHaneler() {
		return MuayeneHaneler;
	}

	public void setMuayeneHaneler(ArrayList<Muayenehane> muayeneHaneler) {
		MuayeneHaneler = muayeneHaneler;
	}
}
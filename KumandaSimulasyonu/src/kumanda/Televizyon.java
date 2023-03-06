package kumanda;

import java.util.ArrayList;

public class Televizyon {
	private String marka;
	private String boyut;
	private ArrayList<Kanal> kanallar;

	public void kanallarıOlustur() {

		HaberKanali kanal1 = new HaberKanali("Uçankuş", 1, "Magazin");
		HaberKanali kanal3 = new HaberKanali("BloombergHT", 2, "Borsa");
		MuzikKanali kanal2 = new MuzikKanali("NR1", 3, "Müzik");
		MuzikKanali kanal4 = new MuzikKanali("PowerTurk", 4, "Müzik");
		MuzikKanali kanal5 = new MuzikKanali("kralpop", 5, "müzik");
		
		kanallar.add(kanal1);
		kanallar.add(kanal2);
		kanallar.add(kanal3);
		kanallar.add(kanal4);
		kanallar.add(kanal5);

	}

	public void tumKanallariGoster() {
	    for (int i = 0; i < kanallar.size(); i++) {
	        System.out.println("Kanal adı: " + kanallar.get(i).getKanalAdi() + " Kanal no:" + kanallar.get(i).getKanalNo());
	    }
	}
	
	

	public Televizyon(String marka, String boyut) {
		super();
		this.marka = marka;
		this.boyut = boyut;
		kanallar = new ArrayList<Kanal>();
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanallar() {
		return kanallar;
	}

	public void setKanallar(ArrayList<Kanal> kanallar) {
		this.kanallar = kanallar;
	}

	public void gosterKanal(int kanalNo) {
		 Kanal kanal = kanallar.get(kanalNo - 1);
		 System.out.println("Kanal adı: " + kanallar.get(kanalNo-1).getKanalAdi() + " Kanal no:" + kanallar.get(kanalNo-1).getKanalNo());
		
	}
}

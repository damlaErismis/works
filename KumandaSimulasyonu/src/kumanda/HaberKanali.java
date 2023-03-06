package kumanda;

public class HaberKanali extends Kanal{
	private String haberTuru;

	public HaberKanali(String kanalAdi, int kanalNo, String haberTuru) {
		super(kanalAdi, kanalNo);
		this.haberTuru = haberTuru;

	}

	public String getHaberTuru() {
		return haberTuru;
	}

	public void setHaberTuru(String haberTuru) {
		this.haberTuru = haberTuru;
	}
}

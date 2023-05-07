package project1.multimedia;

public class Immagine extends ElementoMultimediale implements brightness {
	private int bright = 3;

	public Immagine(String fileType, String title) {
		super(fileType, title, false);
		setBright(bright);
	}

	public Immagine(String fileType, String title, int bright) {
		super(fileType, title, false);
		setBright(bright);

	}

	public int getBright() {
		return bright;
	}

	public void setBright(int bright) {
		this.bright = bright;
	}

	@Override
	public void esegui() {
		brightness.show(getTitle(), getBright());
	};

}

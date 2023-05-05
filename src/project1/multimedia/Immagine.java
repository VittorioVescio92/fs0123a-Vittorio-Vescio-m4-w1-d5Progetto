package project1.multimedia;

public class Immagine extends ElementoMultimediale implements brightness {
	private int bright = 3;

	public Immagine(String fileType, String title) {
		super(fileType, title, false);
		setbright(bright);
	}

	public Immagine(String fileType, String title, int bright) {
		super(fileType, title, false);
		setbright(bright);

	}

	public int getbright() {
		return bright;
	}

	public void setbright(int bright) {
		this.bright = bright;
	}

	@Override
	public void esegui() {
		brightness.show(getTitle(), getbright());
	};

}

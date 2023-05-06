package project1.multimedia;

public class Video extends ElementoMultimediale implements Playable, brightness {
	private int volume = 5;
	private int duration = 3;
	private int bright = 3;

	public Video(String fileType, String title) {
		super(fileType, title, true);
		setDuration(duration);
		setBrightness(bright);
	}

	public Video(String fileType, String title, int duration) {
		super(fileType, title, true);
		setDuration(duration);
		setBrightness(duration);
	}

	public Video(String fileType, String title, int duration, int brightness) {
		super(fileType, title, true);
		setDuration(duration);
		setBrightness(brightness);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getBrightness() {
		return bright;
	}

	public void setBrightness(int brightness) {
		this.bright = brightness;
	}

	public void volumeUp() {
		volume = Playable.volumeUp(volume);
		System.out.println("Volume alzato a " + volume);
	}

	public void volumeDown() {
		volume = Playable.volumeDown(volume);
		System.out.println("Volume abbassato a " + volume);
	}

	@Override
	public void esegui() {
		Playable.play(getDuration(), getTitle(), getVolume(), brightness.show(getBrightness()));
	};

}

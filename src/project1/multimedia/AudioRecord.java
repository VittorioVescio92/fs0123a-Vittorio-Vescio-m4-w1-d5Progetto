package project1.multimedia;

public class AudioRecord extends ElementoMultimediale implements Playable {

	private int volume = 5;
	private int duration = 3;

	public AudioRecord(String fileType, String title) {
		super(fileType, title, true);
		setDuration(duration);
	}

	public AudioRecord(String fileType, String title, int duration) {
		super(fileType, title, true);
		setDuration(duration);
	}

	public AudioRecord(String fileType, String title, int duration, int volume) {
		super(fileType, title, true);
		setDuration(duration);
		setVolume(volume);
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

	@Override
	public void esegui() {
		Playable.play(getDuration(), getTitle(), getVolume());
	};

}

package project1.multimedia;

public abstract class ElementoMultimediale {
	private String fileType;
	private String title;
	private boolean playable;

	public ElementoMultimediale(String fileType, String title, boolean playable) {
		setFileType(fileType);
		setTitle(title);
		setPlayable(playable);
	}

	public void esegui() {
	};

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isPlayable() {
		return playable;
	}

	public void setPlayable(boolean playable) {
		this.playable = playable;
	}

}
package project1.multimedia;

public interface Playable {

	public static void play(int durata, String title, int volume) {

		for (int i = 0; i < durata; i++) {
			System.out.println(title + " " + printVol(volume));
		}
	}

	public static void play(int durata, String title, int volume, String luminosità) {

		for (int i = 0; i < durata; i++) {
			System.out.println(title + " " + printVol(volume) + luminosità);
		}

	}

	private static String printVol(int volume) {
		String vol = "";
		for (int i = 0; i < volume; i++) {
			vol += "!";
		}
		return vol;
	}

	public static int volumeUp(int volume) {
		return volume++;
	}

	public static int volumeDown(int volume) {
		return volume--;
	}

}

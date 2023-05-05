package project1.multimedia;

public interface brightness {

	public static void show(String title, int brightness) {
		System.out.println(title + " " + printBright(brightness));

	}

	public static String show(int brightness) {
		return " " + printBright(brightness);

	}

	public static String printBright(int brightness) {
		String bright = "";
		for (int i = 0; i < brightness; i++) {
			bright += "*";
		}
		return bright;
	}

	public static void brightnessUp() {
	}

	public static void brightnessDown() {
	}
}

package project1;

import java.util.Scanner;

import project1.multimedia.AudioRecord;
import project1.multimedia.ElementoMultimediale;
import project1.multimedia.Immagine;
import project1.multimedia.Video;

public class Main {

	public static void main(String[] args) {
		Scanner multimediaScan = new Scanner(System.in);
		System.out.println("Inserisci 5 elementi multimediali");

		ElementoMultimediale[] medias = new ElementoMultimediale[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("L'elemento " + (i + 1) + " sarà un video, audio o immagine?");
			String mediaType = multimediaScan.nextLine();

			System.out.println("Inserisci il titolo del " + (i + 1) + "° elemento");
			String mediaTitle = multimediaScan.nextLine();

			if (mediaType.toLowerCase().equals("video")) {
				Video video = new Video(mediaType, mediaTitle);
				medias[i] = video;
			} else if (mediaType.toLowerCase().equals("audio")) {
				AudioRecord audio = new AudioRecord(mediaType, mediaTitle);
				medias[i] = audio;
			} else if (mediaType.toLowerCase().equals("immagine")) {
				Immagine immagine = new Immagine(mediaType, mediaTitle);
				medias[i] = immagine;
			} else {
				System.out.println("Tipo di file non supportato!");
				i--;
			}
		}

		int selected = -1;
		while (selected != 0) {
			System.out.println("Inserisci il numero dell'elemento da riprodurre (0 per uscire)");
			selected = multimediaScan.nextInt();
			multimediaScan.nextLine();

			if (selected == 0) {
				break;
			} else if (selected > 0 && selected <= 5) {
				ElementoMultimediale media = medias[selected - 1];
				if (media instanceof AudioRecord) {
					System.out.println("A che volume vuoi ascoltarlo? (da 1 a 10)");
					int volume = multimediaScan.nextInt();
					multimediaScan.nextLine();
					((AudioRecord) media).setVolume(volume);
				} else if (media instanceof Video) {
					System.out.println("A che volume vuoi ascoltarlo? (da 1 a 10)");
					int volume = multimediaScan.nextInt();
					multimediaScan.nextLine();
					((Video) media).setVolume(volume);
					System.out.println("A quanto vuoi impostare la luminosità? (da 1 a 10)");
					int bright = multimediaScan.nextInt();
					multimediaScan.nextLine();
					((Video) media).setBrightness(bright);
				} else if (media instanceof Immagine) {
					System.out.println("A quanto vuoi ? (da 1 a 10)");
					int bright = multimediaScan.nextInt();
					multimediaScan.nextLine();
					((Immagine) media).setBright(bright);
				}
				media.esegui();
			} else {
				System.out.println("Elemento multimediale non presente!");
			}

		}
		multimediaScan.close();
	}
}

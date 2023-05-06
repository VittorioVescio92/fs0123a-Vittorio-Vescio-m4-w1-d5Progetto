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
			System.out.println("Inserisci il tipo di file del " + (i + 1) + "° elemento (video, immagine o audio)");
			String mediaType = multimediaScan.nextLine();

			System.out.println("Inserisci il titolo del " + (i + 1) + "° elemento");
			String mediaTitle = multimediaScan.nextLine();

			if (mediaType.equalsIgnoreCase("video")) {
				Video video = new Video(mediaType, mediaTitle);
				medias[i] = video;
			} else if (mediaType.equalsIgnoreCase("audio")) {
				AudioRecord audio = new AudioRecord(mediaType, mediaTitle);
				medias[i] = audio;
			} else if (mediaType.equalsIgnoreCase("immagine")) {
				Immagine immagine = new Immagine(mediaType, mediaTitle);
				medias[i] = immagine;
			} else {
				System.out.println("File non supportato!");
				i--;
			}
		}

		int choice = -1;
		while (choice != 0) {
			System.out.println("Inserisci il numero dell'elemento da eseguire (0 per uscire)");
			choice = multimediaScan.nextInt();
			multimediaScan.nextLine();

			if (choice > 0 && choice <= 5) {
				ElementoMultimediale media = medias[choice - 1];
//				if (media.getFileType().equals("video") || media.getFileType().equals("audio")) {
//					System.out.println("elemento multimediale selezionato in riproduzione con volume "
//							+ (media.getVolume())
//							+ ", se vuoi alzarlo premi +, per abbassarlo premi -, per andare avanti digita '.'");
//					String volChoice = multimediaScan.nextLine();
//					if (volChoice.equals("+")) {
//						media.setVolume(media.getVolume() + 1);
//					} else if (volChoice.equals("-")) {
//						media.setVolume(media.getVolume() - 1);
//					}
				if (media != null) {
					media.esegui();
				} else {
					System.out.println("Elemento multimediale non presente!");
				}
			} else if (choice != 0) {
				System.out.println("Scelta non valida!");
			}
		}
		System.out.println("Arrivederci e grazie per averci preferito!");
		multimediaScan.close();
	}
}

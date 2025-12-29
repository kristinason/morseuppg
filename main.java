package textcounter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MorseTranslator translator = new MorseTranslator();

        System.out.println("Välj ett alternativ:");
        System.out.println("1. Text till morsekod");
        System.out.println("2. Morsekod till text");
        System.out.print("Ditt val: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // rensa radbrytning

        try {
            if (choice == 1) {
                System.out.print("Skriv text (A-Z och mellanslag): ");
                String text = scanner.nextLine();
                String morse = translator.textToMorse(text);
                System.out.println("Morsekod: " + morse);

            } else if (choice == 2) {
                System.out.print("Skriv morsekod (mellanslag mellan varje bokstav): ");
                String morse = scanner.nextLine();
                String text = translator.morseToText(morse);
                System.out.println("Text: " + text);

            } else {
                System.out.println("Ogiltigt val. Avslutar programmet.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

        scanner.close();
    }
}

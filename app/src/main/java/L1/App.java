package L1;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {

        System.out.print("Hello, what is your name? ");

        String value = input.nextLine().toUpperCase();

        String[][] letters = new String[value.length()][];

        for (int i = 0; i < value.length(); i++) {
            letters[i] = AsciiAlphabet.getLetter(value.charAt(i));
        }

        for (int row = 0; row < 8; row++) {
            for (int letter = 0; letter < letters.length; letter++) {
                System.out.printf("%-15s", letters[letter][row]);
            }
            System.out.println();
        }
    }
}
package L1;

import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {

        System.out.print("Hello, what is your name? ");

        String value = input.nextLine();

        String[][] letters = new String[value.length()][];

        for (int i = 0; i < value.length(); i++) {
            letters[i] = AsciiAlphabet.getLetter(value.charAt(i));
        }
        
        for (int row = 0; row < AsciiAlphabet.LETTER_HEIGHT; row++) {

          StringBuilder line = new StringBuilder();

          for (String[] letter : letters) {
            line.append(letter[row]).append("  ");
          }

          System.out.println(line.toString());
        }
    }
}
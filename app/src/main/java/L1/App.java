package L1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Creates an ASCII art of the users name and prints it out.
 * 
 * @author Mattias Mellin <mm225vh@student.lnu.se> <mattias.mellin@gmail.com>
 */
public class App {

    private static Scanner input = new Scanner(System.in, "UTF-8");

    private static String welcomeMessage = "Welcome back";

    /**
     * Main method to run the application.
     *
     * @param args Command line arguments - not used.
     */
    public static void main(String[] args) {

        System.out.print("Hello, what is your name? ");
        String userInput = input.nextLine();

        ArrayList<String> values = new ArrayList<>();
        values.add(welcomeMessage);
        values.add(userInput);

        for (String value : values) {

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
}
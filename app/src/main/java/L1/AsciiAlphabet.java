package L1;

public class AsciiAlphabet {

  // Number of lines each letter is rendered with.
  public static final int LETTER_HEIGHT = 11;

  // Minimum width used when normalizing letters.
  public static final int BLANK_WIDTH = 6;


  /**
  * Gets a letter based on its ASCII code and normalizes it.
  *
  * @param ascii the ASCII code of the letter
  * @return the normalized letter
  */
  public static String[] getLetter(int ascii) {

      String[] letter = getRawLetter(ascii);

      return normalize(letter);
  }


  /**
   * Normalizes a letter to the required height and width.
   * Missing rows are filled with spaces, and shorter rows
   * are padded to match the widest row.
   *
   * @param letter the raw letter
   * @return the normalized letter
   */
  private static String[] normalize(String[] letter) {

      int width = BLANK_WIDTH;

      // Check each row in the letter.
      for (String line : letter) {

        // Use the longest row as the required width.
          if (line.length() > width) {
              width = line.length();
          }
      }

      // Create a new array with the correct height.
      String[] result = new String[LETTER_HEIGHT];

      for (int row = 0; row < LETTER_HEIGHT; row++) {

          String line = "";

          // Get the current row if it exists.
          if (row < letter.length) {
              line = letter[row];
          }

          // Add spaces to the end of the row until it reaches the required width.
          result[row] = padRight(line, width);
      }

      return result;
  }

  /**
   * Adds spaces to the end of a string until it reaches the given width.
   *
   * @param newString the string to pad
   * @param width the required width
   * @return the padded string
   */
  private static String padRight(String string, int width) {
    StringBuilder newString = new StringBuilder(string);

    while (newString.length() < width) {
      newString.append(' ');
    }

    return newString.toString();
  }

  /**
   * Returns the raw ASCII representation for the given ASCII code.
   *
   * @param ascii the ASCII code of the character
   * @return the raw character representation
   */
  public static String[] getRawLetter(int ascii) {

    switch (ascii) {
      case 32:
        return new String [] {
          "        ",
          "        ",
          "        ",
          "        ",
          "        ",
          "        ",
          "        ",
          "        ",
        };
      case 65: // A
        return new String[] {
          " $$$$$$\\",
          "$$  __$$\\",
          "$$ /  $$ |",
          "$$$$$$$$ |",
          "$$  __$$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|"
        };
      case 66: // B
        return new String[] {
          "$$$$$$$\\",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$$$$$$\\/",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "\\_______/ "
        };
      case 67: // C
        return new String[] {
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /   \\_|",
          "$$ |      ",
          "$$ |      ",
          "$$ |  $$\\ ",
          "\\$$$$$$  |",
          " \\______/"
        };
      case 68: // D
        return new String[] {
          "$$$$$$$\\",
          "$$  __$$\\",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "\\_______/"
        };
      case 69: // E
        return new String[] {
          "$$$$$$$$\\",
          "$$  _____|",
          "$$ |",
          "$$$$$\\",
          "$$  __|",
          "$$ |",
          "$$$$$$$$\\",
          "\\________|"
        };
      case 70: // F
        return new String[] {
          "$$$$$$$$\\",
          "$$  _____|",
          "$$ |",
          "$$$$$\\",
          "$$  __|",
          "$$ |",
          "$$ |",
          "\\__|"
        };
      case 71: // G
        return new String[] {
          " $$$$$$\\",
          "$$  __$$\\",
          "$$ /  \\__|",
          "$$ |$$$$\\",
          "$$ |\\_$$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 72: // H
        return new String[] {
          "$$\\   $$\\",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$$$$$$$ |",
          "$$  __$$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|"
        };
      case 73: // I
        return new String[] {
          "$$$$$$$\\",
          "\\_$$ __|",
          "  $$ |",
          "  $$ |",
          "  $$ |",
          "  $$ |",
          "$$$$$$\\",
          "\\______|"
        };
      case 74: // J
        return new String[] {
          "   $$$$$\\ ",
          "   \\__$$ |",
          "      $$ |",
          "      $$ |",
          "$$\\   $$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/"
        };
      case 75: // K
        return new String[] {
          "$$\\   $$\\ ",
          "$$ | $$  |",
          "$$ |$$  / ",
          "$$$$$  /  ",
          "$$  $$<   ",
          "$$ |\\$$\\  ",
          "$$ | \\$$\\ ",
          "\\__|  \\__|"
        };
      case 76: // L
        return new String[] {
          "$$\\",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$$$$$$$\\",
          "\\________|"
        };
      case 77: // M
        return new String[] {
          "$$\\      $$\\ ",
          "$$$\\    $$$ |",
          "$$$$\\  $$$$ |",
          "$$\\$$\\$$ $$ |",
          "$$ \\$$$  $$ |",
          "$$ |\\$  /$$ |",
          "$$ | \\_/ $$ |",
          "\\__|     \\__|"
        };
      case 78: // N
        return new String[] {
          "$$\\   $$\\ ",
          "$$$\\  $$ |",
          "$$$$\\ $$ |",
          "$$ $$\\$$ |",
          "$$ \\$$$$ |",
          "$$ |\\$$$ |",
          "$$ | \\$$ |",
          "\\__|  \\__|"
        };
      case 79: // O
        return new String[] {
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 80: // P
        return new String[] {
          "$$$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "$$  ____/ ",
          "$$ |      ",
          "$$ |      ",
          "\\__|      "
        };
      case 81: // Q
        return new String[] {
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$$ |",
          " \\____$$ |",
          "      \\__|"
        };
      case 82: // R
        return new String[] {
          "$$$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "$$  __$$< ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|"
        };
      case 83: // S
        return new String[] {
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$/  \\__|",
          "\\$$$$$$\\  ",
          " \\____$$\\ ",
          "$$\\   $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 84: // T
        return new String[] {
          "$$$$$$$$\\",
          "\\__$$ __|",
          "   $$ |",
          "   $$ |",
          "   $$ |",
          "   $$ |",
          "   $$ |",
          "   \\__|"
        };
      case 85: // U
        return new String[] {
          "$$\\   $$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 86: // V
        return new String[] {
          "$$\\      $$\\ ",
          "$$ |     $$ |",
          "$$ |     $$ |",
          "\\$$\\    $$  |",
          " \\$$\\  $$  / ",
          "  \\$$\\$$  /  ",
          "   \\$$$  /   ",
          "    \\$  /    "
        };
      case 87: // W
        return new String[] {
          "$$\\      $$\\ ",
          "$$ |     $$ |",
          "$$ |     $$ |",
          "$$ |     $$ |",
          "$$ |     $$ |",
          "$$ |     $$ |",
          "\\$$\\   $$  |",
          " \\$$$$$$  / "
        };
      case 88: // X
        return new String[] {
          "$$\\   $$\\ ",
          "\\$$\\ $$  |",
          " \\$$$$  / ",
          " $$  $$<  ",
          "$$  /\\$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|"
        };
      case 89: // Y
        return new String[] {
          "$$\\     $$\\ ",
          "\\$$\\   $$  |",
          " \\$$\\ $$  / ",
          "  \\$$$$  /  ",
          "   \\$$  /   ",
          "    $$ |    ",
          "    $$ |    ",
          "    \\__|    "
        };
      case 90: // Z
        return new String[] {
          "$$$$$$$$$$\\ ",
          "\\_____$$  |",
          "      $$  / ",
          "     $$  /  ",
          "    $$  /   ",
          "   $$  /    ",
          " $$$$$$$$\\    ",
          "\\_________|    "
        };
      case 97:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          " \\____$$\\ ",
          " $$$$$$$ |",
          "$$  __$$ |",
          "\\$$$$$$$ |",
          " \\_______|",
          "          ",
          "          ",
          "          "
        };
      case 98:
        return new String[] {
          "$$\\       ",
          "$$ |      ",
          "$$$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "\\_______/ ",
          "          ",
          "          ",
          "          "
        };
      case 99:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$$\\ ",
          "$$  _____|",
          "$$ /      ",
          "$$ |      ",
          "\\$$$$$$$\\ ",
          " \\_______|",
          "          ",
          "          ",
          "          "
        };
      case 100:
        return new String[] {
          "      $$\\ ",
          "      $$ |",
          " $$$$$$$ |",
          "$$  __$$ |",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$$ |",
          " \\_______|",
          "          ",
          "          ",
          "          "
        };
      case 101:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$$$$$$$ |",
          "$$   ____|",
          "\\$$$$$$$\\ ",
          " \\_______|",
          "          ",
          "          ",
          "          "
        };
      case 102:
        return new String[] {
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  \\__|",
          "$$$$\\     ",
          "$$  _|    ",
          "$$ |      ",
          "$$ |      ",
          "\\__|      ",
          "          ",
          "          ",
          "          "
        };
      case 103:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$$ |",
          " \\____$$ |",
          "$$\\   $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 104:
        return new String[] {
          "$$\\       ",
          "$$ |      ",
          "$$$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|",
          "          ",
          "          ",
          "          "
        };
      case 105:
        return new String[] {
          "$$\\ ",
          "\\__|",
          "$$\\ ",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "\\__|",
          "    ",
          "    ",
          "    "
        };
      case 106:
        return new String[] {
          "          ",
          "          ",
          "      $$\\ ",
          "      \\__|",
          "      $$\\ ",
          "      $$ |",
          "      $$ |",
          "      $$ |",
          "$$\\   $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 107:
        return new String[] {
          "$$\\       ",
          "$$ |      ",
          "$$ |  $$\\ ",
          "$$ | $$  |",
          "$$$$$$  / ",
          "$$  _$$<  ",
          "$$ | \\$$\\ ",
          "\\__|  \\__|",
          "          ",
          "          ",
          "          "
        };
      case 108:
        return new String[] {
          "$$\\ ",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "$$ |",
          "\\__|",
          "    ",
          "    ",
          "    "
        };
      case 109:
        return new String[] {
          "              ",
          "              ",
          "$$$$$$\\$$$$\\  ",
          "$$  _$$  _$$\\ ",
          "$$ / $$ / $$ |",
          "$$ | $$ | $$ |",
          "$$ | $$ | $$ |",
          "\\__| \\__| \\__|",
          "              ",
          "              ",
          "              "
        };
      case 110:
        return new String[] {
          "          ",
          "          ",
          "$$$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\__|  \\__|",
          "          ",
          "          ",
          "          "
        };
      case 111:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/ ",
          "          ",
          "          ",
          "          "
        };
      case 112:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "$$$$$$$  |",
          "$$  ____/ ",
          "$$ |      ",
          "$$ |      ",
          "\\__|      "
        };
      case 113:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ /  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$$ |",
          " \\____$$ |",
          "      $$ |",
          "      $$ |",
          "      \\__|"
        };
      case 114:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$\\  ",
          "$$  __$$\\ ",
          "$$ |  \\__|",
          "$$ |      ",
          "$$ |      ",
          "\\__|      ",
          "          ",
          "          ",
          "          "
        };
      case 115:
        return new String[] {
          "          ",
          "          ",
          " $$$$$$$\\ ",
          "$$  _____|",
          "\\$$$$$$\\  ",
          " \\____$$\\ ",
          "$$$$$$$  |",
          "\\_______/ ",
          "          ",
          "          ",
          "          "
        };
      case 116:
        return new String[] {
          "  $$\\     ",
          "  $$ |    ",
          "$$$$$$\\   ",
          "\\_$$  _|  ",
          "  $$ |    ",
          "  $$ |$$\\ ",
          "  \\$$$$  |",
          "   \\____/ ",
          "          ",
          "          ",
          "          "
        };
      case 117:
        return new String[] {
          "          ",
          "          ",
          "$$\\   $$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$  |",
          " \\______/ ",
          "          ",
          "          ",
          "          "
        };
      case 118:
        return new String[] {
          "           ",
          "           ",
          "$$\\    $$\\ ",
          "\\$$\\  $$  |",
          " \\$$\\$$  / ",
          "  \\$$$  /  ",
          "   \\$  /   ",
          "    \\_/    ",
          "           ",
          "           ",
          "           "
        };
      case 119:
        return new String[] {
          "              ",
          "              ",
          "$$\\  $$\\  $$\\ ",
          "$$ | $$ | $$ |",
          "$$ | $$ | $$ |",
          "$$ | $$ | $$ |",
          "\\$$$$$\\$$$$  |",
          " \\_____\\____/ ",
          "              ",
          "              ",
          "              "
        };
      case 120:
        return new String[] {
          "          ",
          "          ",
          "$$\\   $$\\ ",
          "\\$$\\ $$  |",
          " \\$$$$  / ",
          " $$  $$<  ",
          "$$  /\\$$\\ ",
          "\\__/  \\__|",
          "          ",
          "          ",
          "          "
        };
      case 121:
        return new String[] {
          "          ",
          "          ",
          "$$\\   $$\\ ",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "$$ |  $$ |",
          "\\$$$$$$$ |",
          " \\____$$ |",
          "$$\\   $$ |",
          "\\$$$$$$  |",
          " \\______/ "
        };
      case 122:
        return new String[] {
          "          ",
          "          ",
          "$$$$$$$$\\ ",
          "\\____$$  |",
          "  $$$$ _/ ",
          " $$  _/   ",
          "$$$$$$$$\\ ",
          "\\________|",
          "          ",
          "          ",
          "          "
        };
      default:
        return new String[] {};
    }
  }
}
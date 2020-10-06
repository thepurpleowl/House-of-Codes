
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    scanner.nextLine();

    final String firstRow = scanner.nextLine();
    final String secondRow = scanner.nextLine();

    int second = scanner.nextInt();

    final StringBuilder result = new StringBuilder(firstRow);
    result.reverse();
    result.append(secondRow);

    int loopIndex;
    char swapChar;

    while (second > 0) {
      loopIndex = 0;

      for (; loopIndex < result.length() - 1; loopIndex++) {
        if (firstRow.indexOf(result.charAt(loopIndex)) != -1 && secondRow.indexOf(result.charAt(loopIndex + 1)) != -1) {
          swapChar = result.charAt(loopIndex);
          result.setCharAt(loopIndex, result.charAt(loopIndex + 1));
          result.setCharAt(loopIndex + 1, swapChar);

          ++loopIndex;
        }
      }

      --second;
    }

    System.out.println(result);
  }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        // Read and discard the first line (not used)
        scanner.nextLine();

        // Read the first and second rows with validation
        String firstRow = readValidInput(scanner, "Enter the first row:");
        String secondRow = readValidInput(scanner, "Enter the second row:");

        // Read and validate the number of swaps
        int second = readValidInteger(scanner, "Enter the number of swaps:");

        // Build the result with reversed first row
        final StringBuilder result = new StringBuilder(firstRow);
        result.reverse();
        result.append(secondRow);

        // Perform the swaps
        for (int i = 0; i < second; i++) {
            performSwaps(result, firstRow, secondRow);
        }

        System.out.println(result);
        scanner.close();
    }

    private static String readValidInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        
        // Validate input (e.g., check for null or empty strings)
        while (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input. Please try again:");
            input = scanner.nextLine();
        }
        
        return input;
    }

    private static int readValidInteger(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    private static void performSwaps(StringBuilder result, String firstRow, String secondRow) {
        int loopIndex = 0;

        while (loopIndex < result.length() - 1) {
            if (firstRow.indexOf(result.charAt(loopIndex)) != -1 && secondRow.indexOf(result.charAt(loopIndex + 1)) != -1) {
                char swapChar = result.charAt(loopIndex);
                result.setCharAt(loopIndex, result.charAt(loopIndex + 1));
                result.setCharAt(loopIndex + 1, swapChar);

                loopIndex++; // Skip the next character to avoid consecutive swaps
            }
            loopIndex++;
        }
    }
}

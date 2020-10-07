import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution1 {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String spaces = "";
            for (int j = n-i; j >0; j--) {
                spaces += " ";
            }
            String stairs = "";
            for (int j = i; j > 0; j--) {
                stairs += "#";
            }
            System.out.println(spaces + stairs);

        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        staircase(6);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

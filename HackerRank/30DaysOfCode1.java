import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        System.out.println((in + i));
        double dou = scan.nextDouble();
         System.out.println((d + dou));
         scan.nextLine();
        String str = scan.nextLine();
        System.out.println((s+str));
        scan.close();
    }
}

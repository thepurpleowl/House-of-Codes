import java.io.*;
import java.math.*;
import java.util.*;

class Solution {
    public static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[2];
		String[] swaps = reader.readLine().split(" ");
		for (int j = 0; j < 2; j++){
			arr[j] = Integer.parseInt(swaps[j]);
		}
		
        int a3 = arr[0];
        int a4 = arr[1];
		
		System.out.println((2*a3-a4)+" "+(a4-a3));
        reader.close();
    }
}


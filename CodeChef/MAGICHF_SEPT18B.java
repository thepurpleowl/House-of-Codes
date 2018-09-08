import java.io.*;
import java.math.*;
import java.util.*;

class Solution {
    public static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        for (int i = 0; i < t; i++) {
        	String[] swaps = reader.readLine().split(" ");
	    int n = Integer.parseInt(swaps[0]);
	    int x = Integer.parseInt(swaps[1]);
	    int s = Integer.parseInt(swaps[2]);	   	  

            for (int j = 0; j < s; j++) {
	    swaps = reader.readLine().split(" ");
                int a= Integer.parseInt(swaps[0]);
                int b= Integer.parseInt(swaps[1]);
                if(a==x){
                	x = b;
                }else if(b==x){
                	x = a;
                }
            }
        System.out.println(x);
        }
        
        reader.close();
    }
}

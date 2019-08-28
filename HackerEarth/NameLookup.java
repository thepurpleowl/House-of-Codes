import java.io.*;
import java.math.*;
import java.util.*;

class Solution {
    public static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        Map<Integer, String> map = new HashMap<Integer, String> ();
		for (int i = 0; i < t; i++){
		    String input[] = reader.readLine().split(" ");
    		int key = Integer.parseInt(input[0]);
    		map.put(key, input[1]);
		}
    		
        int q = Integer.parseInt(reader.readLine());
		for(int j=0; j<q;j++){
            int roll = Integer.parseInt(reader.readLine());
		    System.out.println(map.get(roll));
		}
        reader.close();
    }
}

import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.Math.*;

class Solution {
    public static BufferedReader reader;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
		for (int i = 0; i < t; i++){
            StringBuilder input[] = new StringBuilder[2];
    		input[0] = new StringBuilder(reader.readLine());
    		input[1] = new StringBuilder(reader.readLine());
    		int len1 = input[0].length(), len2 = input[1].length();
    		int len = (len1>len2)?len1:len2;
    		if(len1>len2){
    		    for(int j=0; j<len-len2;j++){
        		    input[1].insert(0,'0');
        		}
    		}else{
    		    for(int j=0; j<len-len1;j++){
    			    input[0].insert(0,'0');
    			}
    		}
    // 		System.out.println(input[0]+"  "+input[1]);
    		char output[] = new char[len];
			for(int j=len-1; j>= 0;j--){
			    output[j] = String.valueOf((input[0].charAt(j)+input[1].charAt(j)-2*'0')%10).charAt(0);
			}
		    long ans = Long.parseLong(input[0].toString()) + Long.parseLong(input[1].toString());
		    long wrongAns = Long.parseLong(new String(output));
    		System.out.println(Math.abs(wrongAns-ans));
		}
        reader.close();
    }
}

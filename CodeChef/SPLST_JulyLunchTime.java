    import java.io.*;
    import java.util.*;
     
    public class Main {
    	public static BufferedReader reader;
    	public static void main(String[] args) throws Exception {
    		reader = new BufferedReader(new InputStreamReader(System.in));
    		int t = Integer.parseInt(reader.readLine());
    		int num[] = new int[5];
    		for(int k=0;k<t;k++){
    			String []arr = reader.readLine().split(" ");
    			for(int i=0;i<5;i++){
    				num[i] = Integer.parseInt(arr[i]);
    			}
    			if(num[0]+num[1]+num[2] != num[3]+num[4]){
    				System.out.println("NO");
    			}
    			else{
    				if(min(num[0],num[1],num[2])>min2(num[3],num[4])){
    					System.out.println("NO");
    				}
    				else{
    					System.out.println("YES");
    				}
    			}
    		}
    	}
    	
    	public static int min(int a, int b, int c){
    		return a<(b<c?b:c)?a:(b<c?b:c);
    	}
    	
    	public static int min2(int a, int b){
    		return a<b?a:b;
    	}
    }
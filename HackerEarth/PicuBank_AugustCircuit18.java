    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;
    import java.lang.*;
     
    public class Main {
    	public static void main(String[] args) throws Exception {
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    		int t = Integer.parseInt(reader.readLine());
    		
    		for(int k=0;k<t;k++){
    		    int num[] = new int[5];
    			String []arr = reader.readLine().split(" ");
    			for(int i=0;i<5;i++){
    				num[i] = Integer.parseInt(arr[i]);
    			}
    			num[4] = num[4] - num[0];
    			int div = (num[1]*num[2])+num[3];
    			int ans = num[4]/div;
    			num[4] = num[4] - (ans*num[3]);
    			ans = ans + (int)Math.ceil(num[4]*1.0/num[1]);
    			System.out.println(ans);		
    // 			int m = 0;
    // 			while(num[4]>0){
    // 			    m++;
    // 			    if(m%5 == 0){
    // 			        num[4] = num[4] - num[3];
    // 			    }else{
    // 			        num[4] = num[4] - num[1];
    // 			    }
    // 			}
    // 			System.out.println(m);
    		}
    	}
    }
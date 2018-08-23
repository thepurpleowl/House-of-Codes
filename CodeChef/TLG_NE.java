import java.io.*;
    import java.util.*;
     
    public class Main {
    	public static BufferedReader reader;
    	public static void main(String[] args) throws Exception {
    		reader = new BufferedReader(new InputStreamReader(System.in));
    		int t = Integer.parseInt(reader.readLine());
    		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
    		int a[] = new int[t];
    		int b[] = new int[t];
    		for(int k=0;k<t;k++){
    			String []arr = reader.readLine().split(" ");
    			int ea = Integer.parseInt(arr[0]) ;
    			int eb = Integer.parseInt(arr[1]);
    			if(k==0){
    				a[k] = ea;
    				b[k] = eb;
    			}else{
    				a[k] = a[k-1] + ea;
    				b[k] = b[k-1] + eb;
    			}
    			int diff = a[k] - b[k];
    			if(diff>=0){
    				map.put(diff,1);
    			}else{
    				map.put(-1*diff,2);
    			}
    		}
    		// for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    		// 	 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    		// }
    		Map.Entry<Integer, Integer> lEntry = map.lastEntry();
    		System.out.println(lEntry.getValue() + " " + lEntry.getKey());
    	}
    }
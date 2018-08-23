import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static BufferedReader reader;
    	public static void main (String[] args) throws Exception
    	{
    		reader = new BufferedReader(new InputStreamReader(System.in));
    		String input[] = reader.readLine().split(" ");
    		int total = 0;
    		for(int i=0;i<input.length;i++){
    			total += Integer.parseInt(input[i]);
    		}
    		Map<Integer,Integer> map = new TreeMap<Integer,Integer> ();
    		for(int k=0;k<total;k++){
    			int key = Integer.parseInt(reader.readLine().trim());
    			if(map.get(key) == null){
    				map.put(key, 1);
    			}
    			else{
    				map.put(key, map.get(key) + 1);
    			}
    		}
    		
    		int sum = 0;
    		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    			if(entry.getValue() >= 2){
    				sum +=1;
    			}
    		}
		System.out.println(sum);
    		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    			if(entry.getValue() >= 2){
    				System.out.println(entry.getKey());
    			}
    		}
    	}
}
    import java.io.*;
    import java.util.*;
     
    public class Main {
    	public static BufferedReader reader;
    	public static void main(String[] args) throws Exception {
    		reader = new BufferedReader(new InputStreamReader(System.in));
    		int i,j,flag,max,len, t = Integer.parseInt(reader.readLine());
    		for(j=0;j<t;j++){
	    		String arr[] = reader.readLine().split(" ");
	    		flag = -1;
	    		max = -1;
	    		len = arr.length;
	    		// System.out.println(len);
	    		for(i=0;i<len;i++){
	    			if(arr[i].equals(""+(len-1)) && flag==-1){
	    				flag =1;
	    				// System.out.println("flag done "+ max);
	    			}
	    			else if(arr[i].equals(""+(len-1)) && (flag==1)&&(Integer.parseInt(arr[i])>max)){
	    				max = Integer.parseInt(arr[i]);
	    				// System.out.println("max changed "+ max);
	    			}
	   			else if(Integer.parseInt(arr[i])>max){
		   			max = Integer.parseInt(arr[i]);
	    				// System.out.println("max update "+ max);
		   		}
	    		}    	
	    		System.out.println(max);
    		}
    	}
    }
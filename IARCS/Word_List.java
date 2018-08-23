        import java.util.*;
        import java.io.*;
     
        /* Name of the class has to be "Main" only if the class is public. */
        class Ideone
        {
        	public static BufferedReader reader;
        	public static void main (String[] args) throws Exception
        	{
        		reader = new BufferedReader(new InputStreamReader(System.in));
        		int lines = Integer.parseInt(reader.readLine());
        		StringBuilder inputText = new StringBuilder(); 
        		for(int i=0;i<lines;i++){
        			inputText.append(reader.readLine());
        		}
        		String text = inputText.toString();
        		String input[] = text.replaceAll("['.,;:]","").toLowerCase().split(" ");
     
        		selectionSort(input);
        		
        		
        		List<String> output = new LinkedList<String> ();
        		output.add(input[0]);
        		int i = 0;
        		for(int k=1;k<input.length;k++){
        			if(input[k].equals(input[i])){
        				continue;
        			}
        			else{
        				i = k;
        				output.add(input[k]);
        			}
        		}
        		
	            System.out.println(output.size()); 
        		Iterator<String> iterator = output.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next()); 
		}
        	}
     
        	public static boolean isBigger(String a, String b){
        		boolean result = true;
        		int i=0, decided = 0;
        		while(i<a.length()&& i<b.length()){
        			if(a.charAt(i) == b.charAt(i)){
        				i++;	
        				continue;
        			}
        			else if(a.charAt(i) > b.charAt(i)){
        				decided = 1;
        				break;
        			}
        			else{
        				result = false;
        				decided = 1;
        				break;
        			}
        		}
        		if(decided == 0 && a.length()<b.length()){
        			result = false;
        		}
        		return result;
        	}
     
        	public static void selectionSort(String arr[]){
        		for(int i=1;i<arr.length;i++){
        			int j = i;
        			String ele = arr[j];
        			while((j>0) && isBigger(arr[j-1],ele)){
        				arr[j] = arr[j-1];
        				j--;
        			}
        			arr[j] = ele;
        			// for(int k=0;k<arr.length;k++){
    	    		// 	System.out.print(arr[k] + " ");
    	    		// }
    	    		// System.out.println();
        		}
        	}
        }
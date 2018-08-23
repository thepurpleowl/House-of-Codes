/* package whatever; // don't place package name! */

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
		int N = Integer.parseInt(input[0]);
		int lane[] = new int[N];
		int H = Integer.parseInt(input[1]);
		
		input = reader.readLine().split(" ");
		for(int k=0;k<N;k++){
			lane[k] = Integer.parseInt(input[k]);
		}
		
		input = reader.readLine().split(" ");
		int move, crane_holding = 0, crane = 0;
		for(int k=0;k<input.length;k++){
			move = Integer.parseInt(input[k]);
			if(move==0){
				break;
			}
			switch(move){
				case 1:
					if(crane>0){
						crane -= 1;
					}
					break;
				case 2:
					if(crane<N-1){
						crane +=1;
					}
					break;
				case 3:
					if(lane[crane]>0 && crane_holding == 0){
						lane[crane] -= 1;
						crane_holding = 1;
					}
					break;
				case 4:
					if(lane[crane]<H && crane_holding == 1){
						lane[crane] += 1;
						crane_holding = 0;
					}
					break;
			}
			
			// for( int j=0;j<lane.length;j++){
			// 	System.out.print(lane[j] + " ");
			// }
			
			// System.out.println("--------  "+move);
		}
		for(int k=0;k<lane.length;k++){
			System.out.print(lane[k] + " ");
		}
	}
}
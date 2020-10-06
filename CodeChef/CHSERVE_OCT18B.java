import java.util.*;
class Test
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			int k = sc.nextInt();
			int d = 2*k;
			int sum = p1+p2;
			if(sum%d < k)
				System.out.println("CHEF");
			else
				System.out.println("COOK");
		}
	}
}
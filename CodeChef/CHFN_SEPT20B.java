/*Link to problem : https://www.codechef.com/SEPT20B/problems/CHFNSWAP/ 
 All test cases passed.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class ChefinaAndSwap {
     //For Caching.
    static Map<Long, Long> map = new HashMap<>();
    public static long floor(long sum) {
        if (map.containsKey(sum)) {
            return map.get(sum);
        }
        double root = ((Math.sqrt((double) (4 * sum + 1)) - 1.0)) / 2.0;
        map.put(sum, (long) root);
        return (long) root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            long N = sc.nextLong(), h = 0;
            long sum = (N * (N + 1)) / 2;
            if ((sum & 1) == 1) {
                h = 0; //If the sum is odd.No swap is possible.
            } else {

                long ans = floor(sum);
                sum /= 2L;
                long val = ((ans * (ans + 1)) / 2); 
                if (N == 3) {
                    h = 2;
                } else if (val == sum) {
                    h = (((ans * (ans - 1)) / 2) + ((N - ans) * (N - ans + 1)) / 2L); 
                } else {

                    h = N - ans;
                }

            }
            sb.append(h);
            sb.append(System.getProperty("line.separator"));
        }
        System.out.print(sb);
    }

}

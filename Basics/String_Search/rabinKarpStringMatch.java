import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Atik Enam on 7/5/2018.
 */
public class rabinKarpStringMatch {
    private String T, P ;
    private int m, n ;
    private int prime1 = 101, prime2 = 17, prime3 = 67 ;

    public rabinKarpStringMatch(String t, String p) {
        T = t;
        P = p;
        m = P.length() ;
        n = T.length() ;
    }

    public void rabin_karp_search(){
        int textHash1 = 0, textHash2 = 0, textHash3 = 0 ;
        int patHash1 = calculateInitialHash(P, prime1) ;
        int patHash2 = calculateInitialHash(P, prime2) ;
        int patHash3 = calculateInitialHash(P, prime3) ;

        for (int i = 0 ; i <=(n-m) ; i++){
            if (i==0){
                textHash1 = calculateInitialHash(T, prime1) ;
                textHash2 = calculateInitialHash(T, prime2) ;
                textHash3 = calculateInitialHash(T, prime3) ;
            }

            if (textHash1==patHash1 && textHash2==patHash2 && textHash3 == patHash3){
                for (int j = 0 ; j < m ; j++){
                    if (P.charAt(j)==T.charAt(i+j)){
                        if (j==m-1)System.out.println("Pattern occurs with shift : "+i);
                    }
                    else break;
                }
            }
            if (i< (n-m)){
                textHash1 = recalculateHashValue(textHash1, i+1, prime1) ;
                textHash2 = recalculateHashValue(textHash2, i+1, prime2) ;
                textHash3 = recalculateHashValue(textHash3, i+1, prime3) ;
            }
        }
    }

    private int recalculateHashValue(int textHash1, int i, int prime) {
        int val = 0 ;
        val = textHash1-T.charAt(i-1) ;
        val = val/prime;
        val = (int) (val + T.charAt(i+m-1)*Math.pow(prime, m-1));
        return val ;
    }

    private int calculateInitialHash(String p, int prime) {
        int val = 0 ;
        for (int i = 0 ; i < m ; i++){
            int temp = p.charAt(i) ;
            val = (int) (val + temp*Math.pow(prime, i));
        }
        return val;
    }
}

class rabinKarpMain {
    public static void main(String[] args) throws FileNotFoundException {
        String T, P ;
        Scanner sc = new Scanner("banana") ;

        P = sc.nextLine() ;
        T = sc.nextLine() ;

        rabinKarpStringMatch rk = new rabinKarpStringMatch(T, P) ;
        rk.rabin_karp_search();
    }
}

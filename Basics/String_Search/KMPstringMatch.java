import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Atik Enam on 7/5/2018.
 */
public class KMPstringMatch {
    private String T, P ;
    private int[] pi ;

    public KMPstringMatch(String t, String p) {
        T = t;
        P = p;
        pi = new int[P.length()] ;
    }

    public void kmpMatcher(){
        int n = T.length(), m = P.length() ;
        computePrefixFunction();
        int q = 0 ;
        for (int i = 0 ; i < n; i++){
            while (q>0 && P.charAt(q) != T.charAt(i)){
                if (q!=0)q = pi[q-1] ;
            }
            if (P.charAt(q)==T.charAt(i)){
                q++ ;
            }
            if (q==m){
                System.out.println("Pattern occurs with shift : "+(i-m+1));
                if (q!=0)q = pi[q-1] ;
            }
        }
    }

    private void computePrefixFunction(){
        int m = P.length() ;
        pi[0] = 0 ;
        int k = 0 ;
        for (int q = 1 ; q < m ; q++){
            while (k>0 && P.charAt(k)!=P.charAt(q)){
                if (k!=0)k = pi[k-1] ;
            }
            if (P.charAt(k)==P.charAt(q)){
                k++ ;
            }
            pi[q] = k ;
        }
    }

    public void printPI() {
        for (int i = 0 ; i < P.length() ; i++){
            System.out.print(pi[i]+" ");
        }
    }
}

class kmpMain {
    public static void main(String[] args) throws FileNotFoundException {
        String T, P ;
        Scanner sc = new Scanner("banana") ;

        P = sc.nextLine() ;
        T = sc.nextLine() ;

        KMPstringMatch kmp = new KMPstringMatch(T, P) ;
        //kmp.computePrefixFunction();
        //kmp.printPI() ;
        kmp.kmpMatcher();
    }
}

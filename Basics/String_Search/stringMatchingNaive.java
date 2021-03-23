import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Atik Enam on 7/4/2018.
 */
public class stringMatchingNaive {
    private String T, P ;

    public stringMatchingNaive(String t, String p) {
        T = t;
        P = p;
    }

    public void naiveStringMatcher(){
        for (int i = 0 ; i <= (T.length()-P.length()) ; i++){
            for (int j = 1 ; j <=P.length() ; j++){
                if (P.charAt(j-1)==T.charAt(i+j-1)){
                    if (j==P.length())System.out.println("Pattern occurs with shift : "+i);
                }
                else break;
            }
        }
    }
}

class stringMain {
    public static void main(String[] args) throws FileNotFoundException {
        String T, P ;
        Scanner sc = new Scanner("banana") ;

        P = sc.nextLine() ;
        T = sc.nextLine() ;

        stringMatchingNaive smn = new stringMatchingNaive(T, P) ;
        long startTime = System.nanoTime();
        smn.naiveStringMatcher();
        long endTime = System.nanoTime();
        System.out.println((endTime-startTime)/1000000000);
    }
}
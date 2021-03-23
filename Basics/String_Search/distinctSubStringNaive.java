import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Atik Enam on 7/5/2018.
 */
public class distinctSubStringNaive {
    private String P ;
    private HashSet<String> substringSet = new HashSet<String>();

    public distinctSubStringNaive(String p) {
        P = p;
    }

    public void findDistinctSubString(){
        for (int i = 0 ; i < P.length() ; i++){
            for (int j = i ; j <= P.length() ; j++){
                String temp = P.substring(i, j) ;
                substringSet.add(temp) ;
            }
        }
    }

    public void printSubStrings(){
        for (String str : substringSet){
            System.out.println(str);
        }

        System.out.println("Total distinct substrings : "+(substringSet.size()-1));
    }
}

class naiveDistinctMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner("banana") ;
        String P = sc.nextLine() ;

        distinctSubStringNaive distinctNaive = new distinctSubStringNaive(P) ;
        long startTime = System.nanoTime();
        distinctNaive.findDistinctSubString();
        long endTime = System.nanoTime();
        distinctNaive.printSubStrings();
        //System.out.println((endTime-startTime)/1000000000);
    }
}

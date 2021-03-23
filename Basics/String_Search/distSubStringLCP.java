import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Atik Enam on 7/5/2018.
 */
public class distSubStringLCP {
    private String P ;
    private int n, noDis = 0 ;
    private int[] suffixArray, lcpArray ;
    private ArrayList<suffix> suffixLists = new ArrayList<suffix>() ;

    public distSubStringLCP(String p) {
        P = p;
        n = p.length() ;
        suffixArray = new int[p.length()] ;
        lcpArray = new int[p.length()] ;
    }

    private void createSuffixArray(){
        for (int i = 0 ; i < n ; i++){
            suffix temp = new suffix() ;
            temp.setIndex(i);
            temp.setSuf(P.substring(i, n));

            suffixLists.add(temp);
        }
/*
        Collections.sort(suffixLists, new Comparator<suffix>() {
            @Override
            public int compare(suffix s1, suffix s2) {
                return s1.suf.compareToIgnoreCase(s2.suf);
            }
        });
*/
        radix_Sort rs = new radix_Sort(suffixLists) ;
        suffixLists = rs.radix_Sort('a', 'z') ;

        for (int i = 0 ; i < n ; i++){
            suffixArray[i] = suffixLists.get(i).index ;
        }
        System.out.println();
    }

    public void countDistinctSubStrings(){
        createSuffixArray();
        createLCPArray() ;

        noDis = n - suffixArray[0] ;
        int LCPSize = lcpArray.length ;
        for (int i = 1; i < LCPSize; i++) {
            noDis = noDis + (n - suffixArray[i]) - lcpArray[i - 1];
        }

        System.out.println("Total distinct substrings : "+noDis);
    }

    private void createLCPArray() {
        int[] inverseSuf = createInverseSuffixArray() ;
        int k = 0 ;
        for (int i = 0 ; i < n ; i++){
            if (inverseSuf[i] == n-1)
            {
                k = 0;
                continue;
            }
            else{
                int j = suffixArray[inverseSuf[i]+1];

                for (int l = k ;; l++){
                    if (i+l < n && j+l < n && P.charAt(i+l)==P.charAt(j+l))k++ ;
                    else break;
                }

                lcpArray[inverseSuf[i]] = k;
                if (k>0) k--;
            }
        }
        System.out.println();
    }

    private int[] createInverseSuffixArray() {
        int[] sufInv = new int[n] ;
        for (int i=0; i < n; i++)
            sufInv[suffixArray[i]] = i;
        return sufInv;
    }
}

class suffixArray_LCP_Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner("banana") ;
        String P = sc.nextLine() ;

        distSubStringLCP ds = new distSubStringLCP(P) ;
        ds.countDistinctSubStrings();
    }
}

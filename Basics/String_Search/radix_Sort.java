import java.util.ArrayList;

/**
 * Created by Atik Enam on 7/6/2018.
 */
public class radix_Sort {
    private ArrayList<suffix> suffixLists ;
    private int[] indexArray ;

    public radix_Sort(ArrayList<suffix> suffixLists) {
        this.suffixLists = suffixLists;
        indexArray = new int[suffixLists.size()] ;
    }

    public void countingSort(int idx,char low,char up){
        int[] cntArr = new int[(up-low)+2];
        String[] tmpArr = new String[suffixLists.size()];

        for(int i=0;i<suffixLists.size();i++){
            int charIndex = 0 ;
            if (suffixLists.get(i).suf.length()-1 < idx) charIndex = 0 ;
            else {
                charIndex = (suffixLists.get(i).suf.charAt(idx) - low)+1 ;
            }
            cntArr[charIndex]++;
        }

        for(int i=1;i<cntArr.length;i++){
            cntArr[i] = cntArr[i] + cntArr[i-1];
        }

        for(int i=suffixLists.size()-1;i>=0;i--){
            int charIndex = 0 ;
            if (suffixLists.get(i).suf.length()-1 < idx) charIndex = 0 ;
            else {
                charIndex = (suffixLists.get(i).suf.charAt(idx) - low)+1 ;
            }
            tmpArr[cntArr[charIndex]-1] = suffixLists.get(i).suf;
            indexArray[cntArr[charIndex]-1] = suffixLists.get(i).index ;
            cntArr[charIndex]--;
        }

        for(int i=0;i<tmpArr.length;i++){
            suffixLists.get(i).suf = tmpArr[i];
            suffixLists.get(i).index = indexArray[i] ;
        }
    }

    public ArrayList<suffix> radix_Sort(char low, char up){
        int maxIndex = 0;
        for(int i=0;i<suffixLists.size();i++){
            if(suffixLists.get(i).suf.length()-1 > maxIndex){
                maxIndex = suffixLists.get(i).suf.length()-1;
            }
        }
        for(int i=maxIndex;i>=0;i--){
            countingSort(i,low,up);
        }
        return suffixLists;
    }
}

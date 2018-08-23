import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.HashMap;
// import java.util.Map;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dummy = br.readLine();   
        String s = br.readLine();   
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val + 1));
            }
            else {
               map.put(c, 1);
           }
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        System.out.println(s.length()-max);   
    }
}

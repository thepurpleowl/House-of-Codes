import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class Solution{

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.split(":")[0]);
        if (s.contains("PM")) {
            s=s.replace("PM","");
            if (hour < 12) {
                return s.replaceFirst((hour<10?"0":"" )+ hour+"", (hour + 12) + "");
            }
            return s;
        }
        else {
            s=s.replace("AM","");
            if (hour >= 12) {
                if (hour -12< 10)
                    s = "0" + s;
                return s.replaceFirst(hour+"", (hour - 12) + "");
            }
            return s;
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       System.out.println(timeConversion("07:05:45PM"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

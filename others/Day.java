package others;
import java.util.*;
public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        
        if (m + 30 >= 60) {
            h = h + 1;
            m = m + 30 - 60; 
        } else {
            // h = h;
            m = m + 30; 
        }

        String newH = Integer.toString(h);
        String newM = Integer.toString(m); 

        if (newH.length() == 1) {
            newH = "0" + newH;
        }
        
        if (newM.length() == 1) {
            newM = "0" + newM;
        }

        System.out.println(newH + ":" + newM);

        sc.close();
    }
}

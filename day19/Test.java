package day19;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d_1 = sc.nextLine();
        String d_2 = sc.nextLine();
        String d_3 = sc.nextLine();
        String d_4 = sc.nextLine();
        String d_5 = sc.nextLine();
        String d_6 = sc.nextLine();
        String d_7 = sc.nextLine();
        String[] week = {d_1,d_2,d_3,d_4,d_5,d_6,d_7};
        int count = 0;
        for(int i = 0; i < week.length; i++){
            if(week[i].equals("NO")){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

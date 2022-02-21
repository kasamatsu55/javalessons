package joytas;
import java.util.*;
public class Day10_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("月を入力してください>");
        int month = sc.nextInt();
        System.out.printf("%d月の日数は%d日です。",month,monthDays(month));
        sc.close();
    }
    public static int monthDays(int num){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        return days[num-1];
    }
}

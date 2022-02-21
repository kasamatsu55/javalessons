package joytas;
import java.util.*;
public class Day9_ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1からいくつまで足しますか>");
        int num = sc.nextInt();
        System.out.printf("1から%dまでの和は%dです。",num,getSum(num));
        sc.close();
    }
    public static int getSum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}

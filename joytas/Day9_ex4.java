package joytas;
import java.util.*;
public class Day9_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数1を入れてください。>");
        int num1 = sc.nextInt();
        System.out.print("整数2を入れてください。>");
        int num2 = sc.nextInt();
        System.out.print("整数3を入れてください。>");
        int num3 = sc.nextInt();
        System.out.printf("3つの整数値の最大は%dです。",maxOf(num1,num2,num3));
        sc.close();
    }
    public static int maxOf(int num1,int num2,int num3){
        int max = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        return max;
    }
}

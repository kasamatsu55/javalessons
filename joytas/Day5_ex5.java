package joytas;
import java.util.*;
public class Day5_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("xに代入する数値をいれてください＞");
        int x = scan.nextInt();
        System.out.print("yに代入する数値をいれてください＞");
        int y = scan.nextInt();
        int z = x;
        x = y;
        y = z;
        System.out.println("2つの数値を入れ替えました。x:"+ x + ",y:" + y);
        scan.close();
    }
}

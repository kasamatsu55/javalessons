package joytas;
import java.util.*;
public class JavaLesson2 {
    public static void main(String[] args) {
        //キーボードから読み込んだ３つの整数値の最小値を表示する処理を作成せよ
        Scanner sc = new Scanner(System.in);
        System.out.print("整数A:");
        int numA = sc.nextInt();
        System.out.print("整数B:");
        int numB = sc.nextInt();
        System.out.print("整数C:");
        int numC = sc.nextInt();
        int min = Math.min(numA,numB);
        min = Math.min(min,numC);
        System.out.printf("それらの最小値は%dです",min);
        sc.close();
    }
}

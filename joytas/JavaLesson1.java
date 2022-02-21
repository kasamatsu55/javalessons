package joytas;
import java.util.*;
public class JavaLesson1 {
    public static void main(String[] args) {
        //二つの整数を読み込んで、それらの差を表示する処理を作成せよ。
        Scanner sc = new Scanner(System.in);
        System.out.print("整数A:");
        int numA = sc.nextInt();
        System.out.print("整数B:");
        int numB = sc.nextInt();
        System.out.println("それらの差は" + (numA >= numB ? (numA-numB):(numB-numA)) + "です。");
        sc.close();
    }
}

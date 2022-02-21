package day12;
import java.util.*;
public class SwapLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の数字＞");
        int a = sc.nextInt();
        System.out.print("2つ目の数字＞");
        int b = sc.nextInt();
        //2値の入れ替え
        int tmp = a;
        a = b;
        b = tmp;

        //ネタ(変数二つでも入れ替えはできる)
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.printf("a:%d,b:%d",a,b);
        sc.close();
    }
}

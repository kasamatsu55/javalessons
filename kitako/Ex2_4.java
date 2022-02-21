package kitako;
import java.util.*;
public class Ex2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字(x)を入力してください＞");
        int x = sc.nextInt();
        System.out.print("好きな数字(y)を入力してください＞");
        int y = sc.nextInt();
        System.out.println("xとyの和：" + (x + y));
        System.out.println("xとyの差(x-y)：" + (x - y));
        System.out.println("xとyの積：" + (x * y));
        System.out.println("xとyの商(x÷y)：" + (x / y) + "、余り：" + (x % y));
        sc.close();
    }
}

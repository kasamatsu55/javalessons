package kitako;
import java.util.*;
public class Ex2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字を入力してください＞");
        int x = sc.nextInt();
        System.out.print("もうひとつ好きな数字を入力してください＞");
        int y = sc.nextInt();
        System.out.println("ふたつの数字の平均値は" + (x + y) / 2 + "です(小数点以下切り捨て)");
        sc.close();
    }
}

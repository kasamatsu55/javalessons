package kitako;
import java.util.*;
public class Ex4_5 {
    public static void main(String[] args) {
    // 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
    // ※計算は整数で行い、小数点以下は切り捨ててよい。
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("整数を入力してください＞＞");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("平均値：" + (sum / 10));
        sc.close();
    }
}

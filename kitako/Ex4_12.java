package kitako;
import java.util.*;
public class Ex4_12 {
    public static void main(String[] args) {
        //数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(sum <= 100){
            System.out.print("入力＞");
            int num = scan.nextInt();
            sum = sum + num;
        }
        System.out.println("合計：" + sum);
        scan.close();
    }
}

package kitako;
import java.util.*;
public class Ex4_18 {
    public static void main(String[] args){
        // 数値を繰り返して入力し、0が入力されたら入力を止め、
        // それまでの合計を表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while(num != 0){
            System.out.print("入力＞＞");
            num = scan.nextInt();
            sum += num;
        }
        // for(;;){
        //     System.out.print("入力＞＞");
        //     int num = scan.nextInt();
        //     if(num == 0){
        //         break;
        //     }
        //     sum += num;
        // }
        System.out.println("合計：" + sum);
        scan.close();
    }
}

package kitako;
import java.util.*;
public class Ex4_15 {
    public static void main(String[] args) {
        // 入力された数が素数かどうかを判定するプログラムを作成しなさい。
        // ※判定する数は 4 以上としてよい。
        Scanner scan = new Scanner(System.in);
        System.out.print("入力＞＞");
        int num = scan.nextInt();
        for(int i = 2; i <= num; i++){
            if(i == num){
                System.out.println(num + "は素数です");
                break;
            }else if(num % i == 0){
                System.out.println(num + "は素数ではありません");
                break;
            }
        }
        scan.close();
    }
}

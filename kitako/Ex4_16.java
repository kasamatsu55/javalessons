package kitako;
import java.util.*;
public class Ex4_16 {
    public static void main(String[] args) {
        // 2以上の数値を入力し、素因数分解した結果を表示しなさい。
        Scanner scan = new Scanner(System.in);
        System.out.print("入力＞＞");
        int num = scan.nextInt();

        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                num = num / i;
                i--;
            }
        }
            // for(int i = 2; num > 1; i++){
            //     while(num % i ==0){
            //         System.out.print(i + " ");
            //         num /= i;
            //     }
            // }
        scan.close();
    }
}

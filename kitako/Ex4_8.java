package kitako;
import java.util.*;
public class Ex4_8 {
    public static void main(String[] args) {
        //自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        int max = 0; 
        for(int i = 1; i <= 10; i++){
            System.out.print(i + "回目＞");
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println("最大値：" + max);
        scan.close();
    }
}

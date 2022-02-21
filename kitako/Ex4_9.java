package kitako;
import java.util.*;
public class Ex4_9 {
    public static void main(String[] args){
        //整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print(i + "回目＞");
            int num = scan.nextInt();
            if(i == 1){
                max = num;
                min = num;
            }else if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        // for(int i = 1; i <= 10; i++){
        //     System.out.print(i + "回目＞");
        //     int num = scan.nextInt();
        //     if(i == 1 || num > max){
        //         max = num;
        //     }
        //     if(i == 1 || num < min){
        //         min = num;
        //     }
        // }
        System.out.println("最大値："+ max + "、最小値：" + min);
        scan.close();
    }
}

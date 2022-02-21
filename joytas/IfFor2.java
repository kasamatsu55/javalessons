package joytas;
import java.util.*;
public class IfFor2 {
    public static void main(String[] args) {
        // 点数を入力するとその点数分*を描画する処理を作成せよ。
        // もし、0~100の範囲外の点数が入力されたら再入力させること
        Scanner sc = new Scanner(System.in);
        int score;
        while(true){
            System.out.print("何点＞");
            score = sc.nextInt();
            if(score > 100 || score < 0){
                System.out.println("点数は0から100です");
            }else{
                break;
            }
        }
        for(int i = 1; i <= score; i++){
            System.out.print("*");
            if(i % 5 == 0){
                System.out.print("|");
            }
        }
        sc.close();
    }
}

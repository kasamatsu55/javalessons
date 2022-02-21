package joytas;
import java.util.*;
public class Day7_ex1 {
    public static void main(String[] args) {
        // 0~100の範囲で生成された乱数を当てるゲームを作成せよ。
        // もっと上やもっと下といったヒントを出しつつ正解に導き、正解までの試行回数を表示する。
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("数当てゲーム！！");
        int ans = rand.nextInt(101);
        int count = 0;
        while(true){
            System.out.print("いくつかな?(0~100)>");
            int num = scan.nextInt();
            count++;
            if(num == ans){
                break;
            }else if(num > ans){
                System.out.println("もっと下だよ。");
            }else{
                System.out.println("もっと上だよ。");
            }
        }
        System.out.println("正解！"+ count + "回目で正解しました");
        scan.close();
    }
}

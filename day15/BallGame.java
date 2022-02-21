package day15;
import java.util.*;
public class BallGame {
    public static void main(String[] args) {
        final int GAMECOUNT = 5;
        Random rand = new Random();
        int[] balls = new int[100];
        for(int i = 0; i < balls.length; i++){
            balls[i] = i;
        }
        //配列シャッフル
        for(int i = 0; i < balls.length - 1; i++){
            int index = rand.nextInt(balls.length - i) + i;
            int temp = balls[index];
            balls[index] = balls[i];
            balls[i] = temp;
        }
        // System.out.println(Arrays.toString(balls)); ←デバッグプリント
        //勝ち星管理変数
        int aWin = 0 , bWin = 0; //型が同じならカンマで続いて定義できる
        //メイン処理
        for(int i = 0; i < GAMECOUNT; i++){
            System.out.printf("%d回戦%n",i+1);
            int aBall = balls[i];
            int bBall = balls[balls.length-1-i];
            String winner;
            if(aBall > bBall){
                aWin++;
                winner = "A";
            }else{
                bWin++;
                winner = "B";
            }
            System.out.printf("A:%d,B:%d...%sの勝ち%n",aBall,bBall,winner);
        }
        //結果表示 大きい値が先にくるように表示
        System.out.printf("%d対%dで%sの勝ち",
        Math.max(aWin,bWin),Math.min(aWin,bWin),aWin > bWin ? "A":"B");
    }
}

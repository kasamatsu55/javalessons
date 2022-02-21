package day13;
import java.util.*;
public class ShuffleLesson {
    public static void main(String[] args) {
        // 袋の中に５つのボールが入っている。
        // このボールには１から５の番号がついている。
        // この袋から一つずつボールを取り出したととする。
        // その時のボール番号を順番に表示する処理を作成せよ。
        // （取り出したボールは袋に戻さない）
        Random rand = new Random();
        int[] balls = {1,2,3,4,5,};
        int[] picks = new int[5];
        for(int i = 0; i < balls.length; i++){
            while(true){
                int index = rand.nextInt(balls.length);
                if(balls[index] != 0){
                    picks[i] = balls[index];
                    balls[index] = 0;
                    break;
                }                
            }
        }
        System.out.println(Arrays.toString(picks));

        // for(int i = 0; i < balls.length-1; i++){
        //     int index = rand.nextInt(balls.length-i)+i;
        //     int tmp = balls[index];
        //     balls[index] = balls[i];
        //     balls[i] = tmp;
        // }
        // System.out.println(Arrays.toString(balls));
    }
}

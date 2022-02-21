package joytas;
import java.util.*;
public class ArrLesson5 {
    public static void main(String[] args) {
        // 段数を入力すると以下のように階段状に数字を表示する処理を作成せよ。
        // それぞれの数字は0~99のランダムとする。
        // 作成時には2次元配列を用い。配列作成部分と出力部分をわけて記述すること。
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何段＞");
        int num = sc.nextInt();
        int[][] step = new int[num][];
        for(int i = 0; i < step.length; i++){
            step[i] = new int[i+1];
            for(int j = 0; j < step[i].length; j++){
                step[i][j] = rand.nextInt(100);
            }
        }
        for(int i = 0; i < step.length; i++){
            for(int j = 0; j < step[i].length; j++){
                System.out.printf("%3d",step[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

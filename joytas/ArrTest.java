package joytas;
import java.util.*;
public class ArrTest {
    public static void main(String[] args) {
        // 1~6の目がランダムに出るサイコロを１０回振り、その目を配列に格納してく。
        // そして、その結果を出力する。ただし出力フォーマットは実行例のようにすること
        Random rand = new Random();
        int[] dices = new int[10];
        for(int i = 0; i < 10; i++){
            dices[i] = rand.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(dices));
    }
}

package kitako;
import java.util.*;
public class Ex4_6 {
    public static void main(String[] args) {
        // 整数、0 か 1 を 10 回入力する。
        // これを対戦成績と考え、0 を負け、1 を勝ちとして、
        // 勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int lose = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("0 か 1 を入力してください＞＞");
            int num = sc.nextInt();
            if(num == 0){
                lose++;
            }else{
                win++;
            }
        }
        System.out.println("勝ち：" + win + "、負け：" + lose);
        sc.close();
    }
}

package kitako;
import java.util.*;
public class Ex4_7 {
    public static void main(String[] args) {
        // 巨人、阪神戦で毎回の得点を入力する。（１回～９回）
        // 入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
        // ※ 	試合は巨人の先行とする。
        Scanner sc = new Scanner(System.in);
        int totalG = 0;
        int totalT = 0;
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "回表、巨人の得点は？＞＞");
            int giants = sc.nextInt();
            System.out.print(i + "回裏、阪神の得点は？＞＞");
            int tigers = sc.nextInt();
            totalG += giants;
            totalT += tigers;
        }
        System.out.println("巨人：" + totalG + "点, 阪神：" + totalT +"点");
        if(totalG > totalT){
            System.out.println("巨人の勝ち");
        }else if(totalG < totalT){
            System.out.println("阪神の勝ち");
        }else{
            System.out.println("引き分け");
        }
        sc.close();
    }
}

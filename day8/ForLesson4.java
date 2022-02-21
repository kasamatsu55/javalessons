package day8;
import java.util.*;
public class ForLesson4 {
    public static void main(String[] args) {
        // Random rd = new Random();
        // System.out.println("チャンスは10回さて、77はでるか！(1-99)");
        // for(int i = 1; i <= 10; i++){
        //     int rand = rd.nextInt(99) + 1;
        //     System.out.println(i + ":" + rand);
        //     if(rand == 77){
        //         System.out.println(i + "回目に77がでました！");
        //         break;
        //     }
        //     if(i == 10){
        //         System.out.println("77は出ませんでした");
        //     }
        // }
        boolean isHit = false; /*2つしかないからboolean(フラグ管理)*/
        Random rand = new Random();
        for(int i = 1; i <= 10; i++){
            int n = rand.nextInt(99) + 1;
            System.out.println(i + ":" + n);
            if(n == 77){
                isHit = true; /*なくても実行できる*/
                System.out.println(i + "回目に77がでました！");
                break;
            }
        }
        if(isHit == false){ /*iを使いたい場合はfor文の前にiを宣言して、booleanを使わなくてもできる*/
            System.out.println(("77は出ませんでした"));
        }
    }
}

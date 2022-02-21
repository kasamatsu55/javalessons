package day7;
//import java.util.*;を入力すれば「java.util」を省略できる
public class Kazuate {
    public static void main(String[] args) {
        /*
        [数当てゲーム]
        1-100の範囲の乱数を生成したよ。当ててね
        いくつかな>>40
        もっと上だよ
        いくつかな>>80
        もっと下だよ
        いくつかな>>60
        もっと上だよ
        いくつかな>>66
        当たり！！
        4回で当てました。
        */
        // System.out.println("[数当てゲーム]");
        // int x = new java.util.Random().nextInt(100 - 1 + 1) + 1;
        // System.out.println("1-100の範囲の乱数を生成したよ。当ててね");
        // int count = 0;
        // int ans = 0;
        // while(ans != x){
        //     System.out.print("いくつかな＞＞");
        //     ans = new java.util.Scanner(System.in).nextInt();
        //     count++;
        //     if(ans > x){
        //         System.out.println("もっと下だよ");
        //     }else if(ans < x){
        //         System.out.println("もっと上だよ");
        //     }else{
        //         System.out.println("当たり！");
        //     }
        // }        
        // System.out.println(count + "回で当てました");

        final int ANS = new java.util.Random().nextInt(100 - 1 + 1) + 1;
        System.out.println("[数当てゲーム]");
        System.out.println("1-100の範囲の乱数を生成したよ。当ててね");
        int count = 0;
        while(true){
            count++;
            System.out.print("いくつかな＞＞");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ANS){
                System.out.println("当たり！");
                break;
            }
            if(num > ANS){
                System.out.println("もっと下だよ");
            }else{
                System.out.println("もっと上だよ");
            }
        }
        System.out.println(count + "回で当てました");
    }
}

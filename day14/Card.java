package day14;
import java.util.*;
public class Card {
    public static void main(String[] args) {
        String[] suits = {"♠","♦","♥","♣"};
        String[] nums = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] cards = new String[52];
        // for(int i = 0; i < suits.length; i++){
            // for(int j = 0; j <nums.length; j++){
            //     int index = i * 13 + j;
            //     cards[index] = suits[i] + nums[j];
            //     System.out.printf("%4s",cards[index]);
            // }
            // System.out.println();
        // }
        // System.out.println(Arrays.toString(cards)); 確認用

        //上の2重for文は下記のようにもかける
        for(int j = 0; j < 52; j++){
            cards[j] = suits[j/13] + nums[j % 13]; //マークのindexを求める
            System.out.printf("%4s",cards[j]);
            if((j+1) % 13 == 0){ //13枚ごとに改行
              System.out.println();
            }
        }
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何枚引く＞");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int index = rand.nextInt(cards.length-i) + i;
            String temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
            System.out.printf("%4s",temp);
        }
        sc.close();
    }
}

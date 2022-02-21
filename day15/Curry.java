package day15;
import java.util.*;
public class Curry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("今夜のカレーを決めます");
        String[] bases = {"ポーク","ビーフ","チキン"};
        final String[] TOPPINGS ={
            "大根","セロリ","里芋","カブ","ゴーヤ","キュウリ","カツオのたたき","ラム肉",
            "鯖の水煮","ブリ","タコ","ちくわ","魚肉ソーセージ","こんにゃく","ツナ缶",
            "納豆","アボガド","レーズン","あげ玉",};
        System.out.print("ベースとなるカレーを選択してください(0:ポーク,1:ビーフ,2:チキン)>");
        int base = sc.nextInt();
        System.out.print("トッピングは何種類?>");
        int topping = sc.nextInt();
        System.out.print("今夜のカレーは「");
        for(int i = 0; i < topping; i++){
            int index = rand.nextInt(TOPPINGS.length);
            String temp = TOPPINGS[index];
            TOPPINGS[index] = TOPPINGS[i];
            TOPPINGS[i] = temp;
            System.out.print(TOPPINGS[i]);
        }
        System.out.printf("%sカレー」に決まりました!%n",bases[base]);
        sc.close();        
    }
}

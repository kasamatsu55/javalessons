package day17;
import java.util.*;
public class BombGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int bombHp = 50;
        System.out.println("爆弾ゲームをしましょう");
        while(bombHp > 0){
            int num;
            System.out.println("ダイス！");
            int dice = rand.nextInt(100);
            System.out.println(dice + "！");
            while(true){
                num = sc.nextInt();
                if(num == dice/10 && dice >= 10){
                    System.out.printf("%d！",dice / 10);
                    break;
                }else if(num == dice % 10){
                    System.out.printf("%d！",dice % 10);
                    break;
                }else{
                    System.out.println("無効です、もう一度入力してください");
                }
            }
            bombHp -= num;
            System.out.printf(":残り%d%n",bombHp);
        }
        System.out.println("!!!!!!!!!!Bomb!!!!!!!!!!");
        System.out.println("今のプレイヤーの負けです");
        sc.close();
    }
}

package day10;
import java.util.*;
public class Array6 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("魔王討伐ゲーム");
        System.out.println("10人の戦士が集まった");
        int[] heros = new int[10];
        int boss = 800;

        for(int i = 0; i < heros.length; i++){
            heros[i] = rand.nextInt(71) + 30;
        }

        System.out.println(Arrays.toString(heros));

        for(int i = 0; i < heros.length; i++){
            int num = rand.nextInt(5);
            if(num == 2){
                System.out.print((i+1) + "の攻撃 クリティカル！" + (heros[i] * 2) + "のダメージを与えた");
                boss -= heros[i] * 2;
            }else{
                System.out.print((i+1) + "の攻撃 " + heros[i] + "のダメージを与えた");
                boss -= heros[i];
            }
            System.out.println("(残:" + boss + ")");
            if(boss < 0){
                break;
            }
        }
        if(boss > 0){
            System.out.println("討伐失敗!!");
        }else{
            System.out.println("討伐成功!!");
        }
    }
}

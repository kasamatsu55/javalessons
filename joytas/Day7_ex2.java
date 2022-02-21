package joytas;
import java.util.*;
public class Day7_ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("ジャンケンゲーム!!");
        System.out.print("手を入力してね。0:グー,1:チョキ,2:パー＞");
        int you = scan.nextInt();
        int pc = rand.nextInt(3);
        switch(you){
            case 0:
            System.out.println("あなたはグー");
            break;
            case 1:
            System.out.println("あなたはチョキ");
            break;
            case 2:
            System.out.println("あなたはパー");
            break;
        }
        switch(pc){
            case 0:
            System.out.println("PCはグー");
            break;
            case 1:
            System.out.println("PCはチョキ");
            break;
            case 2:
            System.out.println("PCはパー");
            break;
        }
        if((you == 0 && pc== 1) || (you == 1 && pc== 2) || (you == 2 && pc== 0)){
            System.out.println("あなたの勝ち！");
        }else if(you == pc){
            System.out.println("あいこ");
        }else{
            System.out.println("PCの勝ち！");
        }
        scan.close();
    }
}

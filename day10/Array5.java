package day10;
import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] hands = {"グー","チョキ","パー"};
        //結果の配列
        String[] results = {"あいこ","PCの勝ち","あなたの勝ち"};
        System.out.print("手を入力(0:グー,1:チョキ,2:パー)＞");
        int you = sc.nextInt();
        System.out.println("あなたは" + hands[you]);
        int pc = rand.nextInt(hands.length);
        System.out.println("PCは" + hands[pc]);
        //判定
        int diff = (you + 3 - pc) % 3;
        System.out.println(results[diff]);

        //判定
        // if(you == pc){
        //     System.out.println("あいこ");
        // }else if((you == 0 && pc == 1) || (you == 1 && pc == 2) || (you == 2 && pc == 0)){
        //     System.out.println("あなたの勝ち");
        // }else{
        //     System.out.println("PCの勝ち");
        // }


        // if(you == pc){
        //     System.out.println("あいこ");
        // }else if((you == 0 && pc == 1) || (you == 1 && pc == 2) || (you == 2 && pc == 0)){
        //     System.out.println("あなたの勝ち");
        // }else{
        //     System.out.println("PCの勝ち");
        // }
        sc.close();
    }
}

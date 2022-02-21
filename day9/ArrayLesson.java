package day9;
import java.util.*;
public class ArrayLesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //役者の準備
        Random rand = new Random();            //役者の準備
        System.out.print("サイコロ何回？＞");   //回数を聞く
        int count = scan.nextInt();             //入力
        int[] dices = new int[count];            //配列を作る(定義する)
        for(int i = 0; i < dices.length; i++){
            dices[i] = rand.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(dices)); //配列を出力する
        scan.close();
    }
}

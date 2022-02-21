package day12;
import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("サイコロ何回＞");
        int num = sc.nextInt();
        int[] dices = new int[num];
        for(int i = 0; i < dices.length; i++){
            dices[i] = rand.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(dices));
        //逆順の配列を作る
        // int[] reverseDices = new int[num];
        // for(int i = 0; i < num; i++){
        //     reverseDices[i] = dices[num-1-i];
        // }
        // System.out.println(Arrays.toString(reverseDices));
        for(int i = 0; i < num/2; i++){
            int temp = dices[i];
            dices[i] = dices[num-1-i];
            dices[num-1-i] = temp;
        }
        System.out.println(Arrays.toString(dices));
        

        sc.close();
    }
}

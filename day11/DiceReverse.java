package day11;
import java.util.*;
public class DiceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何個＞");
        int num = sc.nextInt();
        int[] dices = new int[num];
        for(int i = 0; i < dices.length; i++){
            dices[i] = rand.nextInt(6) + 1;
        }
        System.out.println(Arrays.toString(dices));
        System.out.println("逆順にしました");
        for(int i = 0; i < dices.length/2; i++){
            int x = dices[i];
            dices[i] = dices[(dices.length) -1 - i];
            dices[(dices.length) -1 - i] = x;
        }
        System.out.println(Arrays.toString(dices));
        sc.close();
    }
}

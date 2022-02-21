package day13;
import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] lottery = new int[9999];
        for(int i = 0; i < lottery.length; i++){
            lottery[i] = i + 1;
        }
        System.out.print("何枚買う＞＞");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int index = rand.nextInt(lottery.length-i)+i;
            System.out.printf("%d,",lottery[index]);
            int tmp = lottery[index];
            lottery[index] = lottery[i];
            lottery[i] = tmp;
        }
        System.out.println();
        System.out.println("当選番号");
        int hitIndex = rand.nextInt(lottery.length);
        System.out.println(lottery[hitIndex]);
        boolean result = false;
        for(int i = 0; i < num; i++){
            if(i == hitIndex){
                result = true;
                break;
            }
        }
        System.out.println(result == true ? "当たり！！":"残念でした");
        sc.close();
    }
}

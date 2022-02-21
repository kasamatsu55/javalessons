package day11;
import java.util.*;
public class DiceMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("サイコロ何回＞");
        int num = sc.nextInt();
        int[] dices = new int[num]; //new int[sc.nextInt()]にして1行にもできる
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < dices.length; i++){
            dices[i] = rand.nextInt(6) + 1;
            sum += dices[i];
            if(i == 0){
                max = min = dices[i];
            }else if(max < dices[i]){
                max = dices[i];
            }else if(min > dices[i]){
                min = dices[i];
            }
        }
        System.out.printf(Arrays.toString(dices) + "(合計：%d)%n",sum);
        System.out.printf("最小:%d %n最大:%d",min,max);
        sc.close();
    }
}

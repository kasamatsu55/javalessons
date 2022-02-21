package day12;
import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        //サイコロを入力回数ふって表示させ、
        //最大と最小を出力する
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("サイコロ何回＞");
        int count = sc.nextInt();
        //配列作成&集計
        int[] dices = new int[count];
        int sum = 0;
        for(int i = 0; i < dices.length; i++){
            dices[i] = rand.nextInt(6) + 1;
            sum += dices[i];
        }
        //出力
        System.out.printf("%s(合計:%d)%n",Arrays.toString(dices),sum);
        //最大、最小
        int min = dices[0];
        int max = dices[0];
        for(int i = 0; i < dices.length; i++){  //Math.max(min,dices[i])でも求められる
            if(dices[i] < min){
                min = dices[i];
            }
            if(dices[i] > max){
                max = dices[i];
            }
        }
        System.out.printf("最大:%d%n",max);
        System.out.printf("最小:%d%n",min);
        sc.close();
    }
}

package day17;
import java.util.*;
public class ArrLesson1 {
    public static void main(String[] args) {
        //ジャグ配列の場合
        Random rand = new Random();
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[][] sales = new int[12][];
        for(int i = 0; i < sales.length; i++){
            sales[i] = new int[days[i]];
            for(int j = 0; j < sales[i].length; j++){
                sales[i][j] = rand.nextInt(41)+10;
            }
        }
        for(int i = 0; i < sales.length; i++){
            System.out.printf("%2d|",i + 1);
            int sTotal = 0;
            for(int j = 0; j < sales[i].length; j++){
                sTotal += sales[i][j];
                System.out.printf("%3d",sales[i][j]);
            }
            System.out.printf("|%4d%n",sTotal);
        }
    }
}

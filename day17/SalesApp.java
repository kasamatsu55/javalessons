package day17;
import java.util.*;
public class SalesApp {
   public static void main(String[] args) {
       //「*」表示バージョン
       Random rand = new Random();
       int[][] sales = new int[12][31];
       int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
       for(int i = 0; i < sales.length; i++){
           for(int j = 0; j < days[i]; j++){
               sales[i][j] = rand.nextInt(41)+10;
           }
        }
        //デバッグプリント　多次元配列でも可能
        // System.out.println(Arrays.deepToString(sales));

        for(int i = 0; i < sales.length; i++){
            System.out.printf("%2d|",i + 1);
            int mTotal = 0;
            for(int j = 0; j < sales[i].length; j++){
                mTotal += sales[i][j];
                System.out.printf("%3s",sales[i][j] == 0 ? "*":sales[i][j]+"");
            }
            System.out.printf("|%4d%n",mTotal);
        }

    } 
}

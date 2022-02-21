package day17;
import java.util.*;
public class SalesApp1 {
    public static void main(String[] args) {
        //ランダム表示した後に売り上げの多い月順に並べる
        //まずは表示
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
            System.out.printf("%s|",i + 1);
            int sTotal = 0;
            for(int j = 0; j < sales[i].length; j++){
                sTotal += sales[i][j];
                System.out.printf("%3d",sales[i][j]);
            }
            System.out.printf("|%4d%n",sTotal);
        }

        //多い順に並び替え
        System.out.println("並び替え");
        int[] sTotals = new int[12];
        for(int i = 0; i < sales.length; i++){
            for(int j = 0; j < sales[i].length; j++){
                sTotals[i] += sales[i][j];
            }
        }
        int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int i = 0; i < sales.length -1; i++){
            for(int j = i + 1 ; j < sales.length; j++){
                if(sTotals[i] < sTotals[j]){
                    int temp = months[i];
                    months[i] = months[j];
                    months[j] = temp;
                    int temp1 = sTotals[i];
                    sTotals[i] = sTotals[j];
                    sTotals[j] = temp1;
                    int[] temp2 = sales[i];
                    sales[i] = sales[j];
                    sales[j] = temp2;
                }
            }
        }
        for(int i = 0; i < sales.length; i++){
            System.out.printf("%2d|",months[i]);
            for(int j = 0; j < sales[i].length; j++){
                System.out.printf("%3d",sales[i][j]);
            }
            System.out.printf("|%4d%n",sTotals[i]);
        }       
    }
}

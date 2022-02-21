package day15;
import java.util.*;
public class Baseball1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] points = new int[2][9];
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points[i].length; j++){
                int index = rand.nextInt(100);
                if(index > 97){
                    points[i][j] = 4;
                }else if(index > 94){
                    points[i][j] = 3;
                }else if(index > 89){
                    points[i][j] = 2;
                }else if(index > 69){
                    points[i][j] = 1;
                }else{
                    points[i][j] = 0;
                }
            }
        }
        String[] teams = {"G","T"};
        int[] sums = new int[2];
        for(int i = 0; i < points.length; i++){
            System.out.printf("%s|",teams[i]);
            for(int j = 0; j < points[i].length; j++){
                if(i == 1 && j == 8 && sums[0] < sums[i]){
                    System.out.print("x");
                }else{
                    System.out.print(points[i][j]);
                    sums[i] += points[i][j];
                }
                if((j + 1) % 3 == 0){
                    System.out.print("|");
                }
            }
            System.out.printf("%d%n",sums[i]);
        }
    }
}

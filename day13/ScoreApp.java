package day13;
import java.util.*;
public class ScoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("クラスの数＞＞");
        int classNum = sc.nextInt();
        int[][] data = new int[classNum][];
        for(int i = 0; i < data.length; i++){
            System.out.printf("%d組のクラスの人数＞＞",i+1);
            int sNum = sc.nextInt();
            // int[] arr = new int[sNum];
            // data[i] = arr;
            data[i] = new int[sNum];
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%d組%d人目の点数＞＞",i+1,j+1);
                data[i][j] = sc.nextInt();
            }
        }
        System.out.println("--表出力--");
        sc.close();
        for(int i = 0; i < data.length; i++){
            System.out.printf("%d組",i+1);
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%4d",data[i][j]);
            }
            System.out.println();
        }
    }
}

package day13;
import java.util.*;
public class ScoreApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] data = new int[6][][];
        for(int i = 0; i < 6; i++){
            System.out.printf("%d年のクラスの数＞＞",i+1);
            int classNo = sc.nextInt();
            data[i] = new int[classNo][];
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%d年%d組のクラスの人数＞＞",i+1,j+1);
                int menbers = sc.nextInt();
                data[i][j] = new int[menbers];
                for(int k = 0; k < data[i][j].length; k++){
                    System.out.printf("%d組%d人目の点数＞＞",j+1,k+1);
                    data[i][j][k] = sc.nextInt();
                }
            }
        }
        sc.close();
        System.out.println("--表出力--");
        for(int i = 0; i < 6; i++){
            System.out.printf("%d年生%n",i+1);
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%d組 ",j+1);
                for(int k = 0; k < data[i][j].length; k++){
                    System.out.printf("%4d",data[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

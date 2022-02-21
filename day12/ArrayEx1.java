package day12;
import java.util.*;
public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何行＞");
        int row = sc.nextInt();
        System.out.print("何列＞");
        int col = sc.nextInt();
        int[][] data = new int[row][col];
        //2次元配列の作成
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                data[i][j] = rand.nextInt(99) + 1;
            }
        }
        //出力
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                System.out.printf("%3d",data[i][j]);
            }
            System.out.println();
        }

        System.out.print("[");
        for(int i = 0; i < data.length; i++){
            System.out.print(Arrays.toString(data[i]));
            System.out.print(",");
        }
        System.out.println("]");
        sc.close();
    }
}

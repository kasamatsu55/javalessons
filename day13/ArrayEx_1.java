package day13;
import java.util.*;
public class ArrayEx_1 {
    public static void main(String[] args) {
        int[][] data= {
            {2,3,4},
            {12,13,14},
            {22,23,24},
            {32,33,34},
        };
        for(int i = 0; i < data.length; i++){
            System.out.println(Arrays.toString(data[i]));
        }
        //拡張for文
        for(int[] arr : data){
            System.out.println(Arrays.toString(arr));
        }
        // //3次元配列
        // int[][][] data2 = new int[2][3][4];
        // for(int[][] arr : data2){
        //     for(int[] arr2 : arr){
        //         System.out.println(Arrays.toString(arr2));
        //     }
        // }
    }
}

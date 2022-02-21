package day14;
import java.util.*;
public class SortLesson {
    public static void main(String[] args) {
        int[] data = {3,1,5,8,2};
        //単純ソート 基準点と比較していく
        // for(int i = 0; i < data.length - 1; i++){
        //     for(int j = i + 1; j < data.length; j++){
        //         if(data[i] > data[j]){  //降順の場合は「<」
        //             int temp = data[i];
        //             data[i] = data[j];
        //             data[j] = temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(data));

        //バブルソート　隣りの値と比較していく
        for(int i = 0; i < data.length - 1; i++){
            for(int j = data.length - 1; j > i; j--){
                if(data[j] < data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}

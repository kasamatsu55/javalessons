package day19;
import java.util.*;
public class Method3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,};
        int[] arr2 = {10,11,12};
        int[] result = mergeArr(arr1,arr2);
        System.out.println(Arrays.toString(result));

        int[][] arr3 = {{1,2,3},{4,5}};
        System.out.println(sumOf(arr3));
    }

    //2つの配列をつなぎ合わせる
    public static int[] mergeArr(int[] arr1,int[] arr2){
        int[] retArr = new int[arr1.length+arr2.length];
        for(int i=0;i<retArr.length;i++){
            if(i < arr1.length){
                retArr[i]=arr1[i];
            }else{
                retArr[i]=arr2[i-arr1.length];
            }
        }
        return retArr;
    }

    //2次元配列の要素をすべて足す
    public static int sumOf(int[][] arr){
        int sum = 0;
        //拡張for文バージョン
    //     for(int[] ar : arr){
    //         for(int n: ar){
    //             sum += n;
    //         }
    //     }
    //     return sum;
    // }

    // 2重for文バージョン
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}

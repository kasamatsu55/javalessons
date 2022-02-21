package joytas;

public class Day10_ex6 {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5};
        int[] arr2 = {4,5,6};
        System.out.printf("２つの配列%sと%sを足した新たな配列を作成します。%n",
                            Day10_ex5.random3(arr1),Day10_ex5.random3(arr2)); //random3を作ったファイルから呼び出す。
        System.out.println(Day10_ex5.random3(sumArr(arr1,arr2)));
    }
    public static int[] sumArr(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i]+arr2[i];
        }
        return arr3;
    }
}

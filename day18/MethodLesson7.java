package day18;
import java.util.*;
public class MethodLesson7 {
    public static void main(String[] args) {
        char[] arr = toCharArr("Hello");
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1,2,3,4,5};
        shuffleArr(arr2);
        System.out.println(Arrays.toString(arr2));

        sortArr(arr2);
        System.out.println(Arrays.toString(arr2));

    }
    //文字列を配列にするメソッド
    public static char[] toCharArr(String str){
        char[] arr = new char[str.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    //シャッフルするメソッド
    public static void shuffleArr(int[] arr){ //参照値渡し（配列のアドレスが渡されるので原本も変わってしまう）
        Random rand = new Random();
        for(int i = 0; i < arr.length - 1; i++){
            int idx = rand.nextInt(arr.length-i) + i;
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    //ソートするメソッド
    public static void sortArr(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){ //昇順
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

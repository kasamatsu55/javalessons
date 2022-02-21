package day19;
import java.util.*;
public class Method2 {
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3}; //メモリ空間にあるのは1つの配列だけ

        System.out.println(Arrays.toString(data));

        timesArr(data,3);
        System.out.println(Arrays.toString(data));

        reverseArr(data);
        System.out.println(Arrays.toString(data));

        int[] result=createTimesArr(data,2); //メモリ空間に新しい配列ができる
        System.out.println(Arrays.toString(result));

    }

    //配列の数を指定倍数する
    public static void timesArr(int[] arr,int times){
        for(int i=0;i<arr.length;i++){
            arr[i] *= times;
        }
    }

    //配列を逆順にする
    public static void reverseArr(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    //新しい配列を作って返却する
    public static int[] createTimesArr(int[] arr,int times){
        int[] retArr = new int[arr.length]; //0が入った配列がメモリ空間に新たに作られる
        for(int i=0;i<retArr.length;i++){
            retArr[i] = arr[i] * times;
        }
        return retArr; //mainに返却すると「retArr」はメモリ空間から消える
    }
}

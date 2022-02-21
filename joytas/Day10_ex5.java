package joytas;
import java.util.*;
public class Day10_ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("0～100の乱数を3つ生成します。");
        int[] arr = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(101);
        }
        System.out.println(random3(arr));
    }
    public static String random3(int[] arr){
        String str = "{";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
            if(i<arr.length-1){
                str+=",";
            }
        }
        str+="}";
        return str;
    }
}

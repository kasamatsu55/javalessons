package util;
import java.util.*;
public class Common {
    //文字列を配列に変換
    public static char[] toCharArr(String str){
        char[] arr = new char[str.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    //配列の中身をシャッフル
    public static void shuffleArr(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length - 1; i++){
            int idx = rand.nextInt(arr.length-i) + i;
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    //配列の中身を昇順に並び替え
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

    //配列を逆順にする
    public static void reverseArr(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    //ランダム値
    public static int randRange(int start,int end){
        Random rand = new Random();
        return rand.nextInt(end-start + 1) + start;
    }
    //ゾロ目
    public static boolean isZoro(int n){
        if(n < 10){
            return false;
        }
        char[] arr = String.valueOf(n).toCharArray();
        char first = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != first){
              return false;
            }
          }
          return true;
    }
    //数字の文字数をカウントする場合（桁数を求める場合に使える）
    public static int numLength(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
    //文字列に変換して、数字の文字数をカウントする場合
    public static int nStr(int n){
        String nStr=String.valueOf(n);
        int count =nStr.length();
        return count;
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
        for(int[] ar : arr){
            for(int n: ar){
                sum += n;
            }
        }
        return sum;
    }
    
    //引数に文字列型配列と文字列を受け取り、その文字列が最初に現れるindexを返却する。
    //もしなかった場合は-1を返却する
    public static int indexOfArr(String[] arr,String word){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(word)){
                return i;
            }
        }
        return -1;
    }

    //引数に文字列型配列と文字列を受け取り、
    //配列内に含まれる文字列の個数を求めるメソッド
    public static int countOfArr(String[] arr,String word){
        int count=0;
        for(String s : arr){
          if(s.equals(word)){
            count++;
          }
        }
        return count;
    }

    //2つの数字が入った配列を昇順に並び変える
    public static int[] sort(int[] n){
        if(n[0] > n[1]){
            int temp = n[0];
            n[0] = n[1];
            n[1] = temp;
        }
        return n;
    }
}

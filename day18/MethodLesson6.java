package day18;
import java.util.*;
public class MethodLesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("自然数>");
        int num = sc.nextInt();
        // System.out.printf("%dは%d桁です",num,numLength(num));

        //文字列でやる場合
        System.out.printf("%sは%s桁です%n",num,nStr(num));

        //ゾロ目判定
        System.out.printf("%dはゾロ目%s",num,isZoro(num) ? "です":"ではありません");

        sc.close();

    }
    // 10で割っていくパターン
    // public static int numLength(int n){
    //     int count = 0;
    //     while(n > 0){
    //         count++;
    //         n = n / 10;
    //     }
    //     return count;
    // }

    //文字数をカウントする場合
    public static int nStr(int n){
        String nStr=String.valueOf(n); //String型に変換
        int count =nStr.length();
        return count;
    }

    //ゾロ目判定
    public static boolean isZoro(int n){
        if(n < 10){
            return false;
        }
        char[] arr = String.valueOf(n).toCharArray(); //String型に変換して、文字列をchar型の配列に変換
        char first = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != first){
              return false;
            }
          }
          return true;
    }
}

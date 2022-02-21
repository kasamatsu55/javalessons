package day18;
import java.util.*;
public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値を入力>>");
        int n = sc.nextInt();
        System.out.printf("逆順に表示します%s%n",numReverse(n));
        sc.close();
    }
    public static String numReverse(int n){
        String result ="";
        while(n > 0){
            result += n % 10; //一番小さい桁の数字がresultに足されていく
            n /= 10; //10で割って桁数を下げていく
        }
        return result;
    }
}

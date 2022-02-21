package joytas;
import java.util.*;
public class Day10_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("繰り返す文字>");
        String words = sc.nextLine();
        System.out.print("繰り返す回数>");
        int num = sc.nextInt();
        System.out.println(wordsTimes(words,num));
        sc.close();
    }
    public static String wordsTimes(String s,int n){
        String sum ="";
        for(int i = 0; i < n; i++){
            sum += s;
        }
        return sum;
    }
}

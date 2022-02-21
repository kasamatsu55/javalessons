package joytas;
import java.util.*;
public class Day5_ex6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(21);
        int b = rand.nextInt(21);
        int c = rand.nextInt(21);
        if(a < b){
            int x = a;
            a = b;
            b = x;
        }
        if(a < c){
            int x = a;
            a = c;
            c = x;
        }
        if(b < c){
            int x = b;
            b = c;
            c = x;
        }
        System.out.println("3つの乱数を小さい順に並べました。"+ c + "," + b + "," + a);
    }
}

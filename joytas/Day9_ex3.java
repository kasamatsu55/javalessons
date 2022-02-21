package joytas;
import java.util.*;
public class Day9_ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入れてください。>");
        int num = sc.nextInt();
        System.out.printf("%dを3乗すると%dです。",num,cubed(num));
        sc.close();

    }
    public static int cubed(int num){
        int numCubed = num*num*num;
        return numCubed;
    }
}

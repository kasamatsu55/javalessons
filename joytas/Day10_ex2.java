package joytas;
import java.util.*;
public class Day10_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数>");
        int num = sc.nextInt();
        System.out.printf("%dは%sです",num,odd(num)?"偶数":"奇数");
        sc.close();
    }
    public static boolean odd(int n){
        boolean odd = n % 2 == 0 ? true:false;
        return odd;
    }
}

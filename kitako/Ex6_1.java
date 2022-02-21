package kitako;
import java.util.*;
public class Ex6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数>");
        int num = sc.nextInt();
        System.out.println(squared(num));
        sc.close();
    }
    public static int squared(int n){
        return n*n;
    }
}

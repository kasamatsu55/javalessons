package kitako;
import java.util.*;
public class Ex6_3 {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数1>");
        int num1 = sc.nextInt();
        System.out.print("整数2>");
        int num2 = sc.nextInt();
        System.out.print("整数3>");
        int num3 = sc.nextInt();
        System.out.println(max(max(num1,num2),num3));
        sc.close();        
    }
}

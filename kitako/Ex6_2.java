package kitako;
import java.util.*;
public class Ex6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数1>");
        int num1 = sc.nextInt();
        System.out.print("整数2>");
        int num2 = sc.nextInt();
        System.out.println(average(num1,num2));
        sc.close();
    }
    public static int average(int n,int m){
        return (n+m)/2;
    }
}

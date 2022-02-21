package day20;
import java.util.*;
public class MethodSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("数値1>>");
        int n1=sc.nextInt();
        System.out.print("数値2>>");
        int n2=sc.nextInt();
        int sum = sumOfRange(n1,n2);
        System.out.printf("%dから%dまでの和は%dです%n",
                          Math.min(n1,n2),Math.max(n1,n2),sum);
        sc.close();
      }
      public static int sumOfRange(int a,int b){
        int sum = 0;
        int from = Math.min(a,b);
        int to = Math.max(a,b);
        for(int i = from; i <= to; i++){
          sum = sum + i;
        }
        return sum;
      }
}

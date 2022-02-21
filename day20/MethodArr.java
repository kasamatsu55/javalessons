package day20;
import java.util.*;
public class MethodArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値1>");
        int num1 = sc.nextInt();
        System.out.print("数値2>");
        int num2 = sc.nextInt();
        System.out.println(Arrays.toString(fillOut(num1,num2)));
        sc.close();
    }
    public static int[] fillOut(int num1,int num2){
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        int[] arr = new int[max-min+1];
        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                arr[i-num1] = i;
            }
        }else{
            for(int i = num1; i >= num2; i--){
                arr[num1-i] = i;
            }
        }
        return arr;
    }
}

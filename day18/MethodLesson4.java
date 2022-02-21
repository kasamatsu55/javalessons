package day18;
import java.util.*;
public class MethodLesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("値>");
        int num = sc.nextInt();
        int sum = sumOf(num);
        System.out.printf("1から%dの合計は%dです",num,sum);
        // System.out.printf("1から%dの合計は%dです",num,sumOf(num));
        sc.close();
    }
    public static int sumOf(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}

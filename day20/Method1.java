package day20;
import java.util.*;
public class Method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        for(int i = 0; i < nums.length; i++){
            System.out.printf("数値%d>",i+1);
            nums[i] = sc.nextInt();
        }
        sort(nums);//小、大の順に並べ替える
        System.out.printf("%dから%dまでの和は%dです",
                        nums[0],nums[1],sumOfRange(nums[0],nums[1]));
        sc.close();
    }
    public static int sumOfRange(int a,int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
    public static int[] sort(int[] n){
        if(n[0] > n[1]){
            int temp = n[0];
            n[0] = n[1];
            n[1] = temp;
        }
        return n;
    }
}

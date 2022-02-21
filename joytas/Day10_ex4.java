package joytas;
import java.util.*;
public class Day10_ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("要素数>");
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i=0;i<num;i++){
            System.out.printf("要素%d>",i);
            nums[i] = sc.nextInt();
        }
        System.out.println("要素を2倍にしました。");
        arrTwice(nums);
        System.out.print("{");
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d,",nums[i]);
        }
        System.out.println("}");
        sc.close();
    }
    public static void arrTwice(int[] n){  //戻り値はなくていいので「void」
        for(int i=0;i<n.length;i++){
            n[i] *= 2;
        }
    }
}

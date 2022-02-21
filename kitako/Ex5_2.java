package kitako;
import java.util.*;
public class Ex5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < nums.length; i++){
            System.out.print(i + 1 + "個目の数値を入力してください＞");
            nums[i] = scan.nextInt();
        }
        System.out.println();
        for(int i = nums.length - 1; i >= 0; i--){
            System.out.print(nums[i] + " ");
        }
        scan.close();
    }
}

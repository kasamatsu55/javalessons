package day14;
import java.util.*;
public class SortLesson1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[1000];
        for(int i = 0; i < nums.length; i++){
            nums[i] = rand.nextInt(9999) + 1;
        }
        // System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1 ; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i+1] == nums[i]){
        //         continue;
        //     }else{
        //         System.out.printf("%5d",nums[i]);
        //         count++;
        //     }
        //     if(count == 2){
        //         break;
        //     }
        //     if(i <= nums.length-1){
        //         System.out.print(",");
        //     }         
        // }

        //while文使って短く
        // int i = 0;
        // while(true){
        //     if(nums[i] == nums[i+1]){
        //         i++;
        //         continue;
        //     }else{
        //         System.out.printf("%5d,%5d",nums[i],nums[i+1]);
        //         break;
        //     }
        // }

        //for文でシンプルに
        for(int i = 1; i < nums.length; i++){ //nums[0]がMAXなのはわかっているので
            if(nums[i] != nums[i-1]){
                System.out.printf("%5d,%5d",nums[i-1],nums[i]);
                break;
            }
        }
    }
}

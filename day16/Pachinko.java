package day16;
import java.util.*;
public class Pachinko {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++){
            int index = rand.nextInt(100);
            if(index < 15){
                nums[i] = 1;
            }else if(index < 30){
                nums[i] = 2;
            }else if(index < 45){
                nums[i] = 3;
            }else if(index < 60){
                nums[i] = 4;
            }else if(index < 75){
                nums[i] = 5;
            }else if(index < 90){
                nums[i] = 6;
            }else{
                nums[i] = 7;
            }
            System.out.print(nums[i]);
        }
        System.out.println();
        if(nums[0] == nums[1] && nums[0] == nums[2]){
            if(nums[0] == 7){
                System.out.println("超大当たり");
            }else{
                System.out.println("大当たり");
            }
        }else{
            System.out.println("ハズレ");
        }
    }
}

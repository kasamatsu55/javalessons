package joytas;

public class Day8_ex2 {
    public static void main(String[] args) {
        int[] nums = {3,8,10,5,4};
        for(int i = 0; i < nums.length; i++){
            nums[i] *= 2;
        }
        for(int n : nums){
            System.out.println(n);
        }
    }
}

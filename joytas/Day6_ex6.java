package joytas;

public class Day6_ex6 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = new java.util.Random().nextInt(101);
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println("nums[" + i + "]:" + nums[i]);
        }
    }
}

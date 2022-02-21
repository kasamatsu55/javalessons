package day15;

public class Test {
    public static void main(String[] args) {
        int[] nums = {123,33,456,444,443,77,555,0,8,666,65,348,77,1111,};
        for(int i = 0; i < nums.length; i++){
            if((nums[i]/100) == (nums[i]/10)%10 || (nums[i]/10) == (nums[i]%10)){
                System.out.println(nums[i] + "はゾロ目です");
            }
        }
    }
}

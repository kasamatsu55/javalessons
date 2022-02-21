package day12;

public class Test {
    public static void main(String[] args) {
        int age = 20;
        double weight = 67.8;
        String name = "sato";
        char bloodType = 'b';
        int[] dices = {1,2,3,4,5,6};

        System.out.println(java.util.Arrays.toString(dices));
        System.out.printf("%sさんの年齢は%dで体重は%.1fkgで血液型は%sです",name,age,weight,bloodType);
    }
}

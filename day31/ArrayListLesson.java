package day31;
import java.util.*;
public class ArrayListLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ArrayListを使ってみよう！");
        System.out.println("Listに数字をどんどん追加していってみよう。");
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            System.out.print("要素追加するよ。数字を入れてね(0で終了):");
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            nums.add(n);
            System.out.println(n + "をListに追加したよ！");
        }
        sc.close();
        System.out.println("——結果——");
        System.out.println("要素数:" + nums.size());
        System.out.print("要素:");
        for(int i : nums){
            System.out.print(i + ",");
        }
    }
}

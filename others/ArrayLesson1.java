package others;
import java.util.*;
public class ArrayLesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ans = {"もう少しがんばりましょう","この調子で頑張りましょう","たいへん優秀です"};
        while(true){
            System.out.print("成績を入力してください。(1～3)>");
            int score = sc.nextInt();
            if(score < 1 || score > ans.length){
                System.out.println("1～3の数字を入力してください");
            }else{
                System.out.println(ans[score-1]);
                break;
            }
        }
        sc.close();
    }
}

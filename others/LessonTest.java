package others;
import java.util.*;
public class LessonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5人のテストの点数を入力してください。");
        int[] scores = new int[5];
        for(int i = 0; i < 5; i++){
            scores[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < 5; i++){
            System.out.println(i + 1 + "番目の人の点数は" + scores[i] + "です。");
            if(max < scores[i]){                
                max = scores[i];
            }
        }
        System.out.println("最高点は" + max + "点です");
    }
}

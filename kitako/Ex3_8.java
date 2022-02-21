package kitako;
import java.util.*;
public class Ex3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("中間試験の点数を入力してください＞");
        int score1 = sc.nextInt();
        System.out.print("期末試験の点数を入力してください＞");
        int score2 = sc.nextInt();
        if(score1 >= 60 && score2 >= 60){
            System.out.println("合格");
        }else if(score1 + score2 >= 130){
            System.out.println("合格");
        }else if(score1 + score2 >= 100 && (score1 >= 90 || score2 >= 90)){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
        // if(score1 >= 60 && score2 >= 60 || (score1 + score2 >= 130) || (score1 + score2 >= 100 && (score1 >= 90 || score2 >= 90))){
        //     System.out.println("合格");
        // }else{
        //     System.out.println("不合格");
        // }
        sc.close();
    }
}

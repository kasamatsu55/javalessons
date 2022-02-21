package kitako;
import java.util.*;
public class Ex3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("試験の点数を入力してください＞");
        int test = sc.nextInt();
        
        System.out.println("ケース1");
        if(test > 100){
            System.out.println("判定できません");
        }else if(test >= 60 && test <= 100){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }

        System.out.println("ケース2");
        if(test > 100){
            System.out.println("判定できません");
        }else if(test >= 80 && test <= 100){
            System.out.println("たいへんよくできました");
        }else if(test >= 60){
            System.out.println("よくできました");
        }else{
            System.out.println("ざんねんでした");
        }
        
        System.out.println("ケース3");
        if(test > 100){
            System.out.println("判定できません");
        }else if(test >= 80 && test <= 100){
            System.out.println("優");
        }else if(test >= 70){
            System.out.println("良");
        }else if(test >= 60){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }
        sc.close();
    }
}

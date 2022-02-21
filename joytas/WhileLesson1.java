package joytas;
import java.util.*;
public class WhileLesson1 {
    public static void main(String[] args) {
        // 室温が設定温度(25)より高い場合には１度ずつ温度を下げる。(while文)
        Scanner sc = new Scanner(System.in);
        System.out.print("現在の室温を整数で入力してください＞");
        int temp = sc.nextInt();
        // while(temp > 25){
        //     temp--;
        //     System.out.printf("室温を1度下げました(%d度)%n",temp);
        // }
        // System.out.printf("現在の室温は%d度です",temp);

        // do-while文で
        do{
            temp--;
            System.out.printf("室温を1度下げました(%d度)%n",temp);
        }while(temp > 25);
        System.out.printf("現在の室温は%d度です",temp);
        sc.close();
    }
}

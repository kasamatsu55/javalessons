package joytas;
import java.util.*;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] days = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
        String[] answers = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        System.out.println("英語の曜日名を小文字で入力してください。");
        while(true){
            int num = rand.nextInt(7); //rand.nextInt(days.length);でも可
            System.out.print(days[num] + ":");
            String ans = sc.nextLine();
            if(ans.equals(answers[num])){
                System.out.print("正解です。続ける？ 1・・・Yes/0・・・No＞");
            }else{
                System.out.print("違います(" + answers[num] + ")。続ける？ 1・・・Yes/0・・・No＞");
            }
            int select = sc.nextInt(); sc.nextLine();
            if(select == 0){
                break;
            }
        }
        System.out.println("アプリケーションを終了します。");
        sc.close();
    }
}

package kitako;
import java.util.*;
public class Ex3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("日曜日：0　月曜日：1　火曜日：2　水曜日：3　木曜日：4　金曜日：5　土曜日：6");
        System.out.print("希望する曜日を数字で入力してください＞");
        int day = sc.nextInt();
        System.out.println("午前：0　午後：1　夜間：2");
        System.out.print("希望する時間帯を数字で入力してください＞");
        int time = sc.nextInt();
        if(day == 0 || (day == 2 && time == 0) || (day == 3 && time == 2) || (day == 5 && time == 0) || (day == 6 && time != 0)){
            System.out.println("休診");
        }else{
            System.out.println("開いています");
        }
        // boolean open = true;
        // if(day == 0){
        //     open = false;
        // }else if(time == 0 && (day == 2 || day == 5)){
        //     open = false;
        // }else if(time == 1 && day ==6){
        //     open = false;
        // }else if(time == 2 && (day == 3 || day == 6)){
        //     open = false;
        // }
        // if(open == true){
        //     System.out.println("診察しています");
        // }else{
        //     System.out.println("休診");
        // }
        sc.close();
    }
}

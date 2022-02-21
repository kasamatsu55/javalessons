package kitako;
import java.util.*;
public class Ex3_13 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("月の日数を表示します。何月を表示しますか？（数字）＞");
        int month = sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月は31日までです");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月は30日までです");
                break;
            case 2:
                System.out.println(month + "月は28日までです");
                break;
            default:
                System.out.println("入力が間違っています");
                break;
        }
        sc.close();
   } 
}

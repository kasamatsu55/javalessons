package day6;
import java.util.*;
public class Switchlesson {
    public static void main(String[] args){
        System.out.print("月＞");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
        case 3:
        case 4:
        case 5:
            System.out.println("春です");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("夏です");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("秋です");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println("冬です");
            break;
        default:
            System.out.println("そんな月はありません");
        }
        sc.close();
    }
}

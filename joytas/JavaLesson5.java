package joytas;
import java.util.*;
public class JavaLesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3桁の数値を入力してください。");
        while(true){
            System.out.print("数値:");
            int num = sc.nextInt();
            if(num / 100 >= 1 && num / 100 < 10){
                System.out.println(num + "と入力されました。");
                break;
            }else{
                System.out.println("エラー:3桁の数値を入力してください。");
            }
        }
        sc.close();
    }
}

package joytas;
import java.util.*;
public class JavaLesson3 {
    public static void main(String[] args) {
        //２つの整数を入力しそれらを降順に並び替える処理を作成せよ。
        Scanner sc = new Scanner(System.in);
        System.out.print("変数x:");
        int x = sc.nextInt();
        System.out.print("変数y:");
        int y = sc.nextInt();
        if(x != y){
            if(x < y){
                int temp = x;
                x = y;
                y = temp;
            }
            System.out.println("xとyが降順になるように並び替えました。");
            System.out.println("変数xには" + x + "が入っています。");
            System.out.println("変数yには" + y + "が入っています。");
        }else{
            System.out.println("xとyは同じ値です");
        }
        sc.close();
    }
}

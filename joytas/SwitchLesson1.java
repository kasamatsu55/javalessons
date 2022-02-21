package joytas;
import java.util.*;
public class SwitchLesson1 {
    public static void main(String[] args) {
        // 2つの整数と演算子を入力してもらい。その計算結果を表示するアプリを作成せよ。
        // ただし、switch文を使うこと
        Scanner sc = new Scanner(System.in);
        System.out.print("1つ目の整数xを入力してください＞");
        int x = sc.nextInt();
        System.out.print("2つ目の整数yを入力してください＞");
        int y = sc.nextInt(); sc.nextLine();
        System.out.print("演算子(+,-,*,/,%)を半角記号で入力してください＞");
        String ope = sc.nextLine();
        switch(ope){
            case "+":
                System.out.println("x+y=" + (x+y));
                break;
            case "-":
                System.out.println("x-y=" + (x-y));
                break;
            case "*":
                System.out.println("x*y=" + (x*y));
                break;
            case "/":
                System.out.println("x/y=" + (x/y));
                break;
            case "%":
                System.out.println("x%y=" + (x%y));
                break;
            default:
                System.out.println("error");
        }
        sc.close();
    }
}

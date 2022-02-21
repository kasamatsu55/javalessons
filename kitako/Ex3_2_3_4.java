package kitako;
import java.util.*;
public class Ex3_2_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字を入力してください＞");
        int x = sc.nextInt();
        System.out.print("もひとつ好きな数字を入力してください＞");
        int y = sc.nextInt();
        
        //3_2
        if(x > y) {
            System.out.println("大きい方は" + x + "です");
        }else if(y > x) {
            System.out.println("大きい方は" + y + "です");
        }else{
            System.out.println("(ふたつの数は同じです)");
        }

        //3_3
        if(x > y) {
            System.out.println(x + "は" + y +"より大きい");
        }else if(x < y) {
            System.out.println(x + "は" + y +"より小さい");
        }else{
            System.out.println("(ふたつの数は同じです)");
        }

        //3_4
        if(x > y) {
            System.out.println(x + "は" + y +"より大きい");
        }else if(x < y) {
            System.out.println(x + "は" + y +"より小さい");
        }else{
            System.out.println(x + "と" + y +"は等しい");
        }
        sc.close();
    }
}

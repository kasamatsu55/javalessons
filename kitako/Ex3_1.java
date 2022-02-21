package kitako;
import java.util.*;
public class Ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字(x)を入力してください＞");
        int x = sc.nextInt();
        System.out.print("好きな数字(y)を入力してください＞");
        int y = sc.nextInt();
        if(x > y) {
            System.out.println(x + "は" + y + "より大きい");
        }
        sc.close();
    }
}

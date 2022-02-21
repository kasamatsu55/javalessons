package kitako;
import java.util.*;
public class Ex3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字を入力してください＞");
        int x = sc.nextInt();
        if(x % 2 == 0) {
            System.out.println(x + "は偶数です");
        }else{
            System.out.println(x + "は奇数です");
        }
        sc.close();
    }
}

package kitako;
import java.util.*;
public class Ex3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("好きな数字を入力してください＞");
        int x = sc.nextInt();
        if(x >= 0 && x % 2 == 0) {
            System.out.println(x + "は、正の偶数");
        }else if(x > 0) {
            System.out.println(x + "は、正の奇数");
        }else if(x % 2 == 0) {
            System.out.println(x + "は、負の偶数");
        }else{
            System.out.println(x + "は、負の奇数");
        }
        sc.close();
    }
}

package kitako;
import java.util.*;
public class Ex2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください＞");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
        // for(int i = 1; i <= 3; i++){
        //     System.out.println(x);
        //     x = x * x;
        // }
        sc.close();
    }
}

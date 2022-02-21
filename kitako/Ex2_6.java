package kitako;
import java.util.*;
public class Ex2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("あなたの年齢を入力してください＞");
        int age = sc.nextInt();
        System.out.println("あなたが生まれてから、およそ" + (age * 365) + "日です");
        sc.close();
    }
}

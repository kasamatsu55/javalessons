package joytas;
import java.util.*;
public class Day3_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("あなたの名前を入力してください＞");
        String name = scan.nextLine();
        System.out.println("こんにちは"+ name +"さん！");
        scan.close();
    }
}

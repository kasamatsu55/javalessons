package day7;
import java.util.*;
public class Dog {
    public static void main(String[] args) {
        System.out.print("犬の名前＞＞");
        String dogName = new Scanner(System.in).nextLine();
        System.out.print(dogName + "の年齢＞＞");
        int dogAge = new Scanner(System.in).nextInt();
        System.out.println(dogName + "は人間の年齢に換算すると" + (dogAge * 7) + "歳です。");
    }
}

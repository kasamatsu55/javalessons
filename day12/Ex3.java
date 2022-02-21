package day12;
import java.util.*;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("年齢＞");
        int age = sc.nextInt();sc.nextLine(); //空読み
        System.out.print("名前＞");
        String name = sc.nextLine(); //ageのエンターに反応してしまうので不具合
        System.out.printf("%s(%d)さん、こんにちは%n",name,age);
        sc.close();
    }
}

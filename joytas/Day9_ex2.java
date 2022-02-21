package joytas;
import java.util.*;
public class Day9_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("お名前を入力してください>");
        String name = sc.nextLine();
        System.out.print("年齢をいれてください>");
        int age = sc.nextInt();
        hello(name,age);
        sc.close();
    }
    public static void hello(String name,int age){
        System.out.printf("%s(%d)さん、こんにちは！",name,age);
    }
}

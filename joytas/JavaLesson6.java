package joytas;
import java.util.*;
public class JavaLesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("あなたの身長(㎝)＞");
        double height = sc.nextDouble()/100;
        System.out.print("あなたの体重(kg＞");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("あなたのBMIは%.2fです!",bmi);
        sc.close();
    }
}

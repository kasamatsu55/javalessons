package joytas;
import java.util.*;
public class Day9_ex6 {
    public static double getBMI(double heightCm,double weightKg){
        double BMI = weightKg/(heightCm/100)/(heightCm/100);
        return BMI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長を入力してください(cm)>");
        double height = sc.nextDouble();
        System.out.print("体重を入力してください(kg)>");
        double weight = sc.nextDouble();
        System.out.printf("あなたのBMIは%.2fです。",getBMI(height,weight));
        sc.close();
    }
}

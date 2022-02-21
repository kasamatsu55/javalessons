package day20;
import java.util.*;
public class MethodBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("身長(cm)>>");
        double height = sc.nextDouble();
        System.out.print("体重(kg)>>");
        double weight = sc.nextDouble();
        System.out.printf("身長%.1f体重%.1fのBMIは%.1fです%n"
                        ,height,weight,calcBMI(height,weight));
        sc.close();
    }
    public static double calcBMI(double heightCm,double weightKg){ //他の人でもわかりやすい表記
        double heightM = heightCm/100;
        double BMI = weightKg/(heightM*heightM);
        return BMI;

        // return weightKg/((heightCm/100)*(heightCm/100));
    }
}

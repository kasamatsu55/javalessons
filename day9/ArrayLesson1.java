package day9;
import java.util.*;
public class ArrayLesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1週間分の体重を記録するよ");
        double[] weights = new double[7];
        double sum = 0;
        for(int i = 0; i < weights.length; i++){
            System.out.print(i + 1 +"日目＞");
            weights[i] = scan.nextDouble();
            sum += weights[i]; 
        }
        System.out.println("平均体重:" + sum/weights.length);
        scan.close();
    }
}

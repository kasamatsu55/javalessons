package day9;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        System.out.println(scores.length); //要素数->5
        scores[0] = 20;
        scores[1] = 30;
        scores[2] = 40;
        scores[3] = 50;
        scores[4] = 60;
        System.out.println(scores[0]); //20

        int sum = 0;
        for(int i= 0; i < scores.length; i++){
            sum = sum + scores[i]; //sum += scores[i]; と同じ
        }
        System.out.println("合計は" + sum);
        System.out.println("平均は" + sum / scores.length);


        int[] sales = {120,200,300,150};
        System.out.println(sales[0]); //120
        System.out.println(sales.length); //4
        int salesSum = 0; //sum = 0;で初期化しても可
        for(int i = 0; i < sales.length; i++){
            salesSum += sales[i];
        }
        System.out.println("合計は" + salesSum);
        System.out.println("平均は" + salesSum / sales.length);
        System.out.println(Arrays.toString(sales));
    }
}

package day10;
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights = new double[7]; //メモリ上に「0.0」が7個用意される(int型より容量を使う)
        double sum = 0d; //doubleの「d」
        for(int i = 0; i < weights.length; i++){
            System.out.print((i + 1) + "日目＞"); //無くても良いけど、マナーとして（i + 1）
            weights[i] = sc.nextDouble();
            sum += weights[i];
        }
        //一覧表示
        System.out.println(Arrays.toString(weights));
        System.out.println("平均:" + (sum / weights.length)); //さすがに（）はいらないかも…
        sc.close();
    }
}

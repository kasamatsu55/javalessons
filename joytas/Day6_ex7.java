package joytas;
import java.util.*;
public class Day6_ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("何人？＞");
        int num = scan.nextInt();
        int[] points = new int[num];
        int sum = 0;
        for(int i = 0; i < points.length; i++){
            System.out.print(i + 1 + "人目の点数を入力してください＞");
            points[i] = scan.nextInt();
            sum += points[i];
        }
        System.out.println("合計点数は" + sum + "点です。");
        scan.close();
    }
}

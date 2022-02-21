package day18;
import java.util.*;
public class MethodLesson1 {
    //三角形の面積メソッド
    public static void calcTriangleArea(double w , double h){
        double area = w * h / 2;
        System.out.printf("底辺%.2f,高さ%.2fの三角形の面積は%.2fです%n",w,h,area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("底辺＞");
        double weight = sc.nextDouble(); //右クリック→リネームシンボルで一括変換できる
        System.out.print("高さ＞");
        double height = sc.nextDouble(); 
        calcTriangleArea(weight,height);
        sc.close();
    }
    
}

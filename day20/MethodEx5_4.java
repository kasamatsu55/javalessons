package day20;
import java.util.*;
public class MethodEx5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("底辺(cm)>");
        double bottomCm = sc.nextDouble();
        System.out.print("高さ(cm)>");
        double heightCm = sc.nextDouble();
        System.out.print("半径(cm)>");
        double radiusCm = sc.nextDouble();
        double resultTri = calcTriangleArea(bottomCm,heightCm);
        System.out.printf("三角形の面積は%.2f㎠%n",resultTri);
        double resultCir = calcCircleArea(radiusCm);
        System.out.printf("円の面積は%.2f㎠%n",resultCir);
        sc.close();
    }
    public static double calcTriangleArea(double bottomCm,double heightCm){
        double triangleArea = bottomCm*heightCm/2;
        return triangleArea;
    }
    public static double calcCircleArea(double radiusCm){
        double circleArea = radiusCm*radiusCm*3.14;
        return circleArea;
    }
}

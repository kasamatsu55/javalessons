package others;

public class Sample1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;
        double div = num1 / num2;
        System.out.println("5/4は" + div + "です。");
        //↑結果が「1.0」となって意図しない値になってしまうので...
        //キャストして演算させる
        // double div = (double)num1 / num2;
        //            or
        // double div = (double)num1 / (double)num2;
        //「1.25」と出力される
    }
}

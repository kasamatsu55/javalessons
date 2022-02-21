package day11;

public class TernaryOpe {
    public static void main(String[] args) {
        int n = new java.util.Random().nextInt(10);
        //if文を使用せずに判定できる
        //三項演算子
        System.out.println(n + "は" + (n % 2 == 0 ? "偶数":"奇数") + "です");

        //三項演算子+printf
        System.out.printf("%dは%sです%n",n,(n % 2 == 0 ? "偶数":"奇数"));
    }
}

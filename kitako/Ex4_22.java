package kitako;

public class Ex4_22 {
    public static void main(String[] args) {
        // フィボナッチ数列を表示するプログラムを作成しなさい。
        // 最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
        int fibo = 0;
        int num1 = 1;
        int num2 = fibo + num1;
        while(fibo <= 1000){
            System.out.print(fibo + ",");
            fibo = num1;
            num1 = num2;
            num2 = fibo + num1;
           
        }
    }
}

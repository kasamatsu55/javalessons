package kitako;

public class Ex4_17 {
    public static void main(String[] args) {
        // 九九表（一の段～九の段）を表示するプログラムを作成しなさい。
        // ※System.out.printfを使用する。
        // ※System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
        for(int i =1; i <= 9; i++){
            for(int j = 1; j <=9; j++){
                System.out.printf("%2d", i * j);
                System.out.print(" ");
            }
            System.out.println();

            // System.out.print(i * j + " ");
            // }
            // System.out.println();
        }
    }
}

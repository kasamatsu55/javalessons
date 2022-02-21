package kitako;
import java.util.*;
public class Ex4_10 {
    public static void main(String[] args) {
        //個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        System.out.print("個数＞");
        int count = scan.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print("* ");
        }
        System.out.println();
        scan.close();
    }
}

package kitako;
import java.util.*;
public class Ex4_20 {
    public static void main(String[] args) {
        //サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        System.out.print("サイズ（数値）＞＞");
        int size = scan.nextInt();
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("$");
            }
            System.out.println();
        }
        scan.close();
    }
}

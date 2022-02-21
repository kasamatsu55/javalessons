package kitako;
import java.util.*;
public class Ex4_21 {
    public static void main(String[] args) {
        // サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
        Scanner scan = new Scanner(System.in);
        System.out.print("サイズ＞＞");
        int size = scan.nextInt();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i == j || j == (size - i - 1)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

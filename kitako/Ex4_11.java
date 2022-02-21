package kitako;
import java.util.*;
public class Ex4_11 {
    public static void main(String[] args) {
        // 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
        // 数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
        Scanner scan = new Scanner(System.in);
        System.out.print("何個＞＞");
        int count = scan.nextInt();
        for(int i = 0; i < count; i++){
            System.out.print(i % 10 + " ");
        }
        // for(int i = 0, x = 0; i < count; i++){
        //     System.out.print(x +" ");
        //     x++;
        //     if(x > 9){
        //         x = 0;
        //     }
        // }
        System.out.println();
        scan.close();
    }
}

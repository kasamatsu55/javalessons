package kitako;
import java.util.*;
public class Ex4_19 {
    public static void main(String[] args) {
        // 数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
        // ※最後に入力された 0 は平均に含めない。
        // ※少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for(;;){
            System.out.print("入力＞＞");
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("平均：" + sum / count);
        sc.close();
    }
}

package kitako;
import java.util.*;
public class Ex4_13 {
    public static void main(String[] args) {
        // １球ごとにストライクかボールかを入力する。
        // ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
        // ※ストライクの場合は1、ボールの場合は2を入力する。

        Scanner scan = new Scanner(System.in);
        int strike = 0;
        int ball = 0;
        while(strike < 3 && ball < 4){
            System.out.println("ストライク=1 or ボール=2 ?");
            int num = scan.nextInt();
            if(num == 1){
                strike++;
            }else{
                ball++;
            }
        }
        System.out.println(ball + "ボール," + strike + "ストライク");
        scan.close();

    }
}

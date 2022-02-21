package kitako;
import java.util.*;
public class Ex4_14 {
    public static void main(String[] args) {
        // １球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
        // ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
        // ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
        // ※ストライクの場合は1、ボールの場合は2、ファウルの場合は3を入力する。

        Scanner scan = new Scanner(System.in);
        int strike = 0;
        int ball = 0;
        while(strike < 3 && ball < 4){
            System.out.println("ストライク=1 or ボール=2 or ファウル=3 ?");
            int num = scan.nextInt();
            // if(num == 1 || num == 3){
            //     if(strike == 2 && num == 3){
            //         continue;
            //     }
            //     strike++;
            // }else{
            //     ball++;
            // }
            
            if(num == 1){
                strike++;
            }else if(num == 2){
                ball++;
            }else if(num == 3 && strike < 2){
                strike++;
            }
        }
        System.out.println(ball + "ボール," + strike + "ストライク");
        scan.close();

    }
}

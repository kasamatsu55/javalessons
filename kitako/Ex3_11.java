package kitako;
import java.util.*;
public class Ex3_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("年末までの祝日を表示します。何月から表示しますか？（数字）＞");
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("1月：元日、成人の日");
            case 2:
                System.out.println("2月：建国記念の日");
            case 3:
                System.out.println("3月：春分の日");
            case 4:
                System.out.println("4月：昭和の日");
            case 5:
                System.out.println("5月：憲法記念日、みどりの日、こどもの日");
            case 6:
                System.out.println("6月：なし");
            case 7:
                System.out.println("7月：海の日");
            case 8:
                System.out.println("8月：なし");
            case 9:
                System.out.println("9月：敬老の日、秋分の日");
            case 10:
                System.out.println("10月：体育の日");
            case 11:
                System.out.println("11月：文化の日、勤労感謝の日");
            case 12:
                System.out.println("12月：天皇誕生日");
        }
        sc.close();
    }
}

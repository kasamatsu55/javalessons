package kitako;
import java.util.*;
public class Ex3_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("今日の運勢を占います。好きな鮨を下記から選択してください(数字)");
        System.out.println("1:まぐろ　2:えび　3:こはだ　4:たまご　5:いくら　6:サーモン");
        int sushi = sc.nextInt();
        
        switch(sushi){
            case 1:
                System.out.println("ふつう");
                break;
            case 2:
                System.out.println("まあまあ");
                break;
            case 3:
                System.out.println("絶好調");
                break;
            case 4:
                System.out.println("絶不調");
                break;
            case 5:
                System.out.println("いいことある");
                break;
            case 6:
                System.out.println("車に注意！");
                break;
        }
        sc.close();
    }
}

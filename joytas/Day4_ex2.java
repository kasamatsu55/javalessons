package joytas;
import java.util.*;
public class Day4_ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("スペイン語で「日曜」はなんというでしょうか？");
        System.out.println("番号を入力してください");
        System.out.println("1:Lunes 2:Jueves 3:Domingo");
        // int ans = sc.nextInt(); 下記の条件式の中で定義しても可
        switch(sc.nextInt()){
            case 3:
                System.out.println("OK!");
                break;
            default:
                System.out.println("NG");
            // case 1:
            // case 2:
            //     System.out.println("NG");
            //     break;                      
        }
        sc.close();
    }
}

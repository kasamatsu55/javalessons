package joytas;
import java.util.*;
public class Day4_ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("日本の信号で渡っていい色はなんでしょう？漢字一文字で入力してください");
        String ans = sc.nextLine();  //下記の条件式の中にいれても可
        switch(ans){
        case "青":
        case "緑":
            System.out.println("OK!");
            break;
        default:
            System.out.println("NG");
        }
        sc.close();
    }
}

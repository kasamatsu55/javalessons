package joytas;
import java.util.*;
public class Day4_ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("いくつの★ を出力しますか？＞");
        int star = sc.nextInt();
        for(int i = 0; i < star; i++){
            System.out.print("★ ");
        }
        sc.close();
    }
}

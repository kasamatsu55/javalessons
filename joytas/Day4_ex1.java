package joytas;
import java.util.*;
public class Day4_ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("「10月」を英語で入力してください");
        String oct = sc.nextLine();
        if(oct.equals("october")){
            System.out.println("正解");
        }else{
            System.out.println("NG");
        }
        sc.close();
    }    
}

package joytas;
import java.util.*;
public class Day3_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("スカイツリーの高さは？(ｍ)＞");
        int height = scan.nextInt();
        if(height == 634){
            System.out.println("OK!");
        }else{
            System.out.println("NG");
        }
        // System.out.println(height == 634 ? "OK!":"NG");
        scan.close();
    }
}

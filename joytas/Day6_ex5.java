package joytas;
import java.util.*;
public class Day6_ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] results = {true,false,false,true,true};
        // System.out.print("第何戦の結果を調べますか(1～5)＞");
        System.out.print("第何戦の結果を調べますか(1～" + results.length + ")＞");
        int x = scan.nextInt();
        if(results[x-1]){
            System.out.println("第"+ x + "回戦は[勝ち]です。");
        }else{
            System.out.println("第"+ x + "回戦は[負け]です。");
        }
        scan.close();
    }
}

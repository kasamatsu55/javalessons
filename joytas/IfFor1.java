package joytas;
import java.util.*;
public class IfFor1 {
    public static void main(String[] args) {
        //階段の高さを入力すると、その高さの階段を描画する処理を作成せよ。
        Scanner sc = new Scanner(System.in);
        System.out.print("何段＞");
        int step = sc.nextInt();
        for(int i = 0; i < step; i++){
            for(int j = 0; j < step; j++){
                if(j < step-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }                
            }
            System.out.println();
        }
        // for(int i = step -1; i >= 0; i--){
        //     for(int j = 0; j < step; j++){
        //         if(j < i){
        //             System.out.print(" ");
        //         }else{
        //             System.out.print('*');
        //         }
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}

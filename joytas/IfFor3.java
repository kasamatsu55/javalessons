package joytas;
import java.util.*;
public class IfFor3 {
    public static void main(String[] args) {
        // 野球のスコアボードを作成せよ。点数は以下の確率のランダムとする。（延長戦は考慮しなくてよい）
        // [点数の確率] 0:70% 1:20% 2:5% 3:3% 4:2%
        Random rand = new Random();
        int pointG = 0;
        int pointT = 0;
        for(int i = 0; i < 2; i++){
            if(i == 0){
                System.out.print("G|");
            }else{
                System.out.print("T|");
            }
            for(int j = 1; j <= 9; j++){
                if(i == 1 && j == 9 && pointG < pointT){
                    System.out.print("X");
                }else{
                    int odds = rand.nextInt(100);
                    int score;
                    if(odds < 70){
                        score = 0;
                    }else if(odds < 90){
                        score = 1;
                    }else if(odds < 95){
                        score = 2;
                    }else if(odds < 98){
                        score = 3;
                    }else{
                        score = 4;
                    }
                    System.out.print(score);
                    if(i == 0){
                        pointG += score;
                    }else{
                        pointT += score;
                    }
                }
                if(j % 3 == 0){
                    System.out.print("|");
                }
                if(j == 9){
                    if(i == 0){
                        System.out.println(pointG);
                    }else{
                        System.out.println(pointT);
                    }
                }
            }
        }
    }
}

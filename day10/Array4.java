package day10;
import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] fortunes = {"大吉","中吉","吉","凶"};
        //2行に分けて宣言するとき
        // String[] data;
        // data = new String[]{"A","B"}
        int index = rand.nextInt(fortunes.length);//要素が増えた時にも対応
        //表示
        System.out.println(fortunes[index]);
        // System.out.println(fortunes[rand.nextInt(fortunes.length)]); でも可
        
        //for文
        // for(int i = 0; i < fortunes.length; i++){
        //     if(index == i){
        //         System.out.println(fortunes[i]);
        //         break;
        //     }
        // }
        
        //swith文
        // switch(num){
        //     case 0:
        //         System.out.println(luckey[0]);
        //         break;
        //     case 1:
        //         System.out.println(luckey[1]);
        //         break;
        //     case 2:
        //         System.out.println(luckey[2]);
        //         break;
        //     case 3:
        //         System.out.println(luckey[3]);
        //         break;
        // } 
    }
}

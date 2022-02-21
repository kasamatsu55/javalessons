package day17;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String[] suits = {"♠","♦","♥","♣"};
        String[] nums = {"1","10","J","Q","K"};
        String[] cards = {"♠1","♠10","♠J","♠Q","♠K"};

        int[] picks = new int[5];
        picks[0] = 0;
        picks[1] = 9;
        picks[2] = 10;
        picks[3] = 11;
        picks[4] = 12;
        String picksS = picks[0]+""+picks[1]+""+picks[2]+""+picks[3]+""+picks[4]+"";
        System.out.println(picksS);
        int[][] rsf = {{0,9,10,11,12},{13,22,23,24,25},{26,35,36,37,38},{39,48,49,50,51}};
        String s = picks[0]+""+picks[1]+"";
        System.out.println(s);


        System.out.println(picks == rsf[0] ? "OK":"NG");
        // boolean isHit = false;
        // while(true){
        //     for(int j = 0; j < rsf.length; j++){
        //         if(picks == rsf[j]){
        //             isHit = true;
        //             break;
        //         }
        //     }
        //     if(isHit == true){
        //         break;
        //     }
        // }
        // System.out.println("OK");
        // int countM = 0;
        // for(int i = 0; i < suits.length; i++){
        //     for(int j = 0; j < cards.length; j++){
        //         if(cards[j].contains(suits[i])){
        //             countM++;
        //         }
        //     }
        // }
        // System.out.println(countM);

        // int countN = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < cards.length; j++){
        //         if(cards[j].contains(nums[i])){
        //             countN++;
        //         }
        //     }
        // }
        // System.out.println(countN);
    }
}

package day16;
import java.util.*;
public class Poker {
    public static void main(String[] args) {
        String[] suits = {"♠","♦","♥","♣"};
        String[] nums = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] cards = new String[suits.length * nums.length];
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j <nums.length; j++){
                int index = i * nums.length + j;
                cards[index] = suits[i] + nums[j];
                // System.out.printf("%4s",cards[index]);
            }
            System.out.println();
        }

        Random rand = new Random();
        int count = 0;
        String[] rsfNo = {"1","10","J","Q","K"};
        
        while(true){
            // for(int i = 0; i < cards.length-1; i++){
            //     int index = rand.nextInt(cards.length-i)+i;
            //     String tmp = cards[index];
            //     cards[index] = cards[i];
            //     cards[i] = tmp;
            //     System.out.printf("%4s",cards[i]);
            // }
            cards[0] = "♠1";
            cards[1] = "♠10";
            cards[2] = "♠J";
            cards[3] = "♠Q";
            cards[4] = "♠K";
            boolean checkM = false;
            boolean checkN = false;
            for(int i = 0; i < 5; i++){
                int countM = 0;
                for(int j = 0; j < suits.length; j++){
                    if(cards[i].contains(suits[j])){
                        countM++;
                    }
                }
                if(countM == 5){
                    checkM = true;
                    break;
                }
            }
            for(int i = 0; i < 5; i++){
                int countN = 0;
                for(int j = 0; j < rsfNo.length; j++){
                    if(cards[i].contains(rsfNo[j])){
                        countN++;
                    }
                }
                if(countN == 5){
                    checkN = true;
                    break;
                }
            }
            count++;
            if(checkM && checkN){
                System.out.printf("%4s%4s%4s%4s%4s",cards[0],cards[1],cards[2],cards[3],cards[4]);
                break;
            }
        }
        System.out.printf("%d回目に出ました",count);
    }
}

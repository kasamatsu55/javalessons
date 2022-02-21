package day13;
import java.util.*;
public class PlayingCard {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] marks = {"♠","♦","♥","♣",};
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10","J","Q","K",};
        String[] cards = new String[marks.length * numbers.length];
        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < numbers.length; j++){
                cards[i*numbers.length+j] = marks[i] + numbers[j];
                System.out.printf("%s  ",cards[i*numbers.length+j]);
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(cards));
        System.out.println("5枚を引いて表示");
        for(int i = 0; i < 5; i++){
            int index = rand.nextInt(cards.length-i) + i;
            System.out.printf("%s ",cards[index]);
            String tmp = cards[index];
            cards[index] = cards[i];
            cards[i] = tmp;
        }
        // System.out.println();
        // System.out.println(Arrays.toString(cards));
    }
}

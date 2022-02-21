package day11;
import java.util.*;
public class NamePower {
    public static void main(String[] args) {
        char[] chars = {'笠','松','聖','司'};
        int power = 0;
        for(int c : chars){
            power += c;
        }
        System.out.println(power/chars.length);
        //seed値を設定することによって毎回同じ結果が得られる
        Random rand = new Random(power); //powerがseed値
        String[] fortunes = {"大吉","中吉","吉","凶"};
        int index = rand.nextInt(fortunes.length);
        System.out.printf("今日のあなたの運勢は%sです%n",fortunes[index]);
    }
}

package day21;
import java.util.*;
public class WordApp {
    public static void main(String[] args) {
        String[][] data = {
            "今日、昨日の晩、明後日、遠い昔".split("、"),
            "私が、猫が、ボノボが、クリスティアーノ・ロナウドが".split("、"),
            "六本木で、飲み屋で、世界の中心で、マングローブで".split("、"),
            "叫んだ、サイヤ人になった、ガチャで爆死した、吐いた".split("、"),
        };
        String[] result = new String[data.length];
        for(int i = 0; i < result.length; i++){
            result[i] = randomChoice(data[i]); //配列に4Wが順次
        }
        System.out.println(String.join(" ",result)); //配列を文字列に(半角スペースあけながら)
    }

    public static String randomChoice(String[] arr){
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }
}

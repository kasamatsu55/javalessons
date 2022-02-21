package day21;
import java.util.*;
public class Method4wApp {
    public static void main(String[] args) {
        String when = "今日,昨日の晩,明後日,遠い昔";
        String who = "私が,猫が,ボノボが,クリスティアーノ・ロナウドが";
        String where = "六本木で,飲み屋で,世界の中心で,マングローブで";
        String what = "叫んだ,サイヤ人になった,ガチャで爆死した,吐いた";

        String[] whenArr = when.split(",");
        String[] whoArr = who.split(",");
        String[] whereArr = where.split(",");
        String[] whatArr = what.split(",");

        System.out.printf("%s %s %s %s%n",randomChoice(whenArr),randomChoice(whoArr)
        ,randomChoice(whereArr),randomChoice(whatArr));

        System.out.printf("%s %s %s %s%n",whenArr[ranChoIndex(whenArr)],
        whoArr[ranChoIndex(whoArr)],whereArr[ranChoIndex(whereArr)],
        whatArr[ranChoIndex(whatArr)]);

        System.out.printf("%s %s %s %s%n",rc(when),rc(who),rc(where),rc(what));
    }
    //配列を引数、文字列を返すパターン
    public static String randomChoice(String[] arr){
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }
    //インデックスを返すパターン、配列によって要素数が違う可能性もある
    public static int ranChoIndex(String[] arr){
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return index;
    }
    //文字列を引数
    public static String rc(String str){
        Random rand = new Random();
        String[] strArr = str.split(",");
        int index = rand.nextInt(strArr.length);
        return strArr[index];
    }
}

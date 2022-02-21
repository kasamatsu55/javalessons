package day16;
import java.util.*;
public class RoyalStraightFlush {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] suits = {"♠","♦","♥","♣"};
        String[] nums = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] cards = new String[suits.length * nums.length];
        final int NUM = 5;
        int[] picks = new int[NUM];
        //トランプ作成
        for(int i = 0; i < suits.length; i++){
            for(int j = 0; j <nums.length; j++){
                int index = i * nums.length + j;
                cards[index] = suits[i] + nums[j];
                System.out.printf("%4s",cards[index]);
            }
            System.out.println();
        }
        //仮想トランプ（インデックスバージョン）       
        int[] indexNo = new int[cards.length];
        for(int i = 0; i < cards.length; i++){
            indexNo[i] = i;
        }
        //ループ
        int count = 0;
        boolean isHit = false;
        while(true){
            count++;
            //シャッフル
            for(int i = 0; i < cards.length; i++){
                int index = rand.nextInt(cards.length - i) + i;
                int temp = indexNo[index];
                indexNo[index] = indexNo[i];
                indexNo[i] = temp;
            }
            //先頭から5枚を抽出
            for(int i = 0; i < NUM; i++){
                System.out.printf("%4s",cards[indexNo[i]]);
                picks[i] = indexNo[i];
            }
            //5枚を昇順に並び替え
            for(int i = 0; i < picks.length-1; i++){
                for(int j = i + 1; j < picks.length; j++){
                    if(picks[i] > picks[j]){
                        int temp = picks[i];
                        picks[i] = picks[j];
                        picks[j] = temp;
                    }
                }
            }
            //文字列に変換
            String picksS = picks[0]+""+picks[1]+""+picks[2]+""+picks[3]+""+picks[4]+"";
            // System.out.println(picksS); デバッグプリント
            //ロイヤルストレートフラッシュとなる配列と比較
            String[] rsf = {"09101112","1322232425","2635363738","3948495051"};     
            for(int j = 0; j < rsf.length; j++){
                if(picksS.equals(rsf[j])){
                    isHit = true;
                    break;
                }
            }
            if(isHit){
                break;
            }
        }
        System.out.println();
        System.out.println(count + "回で出ました。");
    }
}

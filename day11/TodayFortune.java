package day11;
import java.util.*;
public class TodayFortune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name>>"); 
      String name= sc.nextLine();
      long seed=0L;
      for(int i=0;i<name.length();i++){ //「name.length()」文字数を取り出す
         char c = name.charAt(i); //一文字ずつ「char」に格納していく
         seed += (int)c;
      }
      System.out.println(seed);
      //実行日時のカレンダーインスタンス生成
      Calendar cal = Calendar.getInstance();
      int year=cal.get(Calendar.YEAR);
      System.out.println(year);
      int month=cal.get(Calendar.MONTH); //0-11に注意 表示するときに注意
      System.out.println(month);
      int date = cal.get(Calendar.DATE);
      System.out.println(date);
      //シード値に日付情報を追加
      seed = seed + year + month + date;
      System.out.println(seed);
      //ランダムインスタンス生成
      Random rand = new Random(seed);
      //運勢配列
      String[] fortunes={
         "大吉",
         "中吉",
         "吉",
         "凶",
      };
      //結果
      int index = rand.nextInt(fortunes.length);
      System.out.printf("あなたの%d/%d/%dの運勢は%sです%n",year,month+1,date,fortunes[index]);
      sc.close();
    }
}

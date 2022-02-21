package day32;
import java.util.*;
public class Fortune {
    public static void main(String[] args) {
        String name = args.length == 0 ? "あなた" : args[0] + "さん";
        Calendar today = Calendar.getInstance();//ミリ秒まで取得できる
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int day = today.get(Calendar.DATE);
        int seed = calcSeed(name,year,month,day);
        String fortune = getFortune(seed);
        System.out.printf("%sの%d/%d/%dの運勢は%sです",name,year,month+1,day,fortune);
    }

    static int calcSeed(String name,int year,int month,int day){
        int seed = year + month + day;
        for(int i = 0; i < name.length(); i++){
            seed += name.charAt(i);
        }
        return seed;
    }
    static String getFortune(int seed){
        String fortune = null;
        Random rand = new Random(seed);
        int n = rand.nextInt(100);
        Map<String,Integer> data = new LinkedHashMap<>(){ //インスタンスイニシャライザー
            {
                put("大吉",60); //初期値を入れることができる
                put("中吉",30);
                put("吉",7);
                put("凶",3);
            }
        };
        //同じ意味
        // Map<String,Integer> data=new LinkedHashMap<>();
        // data.put("大吉",60);
        // data.put("中吉",30);
        // data.put("吉",7);
        // data.put("凶",3);

        for(String key : data.keySet()){
            if(n-data.get(key) < 0){
                fortune = key;
                break;
            }
            n-=data.get(key);
        }
        return fortune; //先に作っておけば警告消える
    }
}

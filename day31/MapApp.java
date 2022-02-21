package day31;
import java.util.*;
public class MapApp {
   public static void main(String[] args) {
       Map<String,Integer> prefs = new HashMap<>();
       prefs.put("京都府",255);
       prefs.put("東京都",1261);
       prefs.put("熊本県",181);
       int tokyo = prefs.get("東京都"); //キーを指定した値を取得
       System.out.println("東京都の人口は、" + tokyo);
       prefs.remove("京都府");
       prefs.put("熊本県",182);
       int kumamoto = prefs.get("熊本県");
       System.out.println("熊本県の人口は、" + kumamoto);
       System.out.println(prefs);

       for(String key : prefs.keySet()){
        int value = prefs.get(key);
        System.out.println(key + "の人口は" + value);
       }
       System.out.println(prefs.size());
       if(prefs.containsKey("熊本県")){
           System.out.println("熊本県は含まれます");
       }
       if(prefs.containsValue(182)){
           System.out.println("182はvalueに含まれます");
       }

       Map<String,List<String>> data = new HashMap<>();
       List<String> tk = new ArrayList<>();
       tk.add("切子");
       tk.add("佃煮");
       tk.add("寿司");
       tk.add("のり");
       data.put("東京都",tk);
       List<String> kyoto = new ArrayList<>();
       kyoto.add("織物");
       kyoto.add("人形");
       kyoto.add("漬け物");
       kyoto.add("陶器");
       data.put("京都府",kyoto);

       List<String> kanagawa = Arrays.asList("a","b","c","d"); //まとめて入力もできる
       data.put("神奈川",kanagawa);
       //同じ
       String[] arr = {"f","g","h"};
       List<String> saitama = Arrays.asList(arr);
       data.put("埼玉",saitama);

       System.out.println(data);
       for(String key : data.keySet()){
           System.out.printf("%s%s%n",key,data.get(key));
       }

       //P645
       var age = 10;
       //age = "Hello"; はできない。エラー
       var lis = new ArrayList<Integer>();
       System.out.println(age);
       lis.add(10);
       System.out.println(lis);
   } 
}

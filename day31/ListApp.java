package day31;
import java.util.*;
public class ListApp {
    public static void main(String[] args){
        String[] names = new String[3]; //最初に要素数を決める必要があった
        names[0] = "たなか";
        names[1] = "すずき";
        names[2] = "さいとう";
        System.out.println(names[1]);

        ArrayList<String> names2 = new ArrayList<>(); //<>ジェネリクス
        names2.add("John");
        names2.add("Paul");
        names2.add("Ringo");
        System.out.println(names2.get(1)); //Paul
        names2.remove("John"); //johnを削除
        System.out.println(names2);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1.get(0)); //10
        for(int i : list1){
            System.out.println(i);
        }
        
        //追加
        list1.add(0,5);
        System.out.println(list1); //オーバーライドしてくれているのでインスタンスを入力するだけでいい
        
        //上書き
        list1.set(0,8);
        System.out.println(list1);
        
        //size 要素数を返す
        for(int i = 0; i < list1.size(); i++){ 
            System.out.println(list1.get(i));
        }
        //要素数がゼロであるかを判定
        if(!(list1.isEmpty())){
            System.out.println("カラではありません");
        }
        if(list1.contains(10)){
            System.out.println("10を含みます");
        }
        
        //指定要素が何番目にあるかを検索
        System.out.println(list1.indexOf(10)); //1

        //int番目の要素を削除する
        list1.remove(0);
        System.out.println(list1);

        list1.add(2); //追加
        System.out.println(list1);
        list1.remove(2); //数字が削除されるのではなく、要素「2」が削除される
        //数字の「2」を削除したい場合は「Integer.valueOf(2)」
        System.out.println(list1);
        
        //要素を全て削除
        list1.clear();
        System.out.println(list1); //[]だけが表示される

        //イテレーター
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()){
            Integer i = it.next(); //次の要素を指し、その内容（～型）を返す
            System.out.println(i);
        }

        //抽象度を高く、どちらも使えるように
        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
    }
    //メソッド作成時にも使える
    // public static hoge(List<Integer> list){
    //     for(int i : list){
    //         System.out.println(i);
    //     }
    // }
}

package day21;
import java.util.*;
public class ArgsLesson {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("実行時に名前を入れてください！");
            return; //voidだけどリターンできる(早期リターン)
        }
        String[] data; //今回の主役となる配列
        if(args.length % 2 == 0){
            data = args;
        }else{
            data = new String[args.length + 1]; //先生用に配列要素を増やす
            for(int i = 0; i < args.length; i++){
                data[i]=args[i];
            }
            data[data.length-1] = "先生"; //最後の要素に「先生」を追加
        }
        // シャッフル
        Random rand = new Random();
        for(int i = 0; i < data.length-1; i++){
            int idx =rand.nextInt(data.length-i) + i;
            String temp = data[idx]; //配列はString型なのに注意
            data[idx] = data[i];
            data[i] = temp;
        }
        // 出力
        for(int i = 0; i < data.length / 2; i++){ //1度に2個表示していくので、回す回数は要素の半分
            System.out.printf("[%s,%s]%n",data[i],data[data.length-1-i]);
            // System.out.printf("[%s,%s]%n",data[2*i],data[2*i+1]);でも可
        }

        //3人ずつの場合
        // for(int i = 0; i < data.length / 3; i++){
        //     System.out.printf("[%s,%s,%s]%n",data[3*i],data[3*i+1],data[3*i+2]);
        // }
    }
}

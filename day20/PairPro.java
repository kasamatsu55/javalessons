package day20;
import java.util.*;
public class PairPro {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("名前を入れて実行してください");
        }else{
            if(args.length % 2 != 0){
                String[] argsT = new String[args.length + 1];                
                for(int i = 0; i < argsT.length; i++){
                    if(i == argsT.length-1){
                        argsT[i] = "先生";
                    }else{
                        argsT[i] = args[i];
                    }                    
                }
                args = argsT;
            }
            shuffle(args);
            for(int i = 0; i < args.length / 2; i++){
                System.out.printf("[%s,%s]%n",args[i],args[args.length-1-i]);
            }
        }
    }
    public static String[] shuffle(String[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            int index = rand.nextInt(arr.length-i) + i;
            String temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

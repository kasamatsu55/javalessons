package day8;
import java.util.Scanner;
import java.util.Random;
public class Sumrandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何個＞＞");
        int count = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < count; i++){
            int n = rand.nextInt();
            System.out.println(n);
            sum += n;
        }
        System.out.println("合計は" + sum);
        scan.close();

        // System.out.println("1~10の乱数を指定個作成して合計を求めます。");
        // System.out.print("何個＞＞");
        // int num = new java.util.Scanner(System.in).nextInt();
        // int sum = 0;
        // for(int i = 0; i < num; i++){
        //     int ran = new java.util.Random().nextInt(10) + 1;
        //     System.out.println(ran);
        //     sum = sum + ran;            
        // }
        // System.out.println("合計は" + sum);

        // System.out.println("1~10の乱数を指定個作成して、指定した値が何個出たかを表示します。");
        // System.out.print("何個＞＞");
        // int num = new java.util.Scanner(System.in).nextInt();
        // System.out.print("どの値＞＞");
        // int x = new java.util.Scanner(System.in).nextInt();
        // int count = 0;
        // for(int i = 0; i < num; i++){
        //     int ran = new java.util.Random().nextInt(10) + 1;
        //     System.out.println(ran);
        //     if(ran == x){
        //         count++;
        //     }
        // }
        // System.out.println(x + "は" + count + "個です");
    }
}

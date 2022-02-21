package kitako;
import java.util.*;
public class Ex3_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("xの値を入力してください＞");
        int x = sc.nextInt();
        System.out.print("yの値を入力してください＞");
        int y = sc.nextInt();

        if(x < y && (x % 2 == 0 && y % 2 == 0)){
            System.out.println(x + "は" + y + "より小さく、かつ、" + x + "と" + y + "は共に偶数である。");
        }
        if(x == y && x < 0){
            System.out.println(x + "と" + y + "は等しく、かつ、負の数である。");  
        }
        if(x < y || (x % 2) == 0){
            System.out.println(x + "は" + y + "より小さい、または、" + x + "は偶数である。");
        }
        if((x <= 10 || x >= 100) && (y >= 10 && y <= 100)){
           System.out.println(x + "は10以下または100以上で、かつ、" + y + "は10以上かつ100以下である"); 
        }
        if(!(x < 0 && y < 0)){
            System.out.println(x + "も" + y +"も負の数である、ではない。");     
        }
        sc.close();
    }
}

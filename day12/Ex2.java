package day12;
import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("単語＞");
        String word = sc.next(); //単語のときはnext()でよい
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.print("数字を半角区切りで3ついれてね＞");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("1:%d,2:%d,3:%d",a,b,c);

        sc.close();
    }
}

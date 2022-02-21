package day11;
import java.util.*;
public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("単語＞");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            char n = word.charAt(i);
            System.out.println(n);
        }
        sc.close();
    }
}

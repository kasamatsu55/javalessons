package day22;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Word>>");
        String word = sc.next();
        for(int i = 0; i < 2; i++){
            System.out.print(word);
        }
        System.out.println();
        sc.close();
    }
}

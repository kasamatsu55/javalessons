package day20;
import java.util.*;
public class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("犬の年齢>>");
        int dogAge = sc.nextInt();
        System.out.printf("%d歳の犬は人間の年齢に換算すると%d歳です"
                            ,dogAge,dogAgeConverthumanAge(dogAge));
        sc.close();
    }

    public static int dogAgeConverthumanAge(int n){
        return n*7;
    }
}

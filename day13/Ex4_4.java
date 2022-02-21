package day13;
import java.util.*;
public class Ex4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {3,4,9};
        System.out.print("1桁の数字を入力してください＞");
        int input = sc.nextInt();
        boolean isHit = false;
        for(int n : numbers){
            if(n == input){
                isHit = true;
                break;
            }
        }
        System.out.println(isHit == true ? "当たり":"はずれ");
        sc.close();
    }
}

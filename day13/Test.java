package day13;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("何段＞");
        int step = sc.nextInt();
        for(int i = 0; i < step; i++){
            for(int j = step; j > step-i; j--){
                if(i > j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

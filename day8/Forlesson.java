package day8;
import java.util.*;
public class Forlesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("何段＞＞");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i * j + ",");
                System.out.print("#");
            }
            System.out.println();
        }
        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 5; j++){
        //     System.out.print("#");
        //     }
        //     System.out.println();
        // }        
        sc.close();
    }    
}

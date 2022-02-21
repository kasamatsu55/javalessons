package day8;
import java.util.*;
public class Sumlesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何個＞＞");
        int maxCount = sc.nextInt();
        int sum = 0;

        // for(int i = 0; i < maxCount; i++){
        //     int n;
        //     while(true){
        //         n = rand.nextInt(100) + 1;
        //         if(n % 3 == 0 || n % 5 == 0){
        //             break;
        //         }
        //     }
        //     System.out.println(n);
        //     sum += n;
        // }

        int hitCount = 0;
        
        // while(hitCount < maxCount){
        //     int n = rand.nextInt(100) + 1;
        //     if(n % 3 == 0 || n % 5 == 0){
        //         System.out.println(n);
        //         sum += n;
        //         hitCount++;
        //     }
        // }

        while(true){
            int n = rand.nextInt(100) + 1;
            if(n % 3 == 0 || n % 5 == 0){
                System.out.println(n);
                sum += n;
                hitCount++;
            }
            if(hitCount == maxCount){
                break;
            }
        }
        System.out.println("合計は" + sum);
        sc.close();
    }
}

package day14;
import java.util.*;
public class BallLesson {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] pickup = new int[5*2];
        int[] balls = new int[99];

        for(int i = 0; i < balls.length; i++){
            balls[i] = i+1;
        }
        int winA = 0;
        int winB = 0;
        for(int i = 0; i < pickup.length ; i++){
            int index = rand.nextInt(balls.length - i) + i;
            pickup[i] = balls[index];
            int temp = balls[index];
            balls[index] = balls[i];
            balls[i] = temp;
            if(i % 2 != 0){
                System.out.printf("%d回戦%n", (i / 2) + 1);
                System.out.printf("A:%d,B:%d...%s%n",pickup[i-1],pickup[i],pickup[i-1] > pickup[i] ? "Aの勝ち":"Bの勝ち");
                if(pickup[i-1] > pickup[i]){
                    winA++;
                }else{
                    winB++;
                }
            }
        }
        System.out.printf("%d対%dで%s%n",winA,winB,winA > winB ? "Aの勝ち":"Bの勝ち");
        System.out.println(Arrays.toString(pickup));
        System.out.println(Arrays.toString(balls));               
    }
}

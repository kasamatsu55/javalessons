package day16;
import java.util.*;
public class Ballgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] balls = new int[1000];
        for(int i = 0; i < balls.length; i++){
            balls[i] = i;
        }
        for(int i = 0; i < 100; i++){
            while(true){
                int index = rand.nextInt(1000 - i) + i;
                if(index % 2 != 0){
                    int temp = balls[index];
                    balls[index]= balls[i];
                    balls[i] = temp;
                    break;
                }
            }            
        }
        int sumA = 0;
        int sumB = 0;
        String[] names = {"A","B"};
        System.out.print("何回戦>");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.println(i + 1 + "回戦");
            int[] point = new int[2];
            for(int j = 0; j < names.length; j++){
                System.out.printf("%s:",names[j]);
                if(j == 0){
                    point[j] = balls[i];
                }else{
                    point[j] = balls[100-1-i];
                }
                System.out.print(point[j]);
                if(j < names.length - 1){
                    System.out.print(",");
                }
            }
            for(int j = 0; j < names.length; j++){
                if((point[j]/100 == point[j]%100/10 && point[j]/100== point[j]%10) || point[j]/10 == point[j]%10){
                    System.out.printf("%n%sがゾロ目を引いたので加算ポイント2倍！",names[j]);
                    point[j] *= 2;
                }
                if(j == 0){
                    sumA += point[j];
                }else{
                    sumB += point[j];
                }
            }
            System.out.println();
            System.out.printf("(現在ポイント %s:%d,%s:%d)%n",names[0],sumA,names[1],sumB);
        }
        System.out.printf("%d対%dで%sの勝ち",sumA,sumB,sumA > sumB ? names[0]:names[1]);
        sc.close();
    }
}

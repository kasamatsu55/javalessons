package day15;
import java.util.*;
public class Baseball {
    public static void main(String[] args) {
        Random rand = new Random();
        int point; //for文の中で宣言したほうが良い
        int sumA = 0;
        for(int i = 0; i < 2; i++){
            if(i == 0){
                System.out.print("G|");
            }else{
                System.out.print("T|");
            }
            int sum = 0;
            for(int j = 0; j < 9; j++){ //j=1から始めたほうがわかりやすい
                int index = rand.nextInt(100);
                if(index > 97){
                    point = 4;
                }else if(index > 94){
                    point = 3;
                }else if(index > 89){
                    point = 2;
                }else if(index > 69){
                    point = 1;
                }else{
                    point = 0;
                }
                if(i == 1 && j == 8 && sumA < sum){
                    System.out.print("X");
                }else{
                    System.out.print(point);
                    sum += point;
                }
                if((j+1) % 3 == 0){
                    System.out.print("|");
                }
            }
            System.out.printf("%d%n",sum);
            sumA = sum;
        }

    }
}

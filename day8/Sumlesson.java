package day8;
import java.util.Scanner;
public class Sumlesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("最初＞＞");
        int first = scan.nextInt();
        System.out.print("最後＞＞");
        int last = scan.nextInt();

        //数学的な考え方
        int sum = ((first + last) * (last - first + 1)) / 2;

        //プログラミング的
        // int sum = 0;
        // for (int i = first; i <= last; i++){
        //     sum = sum + i;
        // }
        System.out.println(first + "から" + last + "までの和は" + sum + "です");
        scan.close();
        
    }
}

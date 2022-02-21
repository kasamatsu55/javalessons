package day8;
import java.util.Scanner;
import java.util.Random;
public class Sumlesson1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("1～100の乱数の中から3または5で割り切れるものを指定個生成して合計を求める");
        System.out.print("何個＞＞");
        int num = scan.nextInt();
        int sum = 0;
        for(int i = 0; i < num; i++){
            int ran = rand.nextInt(100) + 1;
            if(ran % 3 == 0 || ran % 5 == 0){
                System.out.println(ran);
                sum += ran;
            }
        }
        System.out.println("合計は" + sum);
        scan.close();
    }
}

package day8;
import java.util.*;
public class TableLesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("何行＞＞");
        int row = scan.nextInt();
        System.out.print("何列＞＞");
        int col = scan.nextInt();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int n = rand.nextInt(9) + 1;
                System.out.print(n + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

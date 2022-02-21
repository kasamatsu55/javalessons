package joytas;
import java.util.*;
public class ArrLesson6 {
    public static void main(String[] args) {
        //倍数の数字、行、列を入力
        //〇行〇列の表をランダムな〇の倍数で埋め尽くす(0～99)
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("数字＞");
        int n = sc.nextInt();
        System.out.print("行＞");
        int row = sc.nextInt();
        System.out.print("列＞");
        int col = sc.nextInt();
        int[][] table = new int[row][col];
        System.out.printf("%d行%d列の表をランダムな%dの倍数で埋め尽くしました%n",row,col,n);
        System.out.println("(0<=n<=99)");
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                while(true){
                    table[i][j] = rand.nextInt(100);
                    if(table[i][j] % n == 0 && table[i][j] != 0){
                        System.out.printf("%3d",table[i][j]);
                        break;
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

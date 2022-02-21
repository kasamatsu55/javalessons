package day12;
import java.util.*;
public class ArrayTest {
    public static void main(String[] args) {
        //クラス数、クラスの人数、それぞれの点数を入力させ、表を出力する。
        Scanner sc = new Scanner(System.in);
        System.out.print("クラス＞");
        int classNo = sc.nextInt();
        int[][] tests = new int[classNo][];
        for(int i = 0; i < tests.length; i++){
            System.out.printf("%d組のクラスの人数＞",i+1);
            int member = sc.nextInt();
            tests[i] = new int[member]; 
            for(int j = 0; j < tests[i].length; j++){
                System.out.printf("%d組%d人目の点数＞",i+1,j+1);
                tests[i][j] = sc.nextInt();
            }   
        }
        System.out.println("--表出力--");
        for(int i = 0; i < tests.length; i++){
            System.out.printf("%d組 ",(i+1));
            for(int j = 0; j < tests[i].length; j++){
                System.out.printf("%3d",tests[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}

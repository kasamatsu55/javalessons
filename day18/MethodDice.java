package day18;
import java.util.*;
public class MethodDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("何人>");
        int peaple = sc.nextInt();
        System.out.print("何回ふる>");
        int num = sc.nextInt();
        for(int i = 0; i < peaple; i++){
            System.out.printf("%sさん:%s合計:%n",alphabet(i),Arrays.toString(diceArr(num)));
        }
        sc.close();
    }

    public static String alphabet(int n){
        String[] alphabet = {"A","B","C","D","E","F","G",
                        "H","I","J","K","L","M","N",
                        "O","P","Q","R","S","T","U",
                        "V","W","X","Y","Z",};
        return alphabet[n];
    }

    public static int[] diceArr(int n){
        Random rand = new Random();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(6) + 1;
        }
        return arr;
    }
    public static int arrSum(int[] n){
        int sum = 0;
        for(int i = 0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }
}

package day21;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split(" ");
        int a = Integer.parseInt(word2Arr[0]);
        String result ="";
        for(int i = 0; i < word1Arr.length; i++){
            if(i+1==a){
                result+=word2;
            }
            result+=word1Arr[i];
            
        }
        System.out.println(result);
        sc.close();
    }
}

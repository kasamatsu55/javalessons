package others;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int T = sc.nextInt();
        String[] arrS = S.split("");
        int up = 0;
        String[] sumArr = new String[arrS.length];
        for(int i = sumArr.length-1; i >= 0; i--){
            int product = Integer.parseInt(arrS[i]) * T + up;
            if(product > 9){
                up = product / 10;
                product %= 10;
            }else{
                up = 0;
            }
            sumArr[i] = String.valueOf(product);
        }
        String result = String.join("" , sumArr);
        if(up > 0){
            result = String.valueOf(up) + result;
        }
        System.out.println(T == 0 ? 0:result);      
        sc.close();
    }
}

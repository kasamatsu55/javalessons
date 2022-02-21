package day20;
import java.util.*;
public class Method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値1>");
        int from = sc.nextInt();
        System.out.print("数値2>");
        int to = sc.nextInt();
        int[] arr = fillOut(from,to);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static int[] fillOut(int from,int to){
        int[] retArr = new int[Math.abs(to-from)+1];
        for(int i = 0; i < retArr.length; i++){
            if(to > from){
                retArr[i] = from++;
            }else{
                retArr[i] = from--;
            }
            //retArr[i] = to > from ? from++:from--;
        }
        return retArr;
    }
}

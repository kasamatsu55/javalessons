package day18;
import java.util.*; 
import util.*; //フォルダが違うので表記が必要
public class MethodLesson8 {
    //事前に作ったメソッドをutilから呼び出す
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Common.shuffleArr(arr);
        System.out.println(Arrays.toString(arr));
        Common.sortArr(arr);
        System.out.println(Arrays.toString(arr));

        int n = Common.randRange(100,500000);
        System.out.println(n);

        System.out.printf("%dの文字数(桁数)は%dです%n",n,Common.nStr(n));

        System.out.printf("%dはゾロ目%s",n,Common.isZoro(n) ? "です":"ではありません");
    }
}

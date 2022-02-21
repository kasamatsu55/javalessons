package others;
import java.io.*;
public class Keyboard1 {
    public static void main(String[] args) throws IOException{
        System.out.println("文字列を入力してください。");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str + "が入力されました。");
        // System.out.printf("%sが入力されました。",str);

        System.out.println("整数を入力してください。");
        String str1 = br.readLine();
        int num = Integer.parseInt(str1); //文字列を変換してint型の変数に読み込む
        // double num1 = Double.parseDouble(str1); //double型の数値に変換
        System.out.println(num + "が入力されました。");


    }
}

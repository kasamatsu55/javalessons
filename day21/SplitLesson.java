package day21;
import java.util.*;
public class SplitLesson {
    public static void main(String[] args) {
        String str = "りんご,みかん,ばなな";
        /*
        csv(comma separated values)
        */
        String[] data = str.split(",");
        System.out.println(Arrays.toString(data));
        
        String str1 = "りんご,みかん,,ばなな";
        String[] data1 = str1.split(",");
        System.out.println(Arrays.toString(data1)); //要素数は4

        //末尾に並ぶカンマもデータとして取得したい場合は第二引数に負の値を渡す
        String str2 = "りんご,みかん,ばなな,,,";
        String[] data2 = str2.split(",");
        System.out.println(Arrays.toString(data2));

        //第二引数が正の値は最大分割数
        String str3 = "りんご,みかん,ばなな,なし,いちご";
        String[] data3 = str3.split(",",2);
        System.out.println(Arrays.toString(data3));
        System.out.println(data3[1]); //みかん,ばなな,なし,いちご

        // 配列から文字列「join」
        String[] fruits = {"みかん","りんご","ばなな"};
        String fStr = String.join(",",fruits);
        System.out.println(fStr);// みかん,りんご,ばなな

        //3 5
        Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();
        // String[] nums = input.split(" ");
        // int a = Integer.parseInt(nums[0]);
        // int b = Integer.parseInt(nums[1]);
        // System.out.println("a" + a + ",b" + b);

        int a = sc.nextInt(); //次のint
        int b = sc.nextInt();
        System.out.println("a" + a + ",b" + b);
        sc.close();
    }
}

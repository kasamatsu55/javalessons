package day14;
import java.util.*;
public class Lott {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] lottery = new int[9999];
        for(int i = 0; i < lottery.length; i++){
            lottery[i] = i + 1;
        }
        //効率の良い方法
        //当選番号
        int lucky = rand.nextInt(9999) + 1;
        boolean isHit = false;
        System.out.print("何枚＞");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            int index = rand.nextInt(lottery.length-i) + i;
            int temp = lottery[index]; //自分の宝くじ
            lottery[index] = lottery[i];
            lottery[i] = temp;
            if(temp == lucky){
                isHit = true;
            }            
            System.out.print(temp);
            if(i != num-1){
                System.out.print(",");
            }
        }

        //わかりやすい方法
        // //宝くじシャッフル
        // for(int i = 0; i < lottery.length-1; i++){
        //     int index =rand.nextInt(lottery.length-i) + i;
        //     int temp = lottery[index];
        //     lottery[index] = lottery[i];
        //     lottery[i] = temp;
        // }
        // // 買った宝くじ
        // System.out.print("何枚＞");
        // int num = sc.nextInt();
        // int[] myLott = new int[num];
        // for(int i = 0; i < num; i++){
        //     myLott[i] = lottery[i];
        //     System.out.print(myLott[i]);
        //     if(i != num-1){
        //         System.out.print(",");
        //     }
        // }
        System.out.println();
        System.out.println("当選番号");
        // int lucky = rand.nextInt(9999)+1;
        System.out.println(lucky);
        // //結果発表
        // boolean isHit = false;
        // for(int lott : myLott){
        //     if(lott == lucky){
        //         isHit = true;
        //         break;
        //     }
        // }
        System.out.printf("%s%n",isHit ? "あたり":"はずれ"); //「isHit == true」と同じ意味
        sc.close();
    }
}

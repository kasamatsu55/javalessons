package day10;
import java.util.*;
public class Fighters {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("10人のファイターが集まった");
        int[] fighters = new int[10];
        for(int i = 0; i < fighters.length; i++){
            fighters[i] = rand.nextInt(71) + 30;
        }
        System.out.println(Arrays.toString(fighters));
        int enemyHp = 800; //敵のHP
        for(int i = 0; i < fighters.length; i++){   //「&& enemyHp > 0」を条件式に入れても可
            System.out.print((i+1) + "の攻撃 ");
            int power = fighters[i];
            if(rand.nextInt(5) == 0){
                power *= 2;
                System.out.print("クリティカル！");
            }
            System.out.print(power + "のダメージを与えた");
            enemyHp -= power;
            System.out.print("(残:" + enemyHp + ")");
            sc.nextLine(); //一時停止、エンターで進む（ゲーム性？）
            if(enemyHp < 0){                            //←その場合はifbreakはいらない
                break;
            }
        }
        // if(enemyHp > 0){
        //     System.out.println("討伐失敗");
        // }else{
        //     System.out.println("討伐成功");
        // }
        System.out.println(enemyHp > 0 ? "討伐失敗":"討伐成功"); //三項条件演算子 P137
        sc.close();
    }
}

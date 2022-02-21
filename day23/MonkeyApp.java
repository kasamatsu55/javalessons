package day23;
import java.util.*;
public class MonkeyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("おさるの名前を決めてください>");
        String name = sc.nextLine();
        System.out.print("おさるの歳を決めてください>");
        int age = sc.nextInt();
        Monkey m = new Monkey(name,age);     
        while(true){
            System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
            int action = sc.nextInt();
            switch(action){
                case 1:
                    m.greet();
                    break;
                case 2:
                    m.takeuma();
                    break;
                case 3:
                    m.sakadachi();
                    break;
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    break;
                    //return; で強制終了もできる
            }
            if(action == 4){
                break;
            }
        }
        sc.close();
    }
}

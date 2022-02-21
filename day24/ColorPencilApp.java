package day24;
import java.util.*;
public class ColorPencilApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("何本作成しますか>>");
        int num = sc.nextInt();sc.nextLine();
        ColorPencil[] cp = new ColorPencil[num];
        for(int i = 0; i < cp.length; i++){
            System.out.print(i+1+"本目の色>>");
            String color = sc.nextLine();
            System.out.print(i+1+"本目の長さ>>");
            int colorLength = sc.nextInt();sc.nextLine();
            ColorPencil cope = new ColorPencil(color , colorLength);
            cp[i] = cope;
        }
        System.out.println(Arrays.toString(cp));
        while(true){
            System.out.println("--操作を入力--");
            for(int i = 0; i < cp.length; i++){
                System.out.print(i+":");
                cp[i].showInfo();
            }
            System.out.print(">>");
            int number = sc.nextInt();
            if(number == 3){
                break;
            }
            if(cp[number].len >= 1){
                cp[number].write();
            }else{
                cp[number].write();
                break;
            }
        }
        System.out.println("アプリケーションを終了します");  
        sc.close();      
    }
}

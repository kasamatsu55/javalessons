package day31;
import java.util.*;
public class SlimeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ArrayListを使ってみよう！");
        System.out.println("Listにスライムを追加していってみよう。");
        ArrayList<Slime> slimes = new ArrayList<>();
        //List<Slime> slimes = new ArrayList<>(); でも可
        while(true){
            System.out.print("スライムを追加する？(1…yes,2…no):");
            int n = sc.nextInt();
            if(n == 2){
                break;
            }
            System.out.print("追加するスライムの名前を決めてね:");
            String name = sc.next();
            Slime slime = new Slime(name);
            slime.appear();
            slimes.add(slime);
            // slimes.add(new Slime(name));
        }
        for(Slime s : slimes){
            s.attack();
        }
        sc.close();
    }
}

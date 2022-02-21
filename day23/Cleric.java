package day23;
import java.util.*;
public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

    //コンストラクタ(constructor)
    public Cleric(String name){
        this.name = name;
    }

    public Cleric(String name,int hp){
        this(name);
        this.hp = hp;
    }

    public Cleric(String name,int hp,int mp){
        this(name,hp);
        this.mp = mp;
    }

    public void selfAid(){
        if(this.mp < 5){
            System.out.println("MPが足りない");
            return;
        }
        this.mp -= 5;
        this.hp = MAX_HP;
        System.out.println(this.name + "は回復した");
    }
    public int pray(int sec){
        Random rand = new Random();
        int temp = sec + rand.nextInt(3);
        int recovery = Math.min(MAX_MP - this.mp,temp);
        this.mp += recovery;
        System.out.println(this.name + "は" + recovery + "ポイント回復した");
        return recovery;
    }
}

package day25;
import java.util.*;
public class Demon {
    int hp;
    public Demon(){
        Random rand = new Random();
        this.hp = rand.nextInt(200) + 800;
    }
    public void lightning(Hero[] heroes){
        Random rand = new Random();
        int lightning = rand.nextInt(41) + 10;
        System.out.printf("デーモンが稲妻(%d)を放った%n",lightning);
        for(Hero h : heroes){
            if(h.hp > 0){
                h.attacked(lightning);
            }
        }
    }
    public boolean isDeadAttackedBy(Hero h){
        this.hp -= h.power;
        System.out.printf("%sは%dのダメージを与えた(Demon:%d)%n",h.name,h.power,this.hp);
        if(this.hp <= 0){
            System.out.println("デーモンは朽ち果てた");
            return true;
        }
        return false;
    }
    public void appear(){
        System.out.printf("デーモンが現れた(hp:%d)%n",this.hp);
    }
}

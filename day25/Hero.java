package day25;
import java.util.*;
public class Hero {
    static int  deathCount = 0; //死んだ人数
    String name;
    int hp;
    int power;
    public Hero(String name){
        this.name = name;
        Random rand = new Random();
        this.hp = rand.nextInt(70) + 30;
        this.power = rand.nextInt(50 ) + 50;
    }
    public void attacked(int lightning){
        this.hp-= lightning;
        System.out.printf("%sは%dのダメージを受けた(hp:%d)%n",this.name,lightning,this.hp);
        if(this.hp <= 0){
            System.out.printf("%sは力尽きた%n",this.name);
            deathCount++;
        }
    }
    public void showInfo(){
        System.out.printf("%s(hp:%d,power:%d)%n",this.name,this.hp,this.power);
    }
}

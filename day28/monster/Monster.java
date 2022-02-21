package day28.monster;

public abstract class Monster {
    int hp;
    int mp;
    public Monster(int hp , int mp){
        this.hp = hp;
        this.mp = mp;
    }
    public abstract void attack();
    public abstract void run();
}

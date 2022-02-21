package day28.monster;

public abstract class WalkingMonster extends Monster{
    public WalkingMonster(int hp, int mp){
        super(hp,mp);
    }
    @Override
    public void run(){
        System.out.println("トコトコ走って逃げる");
    }
}

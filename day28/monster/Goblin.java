package day28.monster;

public class Goblin extends WalkingMonster{
    public Goblin(int hp , int mp){
        super(hp,mp);
    }
    @Override
    public void attack(){
        System.out.println("ナイフで斬りつける");
    }
}

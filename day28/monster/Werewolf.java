package day28.monster;

public class Werewolf extends WalkingMonster{
    public Werewolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("かみつく");
	}
}

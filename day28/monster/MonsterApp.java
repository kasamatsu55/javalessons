package day28.monster;

public class MonsterApp {
    public static void main(String[] args) {
        Goblin g = new Goblin(10,10);
		g.attack();
        g.run();
		Werewolf ww = new Werewolf(20,20);
		ww.attack();
        ww.run();
		DeathBat db= new DeathBat(5,5);
		db.attack();
        db.run();
    }
}

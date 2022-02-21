package day27;

public class HeroApp {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "ロト";
        PoisonMatango m1 = new PoisonMatango('A');
        h1.attack(m1);
        h1.run();
        m1.attack(h1);

        SuperHero h2 = new SuperHero();
        h2.name = "ビアンカ"; //Heroクラスにフィールドがある
        h2.attack(m1); //Heroクラスのメソッドが実行される
        h2.fly();
        h2.land();
        h2.run();

        Weapon w = new Weapon("鋼のやり");

        UltraHero uh = new UltraHero();
        uh.name = "taro";
        uh.swim();
        uh.run();
        uh.fly();
        uh.attack(m1);
    }
}

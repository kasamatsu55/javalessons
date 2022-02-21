package day23;

public class RPGApp {
    public static void main(String[] args) {
        Hero h1 = new Hero("ロト",100);
        Hero h2 = new Hero("ジェシカ",80);
        h1.run();
        h2.run();

        Hero h3 = new Hero("アラン");
        h3.hp = 120;
        h3.run();
        h3.attack(3);
    }
}

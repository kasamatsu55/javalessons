package day22;

public class RPGApp {
    public static void main(String[] args) {
        Hero h1 = new Hero(); //Heroクラスのインスタンスを作る
        h1.name = "ロト";
        h1.hp = 100;
        h1.slip(); //rand.nextInt(10)と同じ考え方
        h1.sit(3);
        h1.slip();
        h1.sleep();
        // h1.run(); 実行するとゲームオーバーになる
        Hero h2 = new Hero();
        h2.name = "ジェシカ";
        h2.hp = 100;
        h2.slip();
    }
}

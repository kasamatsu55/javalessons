package day28.rpg;

public class RPGApp {
    public static void main(String[] args) {
        // Character c = new Character(); //Charactorクラスに「abstract」がついているのでエラー
        Dancer d = new Dancer("ビアンカ"); //コンストラクタで定義
        Matango m = new Matango();
        // d.name = "ビアンカ";
        d.dance();
        d.attack(m);
        d.attackAndAway(m);
    }
}

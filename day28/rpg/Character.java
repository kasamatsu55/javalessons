package day28.rpg;

public abstract class Character { //抽象クラス
    String name;
    int hp;
    //コンストラクタ
    public Character(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }
    public void attackAndAway(Matango m){
        this.attack(m); //抽象メソッドだけど利用することができる
        this.run();
    }
    public abstract void attack(Matango m); //抽象メソッド
}

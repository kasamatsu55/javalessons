package day27;

public class Hero { //本当はHero extends Object
    String name = "ミナト";
    int hp = 100;
    public Hero(){
        // super(); //実は親がいるので書いてもいい
        System.out.println("Heroのコンストラクタが動作");
    }
    //戦う
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }
    //逃げる
    public void run(){
        System.out.println(this.name + "は逃げ出した！");
    }
}

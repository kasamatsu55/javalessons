package day28.rpg;

public class Dancer extends Character{
    public Dancer(String name){
        super(name); //親クラスのコンストラクタを呼ぶ
    }
    public void dance(){
        System.out.println(this.name + "は情熱的に踊った");
    }
    @Override //abstractされているのでオーバーライドしないといけない
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }
}

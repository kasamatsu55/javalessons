package day23;

public class Hero {
    String name;
    int hp;

    //コンストラクタ(constructor) 戻り値はなし
    public Hero(String name,int hp){ //newするときにnameとageを決められる
        this(name); //自分自身のコンストラクタの呼び出し、String型1つ場合は適用される。先頭に設置
        this.hp = hp;
    }

    //コンストラクタが一つもないと自動的に作られる
    // public Hero(){}

    //オーバーロード
    public Hero(String name){
        this.name = name;
    }
    //メソッド
    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }

    public void attack(int ak){
        System.out.println(this.name + "の攻撃！敵に" + ak + "のダメージを与えた");
    }
}

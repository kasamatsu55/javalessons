package day22;

public class Hero {
    //フィールド(属性、パラメータ)
    String name; //メイン側で初期化する
    int hp; //メイン側で初期化する
    //メソッド
    public void sleep(){ //クラスの中なのでstaticはいらない
        this.hp = 100; //自分自身のフィールドという意味（この場合はなくても可）
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + "は、" + sec +"秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ");
        System.out.println("5のダメージ！");
    }
    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}

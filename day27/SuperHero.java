package day27;

public class SuperHero extends Hero {
    //Heroの差分を書いていく
    boolean flying;
    public SuperHero(){
        super(); //書かなければ自動敵に挿入される
        System.out.println("SuperHeroのコンストラクタが動作");
    }
    public void fly(){
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land(){
        this.flying = false;
        System.out.println("着地した！");
    }
    @Override //コンパイラが誤字ミスを検出してくれる、他の人にもわかりやすく
    public void run(){
        System.out.println(this.name + "は撤退した");
    }
    @Override
    public void attack(Matango m){
        super.attack(m); //親クラスの
        if(this.flying){
            super.attack(m);
        }
    }
}

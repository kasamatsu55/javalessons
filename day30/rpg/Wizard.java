package day30.rpg;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public void heal(Hero h){
        int basePoint = 10; //基本回復ポイント
        int recovPoint = (int)(basePoint * this.getWand().getPower()); //杖による増幅
        h.setHp(h.getHp() + recovPoint); //勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }
    public void setHp(int hp){
        this.hp = Math.max(0,hp);
    }
    public int getHp(){
        return this.hp;
    }
    public void setMp(int mp){
        this.mp = Math.max(0,mp);
    }
    public int getMp(){
        return this.mp;
    }
    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("名前が短過ぎます");
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWand(Wand wand){
        if(wand == null){
            throw new IllegalArgumentException("杖がnullです");
        }
        this.wand = wand;
    }
    public Wand getWand(){
        return this.wand;
    }
    //文字列表現を定義する　自分でオーバーライドする
    @Override
    public String toString(){
        //作った文字列を返す
        return String.format("名前:%s,HP:%d,MP:%d",this.name,this.hp,this.mp);
    }
}

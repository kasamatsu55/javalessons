package day28.rpg1;

public class Fool extends Character1 implements Human{
    public Fool(String name , int hp){
        super(name , hp);
    }
    @Override
    public void attack(){
        System.out.println(this.name + "は攻撃した");
    }
    @Override
    public void talk(){
        System.out.println(this.name + "は話した");
    }
    @Override
    public void watch(){
        System.out.println(this.name + "は見た");
    }
    @Override
    public void hear(){
        System.out.println(this.name + "は聞いた");
    }
    @Override
    public void run(){
        System.out.println(this.name + "は逃げた");
    }
}

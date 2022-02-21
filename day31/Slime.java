package day31;

public class Slime {
   String name;
   final int POWER = 5;
   public Slime(String name){
       this.name = name;
   }
   public void attack(){
       System.out.println(this.name + "の攻撃:" + POWER + "ポイントのダメージを与えた!");
   }
   public void appear(){
       System.out.println(this.name + "が現れた！！");
   }
}

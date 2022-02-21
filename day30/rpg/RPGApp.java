package day30.rpg;

public class RPGApp {
    public static void main(String[] args) {
        Hero hero = new Hero("ロト",100);
        Wand wand = new Wand();
        wand.setName("清風の杖");
        wand.setPower(5);
        Wizard wizard = new Wizard();
        wizard.setName("ビアンカ");
        wizard.setHp(80);
        wizard.setMp(30);
        wizard.setWand(wand);
        wizard.heal(hero);
        System.out.println(wizard.toString());
        System.out.println(wizard); //でも同じ
        Wand wand2 = new Wand();
        wand2.setName("清風の杖");
        wand2.setPower(5);
        if(wand == wand2){
        }else{
            System.out.println("2つのインスタンスは違います");
        }
        if(wand.equals(wand2)){
            System.out.println("2つのインスタンスは等価です");
        }else{
            System.out.println("2つのインスタンスは違います");
        }
    }
}

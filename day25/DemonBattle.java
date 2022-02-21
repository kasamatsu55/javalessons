package day25;

public class DemonBattle {
    public static void main(String[] args) {
        final int HEROS = 10; //ヒーローの人数
        Demon demon = new Demon();
        demon.appear();
        System.out.println("ヒーローが集まった");
        Hero[] heroes = new Hero[HEROS];
        for(int i = 0; i < heroes.length; i++){
            char c = (char)('A'+i);
            heroes[i] = new Hero(c + ""); //String型にする
            heroes[i].showInfo();
        }
        while(true){
            demon.lightning(heroes);
            if(Hero.deathCount == heroes.length){
                System.out.println("ヒーローたちは全滅した");
                return;
            }
            System.out.println("--ヒーローたちの攻撃--");
            for(int i = 0; i < heroes.length; i++){
                if(heroes[i].hp > 0 && demon.isDeadAttackedBy(heroes[i])){
                    System.out.println("ヒーローたちは勝利した！");
                    return;
                }
            }
        }
    }
}

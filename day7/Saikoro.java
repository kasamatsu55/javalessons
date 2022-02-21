package day7;

public class Saikoro {
    public static void main(String[] args) {
        int you = new java.util.Random().nextInt(6) + 1 ;
        int pc = new java.util.Random().nextInt(6) + 1 ;
        System.out.println("あなたは" + you);
        System.out.println("PCは" + pc);
        if(you == pc){
            System.out.println("引き分け");
        }else if(you > pc){
            System.out.println("あなたの勝ち");
        }else{
            System.out.println("あなたの負け");
        }
    }
}

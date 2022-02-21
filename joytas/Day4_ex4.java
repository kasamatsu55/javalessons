package joytas;

public class Day4_ex4 {
    public static void main(String[] args){
        int dice1 = new java.util.Random().nextInt(6)+1;
        int dice2 = new java.util.Random().nextInt(6)+1;
        int score = dice1 + dice2; 
        if(dice1 == dice2){
            System.out.println("1回目:"+dice1+"、2回目:"+dice2+"、点数:"+(score*2));
        }else{
            System.out.println("1回目:"+dice1+"、2回目:"+dice2+"、点数:"+score);
        }
    }
}

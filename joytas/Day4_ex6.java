package joytas;

public class Day4_ex6 {
    public static void main(String[] args){
        int i = 0;
        int rnd;
        do{
            rnd = new java.util.Random().nextInt(101);
            i++;
        }while(rnd != 100);
        System.out.println(i+"回目に100が出ました！");
    }
}

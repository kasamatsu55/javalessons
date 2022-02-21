package joytas;

public class Day3_ex3 {
    public static void main(String[] args) {
        int ran = new java.util.Random().nextInt(10) + 1;
        if(ran % 2 == 0){
            System.out.println(ran + "は偶数(even)");
        }else{
            System.out.println(ran + "は奇数(odd)");
        }
    }
}

package joytas;

public class Day5_ex3 {
    public static void main(String[] args) {
        for(int i = 1; i <=9; i++){
            for(int j = 1; j <= 9; j++){
                if(i * j > 50){
                    break;
                }
                System.out.print(i * j + " ");
                // System.out.printf("%4d",i * j);
            }
            System.out.println();
        }
    }
}

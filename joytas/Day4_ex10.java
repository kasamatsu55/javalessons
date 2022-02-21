package joytas;

public class Day4_ex10 {
    public static void main(String[] args){
        for(int i = 1; i <= 20; i++){
            if(i % 15 == 0){
                System.out.println("FizzBazz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Bazz");
            }else{
            System.out.println(i);
            }
        }

    }
}

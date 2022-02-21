package day7;

public class Fizzbuzz {
    public static void main(String[] args) {
        // 1-20までカウントアップせよ
        // ただし、3で割り切れるときはFizz
        // 5で割り切れるときはBuzz
        // 3でも5でも割り切れるときはFizzBuzzと出力すること

        for(int i = 1; i <= 20; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}

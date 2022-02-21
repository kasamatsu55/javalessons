package kitako;

public class Ex4_4 {
    public static void main(String[] args) {
        int factorial = 7;
        for(int i = 6; i > 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}

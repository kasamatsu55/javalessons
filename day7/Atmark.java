package day7;

public class Atmark {
    public static void main(String[] args) {
        //10個ごとに改行する
        System.out.print("@いくつ＞＞");
        int num = new java.util.Scanner(System.in).nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print("@");
            if(i % 10 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}

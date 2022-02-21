package joytas;

public class Day5_ex1 {
    public static void main(String[] args) {
        int num1 = new java.util.Random().nextInt(21);
        int num2 = new java.util.Random().nextInt(21);
        if(num1 < num2){
            System.out.println("num2:" + num2 + "と" + "num1:" + num1 + "の差は" + (num2 - num1) + "です");
            // System.out.printf("num2:%dとnum1:%dの差は%dです",num2,num1,(num2-num1));
        }else{
            System.out.println("num1:" + num1 + "と" + "num2:" + num2 + "の差は" + (num1 - num2) + "です");
        }
    }
}

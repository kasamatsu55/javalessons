package kitako;

public class Ex1_6 {
    public static void main(String[] args) {
        int x = 7;
        x = x * 3;
        System.out.println("x=" + x);
        x = x / 2; //double型ではないので切り捨て注意
        System.out.println("x=" + x);
    }
}

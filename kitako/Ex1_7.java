package kitako;

public class Ex1_7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 50;
        int z;
        z = y;
        y = x;
        x = z;
        System.out.println("x=" + x + ",y=" + y);
    }
}

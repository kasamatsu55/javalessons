package day18;

public class MethodLesson5 {
    public static void main(String[] args) {
        int num = 1;
        int result = tenTimes(num);
        System.out.println(result); //10
        System.out.println(num); //1
    }
    // 10倍にするメソッド
    public static int tenTimes(int n){ //値渡し（値をコピーして渡している）
        n = n * 10;
        return n;
    }
}

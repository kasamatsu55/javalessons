package day18;

public class MethodLesson3 {
    public static void main(String[] args) {
        int result = sumOf(3,5);
        System.out.println(result);
        System.out.println(sumOf(3,5)); //直接

        int max = maxOf(10,20);
        System.out.println(max);
        System.out.println(maxOf(10,20)); //直接

        if(isEven(8)){ //戻り値が「true」
            System.out.println("偶数");
        }
    }
    //戻り値 sum
    public static int sumOf(int a,int b){
        int sum = a + b;
        return sum; //呼び出し元にsumを返す
    }
    //戻り値 max
    public static int maxOf(int a,int b){
        int max = a > b ? a:b;
        return max;
    }
    //下記のようにもかける
    // public static int maxOf(int a,int b){
    //     return = a > b ? a:b;
    // }

    //偶数判定
    public static boolean isEven(int n){
        // boolean isEven = n % 2 == 0;
        // return isEven;
        return n % 2 == 0;
    }


    
}

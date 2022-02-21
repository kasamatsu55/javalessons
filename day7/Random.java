package day7;

public class Random {
    public static void main(String[] args) {
        /*
        111～999までの乱数を繰り返し生成し
        777がでるまでの回数をカウントせよ
        while(true)の無限ループを使うこと
        */
        final int LUCKY = 777;
        int count = 0;
        while(true){
            count++;
            int n = new java.util.Random().nextInt(999 - 111 + 1) + 111;
            System.out.println(count + ":" + n);
            if(n == LUCKY){
                break;
            }
        }
        System.out.println(count + "回目に" + LUCKY + "がでました");
    }
}

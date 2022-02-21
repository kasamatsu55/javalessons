package day7;

public class Ex3_6 {
    public static void main(String[] args) {
        System.out.println("［数当てゲーム］");
        int ans = new java.util.Random().nextInt(10);
        /*
        0-100 nextInt(101)
        10-20 nextInt(11) + 10

        min~maxの乱数の生成
        nextInt(max - min + 1) + min

        */
        for(int i = 0; i < 5; i++){
            System.out.print("0～9の数字を入力してください＞＞");
            int num = new java.util.Scanner(System.in).nextInt();
            if(num == ans){
                System.out.println("アタリ！");
                break;
            }
            System.out.println("違います");
        }
        System.out.println("ゲームを終了します");
    }
}

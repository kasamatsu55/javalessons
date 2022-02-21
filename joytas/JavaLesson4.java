package joytas;

public class JavaLesson4 {
    public static void main(String[] args) {
        //0~2の乱数を生成し、０であればグーを1であればチョキを2であればパーを表示する処理を作成せよ
        int num = new java.util.Random().nextInt(3);
        // switch(num){
        //     case 0:
        //         System.out.println("PCはグーを出しました。");
        //         break;
        //     case 1:
        //         System.out.println("PCはチョキを出しました。");
        //         break;
        //     case 2:
        //         System.out.println("PCはパーを出しました。");
        //         break;
        // }
        String[] hands = {"グー","チョキ","パー"};
        System.out.println("PCは" + hands[num] + "を出しました。");
    }
}

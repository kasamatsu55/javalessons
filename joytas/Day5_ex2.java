package joytas;

public class Day5_ex2 {
    public static void main(String[] args) {
        final int LUCKY_NO = 777;
        int count = 0;
        while(true){
            int num = new java.util.Random().nextInt(1000);
            count++;
            if(num == LUCKY_NO){
                break;
            }
        }

        //do-while文の場合
        // int num;
        // do{
        //     count++;
        //     num = new java.util.Random().nextInt(1000);
        // }while(num != LUCKY_NO);
        System.out.println(LUCKY_NO + "は" + count + "回目に出ました");
    }
}

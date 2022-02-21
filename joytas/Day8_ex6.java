package joytas;

public class Day8_ex6 {
    public static void main(String[] args) {
        int[] rand = new int[100];
        //for文を1回で
        // for(int i = 0; i < rand.length; i++){
        //     rand[i] = new java.util.Random().nextInt(100) + 1;
        //     if(rand[i] == 77){
        //         System.out.println("インデックス" + i + "が77です");
        //         break;
        //     }else if(i == rand.length-1){
        //         System.out.println("含まれていません");
        //         break;
        //     }
        // }

        //for文を2回で
        for(int i = 0; i < rand.length; i++){
            rand[i] = new java.util.Random().nextInt(100) + 1;
        }
        for(int i = 0; i < rand.length; i++){
            if(rand[i] == 77){
                System.out.println("インデックス" + i + "が77です");
                break;
            }
            if(i == rand.length - 1){
                System.out.println("含まれていません");
            }
        }
    }
}

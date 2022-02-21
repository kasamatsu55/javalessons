package joytas;

public class Test {
    public static void main(String[] args) {
        int[][] data1 = new int[2][];
        data1[0] = new int[3];
        data1[1] = new int[4];
        System.out.println("****data1****");
        for(int i = 0; i < data1.length; i++){
            for(int j = 0; j < data1[i].length; j++){
                data1[i][j] = new java.util.Random().nextInt(100);
                System.out.printf("%4d",data1[i][j]);
            }
            System.out.println();
        }
        int[][] data2 = new int[2][];
        data2[0] = new int[3];
        data2[1] = new int[4];
        System.out.println("****data2****");
        for(int i = 0; i < data2.length; i++){
            for(int j = 0; j < data2[i].length; j++){
                data2[i][j] = new java.util.Random().nextInt(100);
                System.out.printf("%4d",data2[i][j]);
            }
            System.out.println();
        }
        System.out.println("****結果****");
        for(int i = 0; i < data2.length; i++){
            for(int j = 0; j < data2[i].length; j++){
                int sum = data1[i][j] + data2[i][j]; 
                System.out.printf("%4d",sum);
            }
            System.out.println();
        }

    }
}

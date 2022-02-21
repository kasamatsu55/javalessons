package day12;

public class ArrayGame {
    public static void main(String[] args) {
        int[][] data = {
            {1,0,0,0,2,0,0,0},
            {1,1,0,0,0,0,0,0},
            {1,1,0,0,0,2,0,0},
            {1,1,0,0,0,0,0,0},
            {1,1,1,0,0,0,0,3},
            {1,1,0,0,0,0,3,3},
            {1,0,0,0,0,0,0,0},};
        String[] maps = {"地","海","岩","木"};
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                //int num = data[i][j];として、maps[num]としても良い
                System.out.print(maps[data[i][j]]); 
            }
            System.out.println();
        }
    }
}

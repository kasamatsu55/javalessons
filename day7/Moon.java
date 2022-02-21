package day7;

public class Moon {
    public static void main(String[] args) {
        /*
        地球から月までの距離388400km 384400 * 1000 * 1000 mm
        1枚の紙があります。1mm
        一回折り曲げると2mm
        また折り曲げると4mm

        */
        long dist = 384400L * 1000 * 1000;
        long paper = 1L;
        int count = 0;
        while(paper < dist){
            count++;
            // paper = paper * 2;
            paper *= 2;
            System.out.println(count + "回目で"+ paper +"mm");                                  
        }
        System.out.println(count + "回目で月までの距離を超えました");
    }
}

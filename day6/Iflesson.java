package day6;

public class Iflesson {
    public static void main(String[] args) {
        // int age = 25;
        // if(age >= 20) {
        //     System.out.println("大人です");
        // } else {
        //     System.out.println("子供です");
        // }

        // int score = 70;
        // if(score >= 80){
        //     System.out.println("優");
        // }else if(score >= 60){
        //     System.out.println("良");
        // }else if(score >= 20){
        //     System.out.println("可");
        // }else{
        //     System.out.println("不可");
        // }
        // System.out.println("end");

            // String gender = "男";
            // int age1 = 33;
            // if((gender.equals("男") && age1 >= 18 )
            // || (gender.equals("女") && age1 >= 16 )) {
            //     System.out.println("結婚OK");
            // }
            /*
            うるう年
            4で割り切れたら基本はうるう年
            ただし、100で割り切れたら×
            ただし、400で割り切れたらOK
            */
            int year = 2021;
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println(year + "年はうるう年です");
            }else{
                System.out.println(year + "年はうるう年ではありません");
            }
    }
}

package day20;

public class MethodEx5_1 {
    public static void main(String[] args) {
        name("さとう");
        age(20);
        height(175.66);
        eto('寅');
    }
    public static void name(String name){
        System.out.printf("私の名前は%sです。%n",name);
    }
    public static void age(int age){
        System.out.printf("私は%d歳です。%n",age);
    }
    public static void height(double height){
        System.out.printf("私の身長は%.1fcmです。%n",height);
    }
    public static void eto(char eto){
        System.out.printf("私は%s年です。%n",eto);
    }
}

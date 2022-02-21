package day20;

public class MethodEx5_2 {
    public static void main(String[] args) {
        email("夏祭りの件","abeabe@gmail.com","明日のお昼に集合");
    }
    public static void email(String title,String address,String text){
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }
}

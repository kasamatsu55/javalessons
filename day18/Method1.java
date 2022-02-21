package day18;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("start");
        // hello();
        for(int i = 0; i < 10; i++){
            hello("田中",30); //引数の順番＆型は作ったメソッドと同じ
        }
        //下記の書き方でも同じ意味
        for(int i = 0; i < 10; i++){
            String name = "田中";
            int age = 20;
            hello(name,age);
        }
        bye("大崎",55);
        hello("鈴木",40);
        System.out.println("end");
    }
    //helloメソッド
    public static void hello(String name , int age){ //カンマで引数を追加できる
        System.out.printf("%s(%d歳)さん、こんにちは%n",name,age);
    }
    //byeメソッド
    public static void bye(String name , int age){
        System.out.printf("%s(%d歳)さん、さようなら%n",name,age);
    }
}

package day11;

public class PrintfLesson {
    public static void main(String[] args) {
        // String name = "山田";
        // int age = 20;
        // System.out.printf("%s(%d)さん、こんにちは%n",name,age);

        // for(int i = 1; i <=9; i++){
        //     for(int j = 1; j <=9; j++){
        //         System.out.printf("%3d",i*j);
        //     }
        //     System.out.println();
        // }

        double pi = 3.141592;
        System.out.printf("円周率は%.2fです",pi);
        
        //piを3.14に書き換えたい場合
        pi = (int)(pi * 100) / 100.0; //「100」で割ると結果が「3」になっちゃう
        System.out.println(pi);  //「3.14」
        
        //三項演算子
        System.out.println(3 > 5 ? 3:5);
    }
}

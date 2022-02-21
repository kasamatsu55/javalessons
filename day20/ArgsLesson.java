package day20;

public class ArgsLesson {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("引数なし");
        }else{
            int sum = 0;
            for(String s : args){
                sum += Integer.parseInt(s); //文字列なのでintに変換して足していく
            }
            System.out.println("合計は"+sum);
        }
    }
}

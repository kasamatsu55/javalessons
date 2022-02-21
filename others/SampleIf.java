package others;

public class SampleIf {
    public static void main(String[] args) {
        int num = 2;
        if(num == 1)
            System.out.println("正解！"); //if文の処理が1文だけなら{}がなくても処理できる...
        System.out.println("処理を終了します。");
        System.out.println();

        if(num == 1)
            System.out.println("正解！");
            System.out.println("すごい！"); //falseの場合でも意図していない「すごい！」が出力されてしまう
        System.out.println("処理を終了します");
        System.out.println();

        if(num == 1){ //処理が1文でも②文でも、{}で囲むのがベター
            System.out.println("正解！");
            System.out.println("すごい！");
        }
        System.out.println("処理を終了します。");
    }
}

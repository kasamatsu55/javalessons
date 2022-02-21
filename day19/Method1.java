package day19;

public class Method1 {
    public static void main(String[] args) {
        int a = 3,b = 5,c = 8;
        int n = sumOf(a,b,c);
        System.out.println(n);

        int[] arr = {1,2,3,4,5,};
        System.out.println(sumOf(arr));

        String word="Hello";
        System.out.println(timesWord(word,a));
        System.out.println(timesWord("こんにちは",6));

        System.out.println(decoWord("apple",'★'));

        System.out.println(decoWord("apple","〇","-"));
    }

    public static int sumOf(int a,int b){
        return a + b;
    }
    
    //overlord(オーバーロード,多重定義)
    //名前が同じで引数の並びが違うメソッドを宣言すること
    public static int sumOf(int[] arr){
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }

    //並びが同じなのでエラー
    // public static int sumOf(int x,int y){
    //     return x + y;
    // }

    //引数の数が違うのでOK
    public static int sumOf(int x,int y,int z){
        return x + y + z;
    }

    public static String timesWord(String str,int n){
        String strTimes =""; //文字列の初期化（空文字を入れる）
        for(int i = 0; i < n; i++){
            strTimes += str;
        }
        return strTimes;
    }

    //apple → ★apple★
    public static String decoWord(String word,char deco){
        return deco + word + deco;
    }

    //apple → 〇apple-
    public static String decoWord(String word,String first,String last){
        return first + word + last;
    }

}

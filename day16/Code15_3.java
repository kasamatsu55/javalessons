package day16;

public class Code15_3 {
    public static void main(String[] args) {
        String s1 = "Java programming";

        //指定位置の1文字を切り出す
        char c = s1.charAt(1); 
        System.out.println(c); //「a」が出力される
        System.out.println(s1.charAt(8)); //「g」が出力される

        // 指定位置から始まる文字列を任意の長さだけ切り出す
        System.out.println("文字列s1の4文字目以降は" + s1.substring(3)); //「a programming」
        System.out.println("文字列s1の4～8文字目は" + s1.substring(3,8)); // 「a pro」
        System.out.println(s1.substring(5,6)); //「p」
        // System.out.println(s1.substring(12,20)); //文字数をオーバーしているのでエラー

        //小文字を大文字に変換
        String s2 = "apple";
        String s3 = s2.toUpperCase(); 
        System.out.println(s3); //「APPLE」

        // 大文字を小文字にする場合は「toLowerCase()」
        
        //前後の空白を除去する
        String s4 = " Hello Hello "; //前後に半角スペースがある
        String s5 = s4.trim();
        System.out.println(s5); //「Hello Hello」半角スペースが除去される（全角は無理）

        //文字列を置き換える
        String s6 = s1.replace("Java","Python");
        System.out.println(s6); //「Python programming」

    }
}

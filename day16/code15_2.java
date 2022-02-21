package day16;

public class code15_2 {
    public static void main(String[] args) {
        // 一部に文字列sを含むかを調べる
        String s1 = "Java and JavaScript";
        if(s1.contains("Java")){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        //末尾が文字列sで終わるかを調べる
        if(s1.endsWith("Java")){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        //先頭が文字列sで始まるかを調べる
        if(s1.startsWith("Java")){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        // 前から検索（最初のカウントは「０」から）
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        // 後ろから検索
        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));


    }
}

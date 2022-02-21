package day16;

public class Code15_1 {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        // 内容が等しいか調べる
        if(s2.equals(s3)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        // 大文字、小文字を区別せずに等しいか調べる
        if(s2.equalsIgnoreCase(s3)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
        // 文字列長さを調べる
        System.out.println("s1の長さは" + s1.length());
        
        //空文字を調べる
        String s4 = "";         
        if(s4.isEmpty()){
            System.out.println("s4は空文字です");
        } 
    }
}

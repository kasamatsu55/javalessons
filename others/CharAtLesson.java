package others;
import java.util.*;
public class CharAtLesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力した文字列を1文字ずつ表示
        // System.out.print("文字列を入力してください＞");
        // String word = sc.nextLine();
        // for(int i = 0; i < word.length(); i++){
        //     char w = word.charAt(i);
        //     if(w == ' '){
        //         System.out.printf("%d文字目は「スペース」です%n",i+1);
        //     }else{
        //         System.out.printf("%d文字目は「%s」です%n",i+1,w);
        //     }
        // }

        // 入力した文字列を配列に変換
        // System.out.print("文字列を入力してください＞");
        // String word = sc.nextLine();
        // char[] words = new char[word.length()];
        // for(int i = 0; i < words.length; i++){
        //     words[i] = word.charAt(i);
        // }
        // System.out.println(Arrays.toString(words));

        //1文字を入力して判定
        System.out.println("あなたは男性ですか？");
        System.out.print("YまたはNを入力してください。＞");
        String ans = sc.nextLine(); //「char ans = sc.nextLine();」はできない
        char a = ans.charAt(0);
        if(a == 'Y' || a == 'y'){ //一文字との比較なので「'」が必要
            System.out.println("あなたは男ですね。");
        }else if(a == 'N' || a == 'n'){
            System.out.println("あなたは女ですね。");
        }else{
            System.out.println("YまたはNを入力してください。");
        }
        // 文字列のまま比較するには「equals("文字列")」
        // if(ans.equals("Y") || ans.equals("y")){
        //     System.out.println("あなたは男ですね。");
        // }else if(ans.equals("N") || ans.equals("n")){
        //     System.out.println("あなたは女ですね。");
        // }else{
        //     System.out.println("YまたはNを入力してください。");
        // }
        sc.close();
    }
}

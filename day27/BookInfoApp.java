package day27;
import java.util.*;
public class BookInfoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("本のページ数を入力して下さい>");
        int n = sc.nextInt();
        System.out.print("本の価格を入力して下さい>");
        int p = sc.nextInt();
        Book bk = new Book(n,p);
        System.out.print("ノートのページ数を入力して下さい>");
        n = sc.nextInt();
        System.out.print("ノートの価格を入力して下さい>");
        p = sc.nextInt();
        NoteBook nbk = new NoteBook(n,p);
        while(true){
            System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
            n = sc.nextInt();
            switch(n){
                case 1:
                    bk.showInfo();
                    break;
                case 2:
                    nbk.showInfo();
                    break;
                case 3:
                    nbk.addWritten();
                    break;
                case 4:
                    System.out.println("アプリケーションを終了します。");
                    return;
            }
        }
    }
}

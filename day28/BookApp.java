package day28;
import java.util.*;
public class BookApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("本のページ数>");
        int page = sc.nextInt();
        System.out.print("本の価格>");
        int price = sc.nextInt();
        Book book = new Book(page , price);
        System.out.print("ノートのページ数>");
        page = sc.nextInt();
        System.out.print("ノートの価格>");
        price = sc.nextInt();
        NoteBook notebook = new NoteBook(page , price);
        while(true){
            System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
            int select = sc.nextInt();
            switch(select){
                case 1:
                    book.info();
                    break;
                case 2:
                    notebook.info(); //オーバーライドしているのでNoteBookクラスのinfoが実行される
                    break;
                case 3:
                    System.out.print("書き込む内容を入力して下さい >");
                    String str = sc.next();
                    notebook.append(str);
                    break;
                default:
                    System.out.println("アプリケーションを終了します。");
                    sc.close();
                    return;

            }
        }
    }
}

class Book{
    int page;
    int price;
    //コンストラクタ
    public Book(int page , int price){
        this.page = page;
        this.price = price;
    }
    //情報を出力するメソッド
    public void info(){
        System.out.printf("ページ数:%d%n価格:%d%n",this.page,this.price);
    }
}

class NoteBook extends Book{
    String content = "";
    public NoteBook(int page , int price){
        super(page,price);
    }
    public void append(String str){
        this.content += str;
    }
    @Override
    public void info(){
        super.info(); //ページ数と価格が表示される
        System.out.printf("内容:%s%n",this.content); //同じ内容は書かないように
    }
}

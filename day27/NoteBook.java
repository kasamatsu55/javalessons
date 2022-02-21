package day27;
import java.util.*;
public class NoteBook extends Book{
    String written = "";
    public NoteBook(int page,int price){
        super(page,price);
    }
    public void addWritten(){
        Scanner sc = new Scanner(System.in);
        System.out.print("書き込む内容を入力して下さい >");
        this.written += sc.nextLine();
    }
    @Override
    public void showInfo(){
        System.out.printf("ページ数:%d%n価格:%d%n内容:%s%n",this.page,this.price,this.written);
    }
}

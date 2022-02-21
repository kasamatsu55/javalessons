package day27;

public class Book {
    int page;
    int price;
    public Book(int page,int price){
        this.page = page;
        this.price = price;
    }
    public void showInfo(){
        System.out.printf("ページ数:%d%n価格:%d%n",this.page,this.price);
    }
}

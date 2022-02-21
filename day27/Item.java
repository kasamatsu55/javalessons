package day27;

public class Item {
    String name;
    int price;
    //public Item(){} //エラーにならないように書くことは可
    public Item(String name){
        super();
        this.name = name;
    }
    public Item(String name, int price){
        this(name); //1行目にはthis or super がないとだめ
        this.price = price;
    }
}

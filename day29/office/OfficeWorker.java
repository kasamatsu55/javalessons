package day29.office;

public abstract class OfficeWorker {
    String name;
    public void introduce(String name){
        this.name = name;
        System.out.println("はじめまして、私は" + this.name + "です。");
    }
    public abstract void work(String name); //抽象メソッド
}

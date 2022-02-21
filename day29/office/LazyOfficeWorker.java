package day29.office;

public class LazyOfficeWorker extends OfficeWorker{
    LazyOfficeWorker(String name){
    }
    @Override
    public void work(String name){
        this.name = name;
        System.out.println(this.name + "はPCの画面を即座に切り替えた。何をしていたのだろう。");
    }
}

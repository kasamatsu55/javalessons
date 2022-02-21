package day29.office;

public class EliteOfficeWorker extends OfficeWorker{
    EliteOfficeWorker(String name){
    }
    @Override
    public void work(String name){
        this.name = name;
        System.out.println(this.name + "は仕事がはやい！しかも正確だ。");
    }
}

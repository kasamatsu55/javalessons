package day29.office;

public class OrdinaryOfficeWorker extends OfficeWorker{
    OrdinaryOfficeWorker(String name){
    }
    @Override
    public void work(String name){
        System.out.println(this.name + "は９時から５時まで働いている。遅刻や欠勤はない");
    }
}

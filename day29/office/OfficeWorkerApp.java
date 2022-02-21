package day29.office;
import java.util.*;
public class OfficeWorkerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("あなたの部下に3人配属されました");
        OfficeWorker[] ow = new OfficeWorker[3];
        for(int i = 0; i < ow.length; i++){
            System.out.print(i + 1 + "番目の名前を入力してください>");
            String name = sc.next();
            ow[i] = new OrdinaryOfficeWorker(name);
            ow[i].introduce(name);
        }
        while(true){
            System.out.println("誰の働きぶりを見にいきますか？");
            for(int i = 0; i < ow.length; i++){
                System.out.println(i + "・・・" + ow[i].name);
            }
            System.out.print("番号を入力してください>");
            int n = sc.nextInt();
            if(n > 2){
                System.out.println("アプリケーションを終了します");
                sc.close();
                return;
            }
            int r = rand.nextInt(3);
            switch(r){
                case 0:
                    OrdinaryOfficeWorker oo = new OrdinaryOfficeWorker(ow[n].name);
                    oo.work(ow[n].name);
                    break;
                case 1:
                    EliteOfficeWorker eo = new EliteOfficeWorker(ow[n].name);
                    eo.work(ow[n].name);
                    break;
                case 2:
                    LazyOfficeWorker lo = new LazyOfficeWorker(ow[n].name);
                    lo.work(ow[n].name);
                    break;
            }
        }        
    }
}

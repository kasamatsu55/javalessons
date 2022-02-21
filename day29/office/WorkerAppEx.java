package day29.office;
import java.util.*;
public class WorkerAppEx{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの部下に3人配属されました。");
		OfficeWorkerEx[] workers = new OfficeWorkerEx[3]; //インスタンスできないけど、配列は作れる
		Random rand = new Random();
		for(int i = 0; i < workers.length; i++){
			System.out.printf("%d人目の名前を入力>>",i+1);
			String name = sc.next(); //インスタンスできる条件が揃った
			int rnd = rand.nextInt(3);
			switch(rnd){
				case 0:
					workers[i]=new OrdinaryOfficeWorkerEx(name);
					break;
				case 1:
					workers[i]=new EliteOfficeWorkerEx(name);
					break;
				case 2:
					workers[i]=new LazyOfficeWorkerEx(name);
					break;
			}
			workers[i].introduce();
		}
		while(true){
			System.out.println("誰の働きぶりを見に行きますか?");
			for(int i = 0; i <= workers.length; i++){
				System.out.printf("%d...",i);
				if(i == workers.length){
					System.out.println("終了");
				}else{
					System.out.println(workers[i].name);
				}
			}
			System.out.print("番号を入力>>");
			int idx = sc.nextInt();
			if(idx >= workers.length){
				System.out.println("アプリケーションを終了します.");
				sc.close();
				return;
			}
			workers[idx].work(); //それぞれが自分のwork();を実行してくれる。多態性
		}


	}

}

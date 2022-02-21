package day30.bicycle;
import java.util.Scanner;
public class BicycleApp {
	public static void main(String[] args) {
		Bicycle[] bicycles={new Bicycle(27),new ElectricBicycle(24,10)};
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("自転車を選んでください");
			for(int i = 0;i <= bicycles.length; i++){
				System.out.println(i + "・・・" + (i == bicycles.length ? "終了" : bicycles[i]));
			}
			System.out.print("番号を入力してください>");
			int select = s.nextInt();
			if(select == bicycles.length){System.out.println("アプリケーションを終了します。");return;}
			Bicycle myBicycle = bicycles[select];
			do{
				System.out.print("1/走る,2/降りる" + (myBicycle instanceof ElectricBicycle? ",3/充電":"")+">");
				select=s.nextInt();
				switch(select){
				case 1:
					myBicycle.ride();
					break;
				case 2:
					System.out.println("自転車を降りました。");
					break;
				case 3:
					if(myBicycle instanceof ElectricBicycle){
						((ElectricBicycle)myBicycle).batteryCharge();
					}
					break;
				}
			}while(select != 2);
		}
	}
}
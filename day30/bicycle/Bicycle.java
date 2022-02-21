package day30.bicycle;

public class Bicycle {
	private int wheelSize;
	public Bicycle(int wheelSize){
		this.wheelSize = wheelSize;
	}
	public void ride(){
		System.out.println("風をきって走ります。");
	}
	@Override
	public String toString() {
		return "自転車/ホイールサイズ:" + this.wheelSize;
	}	
}
class ElectricBicycle extends Bicycle{
private static final int MAX=10;
	private int battery;
	public ElectricBicycle(int wheelSize,int battery) {
		super(wheelSize);
		this.battery = battery > MAX? MAX : battery;
	}
	@Override
	public void ride() {
		super.ride();
		battery -= 5;
		if(battery > 0){
			System.out.println("坂道だってラクラクです。");
		}else{
			System.out.println("バッテリーが切れるととても重いです。");
		}
	}
	public void batteryCharge(){
		this.battery = MAX;
		System.out.println("バッテリーを充電しました。");
	}
	@Override
	public String toString() {
		return "電動" + super.toString() + " バッテリー:" + this.battery;
	}	
}
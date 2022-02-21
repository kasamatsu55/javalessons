package day29.office;

public abstract class OfficeWorkerEx{
	String name;
	public OfficeWorkerEx(String name){
		this.name = name;
	}
	public void introduce(){
		System.out.println("はじめまして。私は" + this.name + "です。");
	}
	public abstract void work(); //内容が決まっていない
}
//真面目
class OrdinaryOfficeWorkerEx extends OfficeWorkerEx{
	public OrdinaryOfficeWorkerEx(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは9時から5時まで働いている。遅刻や欠勤はない%n",this.name);
	}
}
//エリート
class EliteOfficeWorkerEx extends OfficeWorkerEx{
	public EliteOfficeWorkerEx(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ。%n",this.name);
	}
}
//さぼり
class LazyOfficeWorkerEx extends OfficeWorkerEx{
	public LazyOfficeWorkerEx(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",this.name);
	}
}

package day24;
public class Monkey{
	static int totalCount = 0; //スタティックフィールド
	String name;
	int age;
	public Monkey(String name , int age){
		this.name = name;
		this.age = age;
		totalCount++;
	}
	//インスタンスメソッド
	public void greet(){
		System.out.printf("こんにちは%s(%d才)です。%n",this.name,this.age);
	}
	public void takeuma(){
		System.out.printf("%sは竹馬にのった！%n",this.name);
	}
	public void sakadachi(){
		System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
	}
	public static int getTotalCount(){ //スタティックメソッド(クラスメソッド)
		return totalCount;
	}
}

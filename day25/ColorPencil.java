package day25;
public class ColorPencil{
	String color;
	int len;
	ColorPencil(String color,int len){ //public省略
		this.color = color;
		this.len = len;
	}
	void write(){
		if(this.len <= 0){
			System.out.printf("%sはもう書けません！%n",this.color);
			return;
		}
		System.out.printf("%sで書いた！%n",this.color);
		this.len--;
	}
	void showInfo(){
		System.out.print(this.color);
		for(int i = 0; i < this.len; i++){
			System.out.print("-");
		}
		System.out.println(">");
	}
}

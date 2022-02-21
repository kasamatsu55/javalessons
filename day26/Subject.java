package day26;
public class Subject{
	String name; //科目名
	int score; //点数 
	Subject(String name , int score){
		this.name = name;
		this.score = score;
	}
	void showScore(){
		System.out.printf("%s:",this.name);
		for(int i = 0; i < this.score; i++){
			System.out.print("*");
			if((i+1) % 10 == 0){
				System.out.print("|");
			}
		}
		System.out.println();
	}
}

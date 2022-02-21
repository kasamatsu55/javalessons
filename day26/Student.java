package day26;
public class Student{
	String name; //生徒の名前
	Subject[] subjectData; //科目データ（科目名、点数）
	int totalScore; //総合点

	//コンストラクタ
	Student(String name){
		this.name = name;
	}
	//インスタンスメソッド
	void showInfo(){
		System.out.printf("%s(%d)%n",this.name,this.totalScore);
		for(Subject s:subjectData){
			s.showScore();
		}
	}

}

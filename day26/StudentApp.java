package day26;
import java.util.*;
public class StudentApp{
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("科目数は>>");		
		int n = sc.nextInt();
		String[] subjectNames = new String[n]; //科目数でString 型配列を作成する
		// String[] subjectNames = new String[sc.nextInt()];
		for(int i = 0; i < subjectNames.length; i++){
			System.out.printf("科目%d>>",i+1);
			subjectNames[i] = sc.next();
		}
		System.out.print("生徒は何人ですか>>");
		n = sc.nextInt();
		Student[] data = new Student[n]; //生徒の人数でStudent 型配列を作成する
		for(int i = 0; i < data.length; i++){
			System.out.printf("%d人目の名前を入力>>",i+1);
			String name = sc.next();
			data[i] = new Student(name); //名前をもとにStudentインスタンスを作成し、配列に(アドレスを)入れる
			//data[i] = new Student(sc.next());
			Subject[] subjectData = new Subject[subjectNames.length]; //Subject型の配列を科目数で作成する
			for(int j = 0; j < subjectData.length; j++){
				System.out.printf("%sの%s>>",data[i].name,subjectNames[j]);
				int score = sc.nextInt();
				data[i].totalScore += score; //点数をその人の合計点数に加算する
				//data[i].totalScore += sc.nextInt();
				subjectData[j] = new Subject(subjectNames[j],score); //科目名と点数をもとにSubjectインスタンスを作成し、配列にいれる
			}
			data[i].subjectData = subjectData; //作成したSubject型配列をStudentインスタンスにセットする
		}
			
		for(int i = 0; i < data.length - 1; i++){
			for(int j = i + 1; j < data.length; j++){
				if(data[i].totalScore < data[j].totalScore){
					Student temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println("---結果---");
		for(int i = 0; i < data.length; i++){
			System.out.printf("%d.", i + 1);
			data[i].showInfo();
		}
		sc.close();
	}
}

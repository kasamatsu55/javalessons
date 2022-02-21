package day26;
import java.util.*;
public class ScoreApp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int n = sc.nextInt();
		Subject[] sj = new Subject[n];
		for(int i = 0; i < sj.length; i++){
			System.out.printf("%d科目目の名前>>",i+1);
			String name = sc.next();
			System.out.printf("%d科目目の点数>>",i+1);
			int score = sc.nextInt();
			sj[i] = new Subject(name,score); //インスタンスを作って配列に入れる(アドレスを代入)
		}
		for(Subject s : sj){
			s.showScore();
		}
		sc.close();
	}
}

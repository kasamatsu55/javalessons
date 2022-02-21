package day31.setLesson;
import java.util.*;
public class Set4{
	public static void main(String[] args){
		String dataCSV = "タコ,イクラ,マグロ,トロ,イクラ,ウニ,ホタテ,マグロ,トロ,マグロ,エビ,イカ";
		String[] data = dataCSV.split(",");
		System.out.println("今日食べたお寿司");
		for(String sushi:data){
			System.out.println(sushi);
		}
		System.out.println("食べた種類を食べた順に表示します(重複除く)");
		List<String> list = Arrays.asList(data); //配列からリストに変換する
		Set<String> set = new LinkedHashSet<>(list);
		System.out.println(set);
	}
}

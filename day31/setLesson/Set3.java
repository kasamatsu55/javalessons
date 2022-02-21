package day31.setLesson;
import java.util.*;
public class Set3{
	public static void main(String[] args){
		Random rand = new Random();
		System.out.println("1-10のランダムな値を10個生成します。");
		List<Integer> allData = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			allData.add(rand.nextInt(10)+1);
		}
		System.out.println(allData);

		System.out.println("出目の種類を昇順に表示します");
		Set<Integer> setData=new TreeSet<>(allData);
		System.out.println(setData);
	}
}
package day31.setLesson;
import java.util.*;
public class Set1{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Set<Integer> dices = new HashSet<>();
		System.out.print("何回ふる>>");
		int count = sc.nextInt();
		for(int i = 0; i < count; i++){
			int dice=rand.nextInt(6)+1;
			System.out.println(dice);
			dices.add(dice);
		}
		if(dices.size() == 1){
			System.out.println("ゾロ目です");
		}else{
			System.out.println("ゾロ目ではありません");
		}
		sc.close();
	}
}
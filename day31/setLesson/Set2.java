package day31.setLesson;
import java.util.*;
public class Set2{
	public static void main(String[] args){
		Random rand = new Random();
		Set<Integer> dices = new HashSet<>();
		System.out.println("サイコロを繰り返しふります");
		int count = 0;
		while(true){
			count++;
			int dice = rand.nextInt(6)+1;
			System.out.println(dice);
			dices.add(dice);
			if(dices.size() == 6){
				break;
			}
		}
		System.out.println(count+"回で揃いました");
	}
}

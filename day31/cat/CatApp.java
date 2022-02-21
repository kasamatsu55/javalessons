package day31.cat;
import java.util.*;
public class CatApp {
    public static void main(String[] args) {
        System.out.println("***Cat Collection***");
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Cat> list = new ArrayList<>();
        while(true){
            System.out.print("1.Collect Cats 2.Play 3.End>");
            int select = sc.nextInt();
            switch(select){
            case 1:
                int index = rand.nextInt(Cat.TYPES.length);
                char type = Cat.TYPES[index];
                System.out.println(type + "-type cat appeared!");
                System.out.print("Please name this cat>");
                String name = sc.next();
                Cat c = new Cat(type,name);
                list.add(c);
                System.out.println(name + "joined!");
                break;
            case 2:
                if(list.size() == 0){
                    System.out.println("You do not have anyone to play with.");
                }else{
                    for(int i = 0; i < list.size(); i++){
                        System.out.printf("%d...%s%n",i,list.get(i).info());
                    }
                    System.out.print("Who do you play with?>");
                    int num = sc.nextInt();
                    list.get(num).play();
                }
                break;
            case 3:
            System.out.println("Game over");
            sc.close();
            return;
            }
        }
    }
}

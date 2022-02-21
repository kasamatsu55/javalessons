package day29.animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Jonh"),
            new Pig("Paul"),
            new Cat("Ringo")
        };
        for(Animal a : animals){
            a.makeNoise(); //自分の鳴き方をしてくれる
            if(a instanceof Cat){ //true or falseを返す　(a == Cat)のインスタンス版 P479
                // Cat cat = (Cat)a;
                // cat.sleep();
                ((Cat)a).sleep(); //「(Cat)a.sleep」だと、a.sleepの方が先に実行しようとしてしまう
            }
        }
    }
}

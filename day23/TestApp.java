package day23;

public class TestApp {
    public static void main(String[] args) {
        Cleric cl = new Cleric("ロト",20,20);
        cl.selfAid();
        System.out.println(cl.hp);

        cl.mp = 0;
        System.out.println(cl.mp);
        cl.pray(5);
        System.out.println(cl.mp);


    }
}

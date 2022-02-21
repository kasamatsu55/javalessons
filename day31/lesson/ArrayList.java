package day31.lesson;

public class ArrayList {
    public static void main(String[] args) {
        java.util.Map<Hero,Integer> heros = new java.util.HashMap<>();
        heros.put(new Hero("saito"),3);
        heros.put(new Hero("suzuki"),7);
        for(Hero key : heros.keySet()){
            int value = heros.get(key);
            System.out.println(key.getName() + value);
        }
        
    }
}

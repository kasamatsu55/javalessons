package day31;
import java.util.*;
public class SetApp {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤"); //重複しているので無視される
        System.out.println("色は" + colors.size() + "種類");

        for(String s : colors){ //どのような順序で要素が取り出されるかは一切保証されていない
            System.out.println(s);
        }
        //自然順序
        Set<String> words = new TreeSet<>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for(String s : words){
            System.out.println(s);
        }

    }
}

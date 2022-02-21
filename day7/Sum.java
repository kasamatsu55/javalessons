package day7;

public class Sum {
    public static void main(String[] args) {
        //ある数からある数までの足し算
        System.out.print("最初＞＞");
        int first = new java.util.Scanner(System.in).nextInt();
        System.out.print("最後＞＞");
        int last = new java.util.Scanner(System.in).nextInt();
        int sum = 0;
        // int x = first;
        // while(true){
        //     sum = sum + first;
        //     first = first + 1;
        //     if(first > last){
        //         break;
        //     }
        // }
        // System.out.println(x + "から" + last + "までの和は" + sum +"です");

        for(int i = first ; i <= last; i++){
            sum = sum + i;
        }
        System.out.println(first + "から" + last + "までの和は" + sum +"です");
    }
}

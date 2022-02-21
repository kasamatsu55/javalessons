package day32;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sArr = s.split(" ");
        if(sArr[0].equals("x")){
            if(sArr[1].equals("+")){
                System.out.println(Integer.parseInt(sArr[4])-Integer.parseInt(sArr[2]));
            }else{
                System.out.println(Integer.parseInt(sArr[4])+Integer.parseInt(sArr[2]));
            }
        }else if(sArr[2].equals("x")){
            if(sArr[1].equals("+")){
                System.out.println(Integer.parseInt(sArr[4])-Integer.parseInt(sArr[1]));
            }else{
                System.out.println(Integer.parseInt(sArr[4])+Integer.parseInt(sArr[1])*(-1));
            }
        }else{
            if(sArr[1].equals("+")){
                System.out.println(Integer.parseInt(sArr[0])+Integer.parseInt(sArr[2]));
            }else{
                System.out.println(Integer.parseInt(sArr[0])-Integer.parseInt(sArr[1]));
            }
        }    
    }
}

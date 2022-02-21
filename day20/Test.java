package day20;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String s = "12321";
        System.out.println(isKaibun(s));
    }
    public static boolean isKaibun(String str) {
		boolean isKai = true;
		char[] data = str.toCharArray();
        System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length / 2; i++) {
			if (data[i] != data[data.length - 1 - i]) {
				isKai = false;
				break;
			}
		}
		return isKai;
    }
}

package day11;

public class ArrayNull {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        arr1 = null;
        System.out.println(arr1[0]); //arr1の参照が切れているのでヌルポ
    }
}

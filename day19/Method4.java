package day19;

public class Method4 {
    public static void main(String[] args) {
        String[] data={"apple","banana","orange"};
        System.out.println(indexOfArr(data,"apple"));

        String[] data1={"apple","apple","orange","pine"};
        System.out.println(countOfArr(data1,"apple"));
    }

    //引数に文字列型配列と文字列を受け取り、その文字列が最初に現れるindexを返却する。
    //もしなかった場合は-1を返却する
    public static int indexOfArr(String[] arr,String word){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(word)){
                return i;
            }
        }
        return -1;
    }

    //引数に文字列型配列と文字列を受け取り、
    //配列内に含まれる文字列の個数を求めるメソッド
    public static int countOfArr(String[] arr,String word){
        int count=0;
        for(String s : arr){
          if(s.equals(word)){
            count++;
          }
        }
        return count;
    }

}

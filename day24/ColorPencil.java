package day24;

public class ColorPencil {
    String color;
    int len;

    public ColorPencil(String color , int len){
        this.color = color;
        this.len = len;
    }

    public void write(){
        if(this.len<=0){
			System.out.println(this.color + "はもう書けません!");
			return;
		}
        System.out.println(this.color + "で書いた！");
        this.len -= 1;
    }

    public void showInfo(){
        System.out.print(this.color);
        for(int i = 0; i < this.len; i++){
            System.out.print("-");
        }
        System.out.println(">");
    }
}

package day28.shape;

public class Rectangle implements Shape{ //implements
    int width;
    int height;
    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    @Override
	public void calcArea(){
		System.out.println("面積は"+width*height+"です");
	}
}

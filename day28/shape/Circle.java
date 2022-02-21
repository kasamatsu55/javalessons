package day28.shape;

public class Circle implements Shape{ //implements
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
	public void calcArea(){
		System.out.println("面積は"+this.radius*this.radius*3.14+"です");
	}
}

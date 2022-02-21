package day28.shape;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,4); //new
        rect.calcArea();
        Circle c = new Circle(2.3); //new 半径「2.3」
		c.calcArea();
    }
}

package dhivya.com;

class Shapes{
     void getArea() {
    	 
     }
}
class Rectangle extends Shapes{
	int length;
	int height;
	public Rectangle(int length,int height) {
		this.length = length;
		this.height = height;
	}
	@Override
	void getArea() {
		System.out.println("Area : "+length * height);
		super.getArea();
	}
}

public class Shape {
public static void main(String[] args) {
	Rectangle obj = new Rectangle(6,4);
	obj.getArea();
}
}

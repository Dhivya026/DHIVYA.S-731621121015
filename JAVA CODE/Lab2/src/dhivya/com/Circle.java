package dhivya.com;
//Class
public class Circle {
	double radius;

//Constructor
public Circle(double radius){
	this.radius = radius;
	
}
//Method
void display() {
	System.out.println("Area : "+(3.14 * radius * radius));
	System.out.println("Perimeter : "+(2*3.14 * radius));
}
public static void main(String[] args) {
	Circle obj = new Circle(6);
	obj.display();
}
}
	
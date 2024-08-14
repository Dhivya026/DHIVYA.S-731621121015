package dhivya.com;

class Vehicle{
  void drive() {
		System.out.println("Various types of Vehicles");
	}
}
 
class car extends Vehicle{
	@Override
	void drive() {
		System.out.println("Reparing a Car");
		super.drive();
	}
}

public class Vehicles {
	public static void main(String[] args) {
		Vehicle obj = new car();
		obj.drive();
	}

}

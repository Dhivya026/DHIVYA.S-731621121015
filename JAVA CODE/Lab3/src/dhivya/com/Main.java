package dhivya.com;
class demo{
	public void move() {
		System.out.println("Forest Animals");

	}
}
class Cheetah extends demo{
	@Override
	public void move() {
		System.out.println("Cheetah Runs Fast");
		super.move();
	}
}

public class Main {
public static void main(String[] args) {
	demo obj = new Cheetah();
	obj.move();
	
	
}
}

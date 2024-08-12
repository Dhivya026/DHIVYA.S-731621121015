package google;

public class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Welcome " +name);
		
	}
	void myMethod(int a, int b) {
		System.out.println("sum : "+ (a+b));
		
	}
	void myMethod(int n) {
		System.out.println("Sum : "+(n + n));
	
}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod(5);
		obj.myMethod("Dhivya");
		obj.myMethod(10, 20);
	}

}

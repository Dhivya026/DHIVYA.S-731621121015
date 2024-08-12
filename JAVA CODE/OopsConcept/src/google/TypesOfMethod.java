package google;

public class TypesOfMethod {
	void myMethod() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		TypesOfMethod obj = new TypesOfMethod();
		obj.myMethod();
		TypesOfMethod.myMethod2();
		
	}

}

package google;

public class TypesOfVariables {
	int b = 20;
	static int c = 30;
	public static void main(String[] args) {
		int a =10;
		System.out.println("Local Variable : "+ a);
		
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.b);
		System.out.println(TypesOfVariables.c);
	}
}

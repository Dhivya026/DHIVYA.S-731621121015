package dhivya.com;
//Class
public class Person {
	String name;
	int age;
//Constructor
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
//Method
	void display() {
		System.out.println(name);
		System.out.println(age);
	}
//Object		
	public static void main(String[] args) {
		Person obj = new Person("Dhivya",20);
		obj.display();
		}
}
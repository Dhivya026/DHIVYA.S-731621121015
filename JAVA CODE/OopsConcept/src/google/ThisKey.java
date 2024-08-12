package google;

public class ThisKey {

	String  name ;
	ThisKey(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	ThisKey(int a, int b){
		System.out.println("Addition : " +(a+b));
	}
		void greeting() {
			System.out.println("Welcome "+ name);
		}
		public static void main(String[] args) {
			ThisKey obj = new ThisKey("Dhivya");
			
		
	}
}


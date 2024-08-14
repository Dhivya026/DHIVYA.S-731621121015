package dhivya.com;
import java.util.Scanner;
class animals{
	private String name;
	private String breed;

	
	public animals (String name, String breed){
		this.name = name;
		this.breed = breed;
		
}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getBreed() {
		return breed;
		
	}
	public void setBreed(String breed) {
		this.breed = breed ;
	}
	
}


public class Dog {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String breed = sc.next();
		
		
		animals obj = new animals(name,breed);
		
		System.out.println("Title :"+obj.getName());
		System.out.println("Author :"+obj.getBreed());
		
		
	
		
		obj.setName("Priya");
		obj.setBreed("Bulldog");
		
		
		System.out.println(" ");
		
		
		System.out.println("Updated Name :"+obj.getName());
		System.out.println("Updated Breed :"+obj.getBreed());
		
		
		System.out.println(" ");
		
		
		
	  
	}

	}
	



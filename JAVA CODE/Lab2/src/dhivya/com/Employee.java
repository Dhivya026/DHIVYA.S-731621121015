package dhivya.com;
import java.util.Scanner;
class collections{
	private String name;
	private String job;
	private String title;
	private int salary;
	
	public collections (String name, String job, String title,int salary){
		this.name = name;
		this.job = job;
		this.title = title;
		this.salary = salary;
}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name ;
	}
	
	public String getJob() {
		return job;
		
	}
	public void setJob(String job) {
		this.job = job ;
	}
	
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title ;
	}
	public void setSalary(int salary) {
		this.salary = salary ;
	}
		public int getSalary() {
			return salary;
			
		}
		
}
public class Employee {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			String job = sc.next();
			String title = sc.next();
			int salary = sc.nextInt();
			
			collections obj = new collections(name,job,title,salary);
			
			System.out.println("Name :"+obj.getName());
			System.out.println("Job :"+obj.getJob());
			System.out.println("Title : "+obj.getTitle());
			System.out.println("Salary :"+obj.getSalary());
			
			
		
			
			obj.setName("Dhivya");
			obj.setJob("Web Developer");
			obj.setTitle("Fullstack");
			obj.setSalary(5000);
			
			System.out.println(" ");
			
			
			
			System.out.println("Updated Name :"+obj.getName());
			System.out.println("Updated Job :"+obj.getJob());
			System.out.println("Updated Salary : "+obj.getSalary());
			System.out.println("Updated Title :"+obj.getTitle());
			
			
			System.out.println(" ");
			
			
			
		}

	}


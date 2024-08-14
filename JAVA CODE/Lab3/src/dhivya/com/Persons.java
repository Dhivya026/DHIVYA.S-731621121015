package dhivya.com;

class Person{
	private String  FirstName;
	private String LastName;
	public Person(String FirstName,String LastName) {
		this.FirstName=FirstName;
		this.LastName = LastName;
	}
	public String getFirstName() {
		return FirstName ;
	}
	public String getLastName() {
		return LastName;
	}
}

class Akila extends Person {
	private String employeeId;
	private String jobTitle;
	public Akila(String FirstName, String LastName, String jobTitle, String employeeId) {
		super( FirstName, LastName);
		this.jobTitle = jobTitle;
		this.employeeId = employeeId;
	}
	public String getEmployeeId(){
		return employeeId;
	}
	public String jobTitle(){
		return jobTitle;
	}
	
	@Override
	public String getLastName() {
	
		 return super.getLastName() + "("+jobTitle+")";
	}
}
public class Persons {
public static void main(String[] args) {
	 Akila employee = new Akila("Dhivya", "Saravanan", "Software Engineer", "E12345");

	 System.out.println("First Name: " + employee.getFirstName());
     System.out.println("Last Name with Job Title: " + employee.getLastName());
     System.out.println("Employee ID: " + employee.getEmployeeId());
	
}
}

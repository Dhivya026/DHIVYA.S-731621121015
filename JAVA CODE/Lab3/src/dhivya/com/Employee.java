package dhivya.com;
class Employees{
	 void work() {
		System.out.println("Employee is Working");

	}
	 void getSalary() {
		System.out.println(50000);
		

	}
}
class HRManager extends Employees{
	@Override
	void work() {
	    System.out.println("HR Manager Managing Human Resources");
		
	}
	void addEmployees(String name) {
		System.out.println("Adding Employee : "+name);

	}
}
public class Employee {
public static void main(String[] args) {
	Employees emp = new Employees();
	emp.work();
	emp.getSalary();
	
	System.out.println(" ");
	
	HRManager hr = new HRManager();
	hr.addEmployees("Dhivya");
	hr.work();
	hr.getSalary();
	
}
}

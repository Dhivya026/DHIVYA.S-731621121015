package google;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//Constructor
	Employee (int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}
	//Methods
	void display() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);
	}
}
public class ClassObject {
	public static void main (String args[]) {
		Employee emp1 = new Employee(101,"Dhivya",5000.0f);
		emp1.display();
		
		Employee emp2 = new Employee(102,"Priya",3000.0f);
		emp2.display();
		
		
	}

}



























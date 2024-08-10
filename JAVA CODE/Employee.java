import java.util.Scanner;
public class Employee{
public static void main(String args[]){
int employeeId;
String employeeName;
float employeeSalary;

Scanner sc = new Scanner(System.in);

System.out.println("Enter Employee Id");
employeeId = sc.nextInt();
System.out.println("Enter Employee Name");
employeeName = sc.next();
System.out.println("Enter employee salary");
employeeSalary = sc.nextFloat();

System.out.println("Employee id : " + employeeId);
System.out.println("Employee name : " + employeeName);
System.out.println("Employee Salary : " + employeeSalary);
}
}
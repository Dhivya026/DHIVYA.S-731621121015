package google;
import java.util.Scanner;
class Student{
	int regNo;

	String stuName;

	int Marks[]=new int[5];

	int Sum=0;

	int Avg;

	String Grade;

	

	Student(int regNo,String stuName) {

		this.regNo=regNo;

		this.stuName=stuName;

	}

	

	void getMarks() {

		Scanner sc=new Scanner(System.in);

		for(int i=0;i<5;i++) {

			Marks[i]=sc.nextInt();

		}

	}

	void calculateGrade() {

		for(int i=0;i<5;i++) {

			Sum=Sum+Marks[i];

		}

		Avg=Sum/5;

		if(Avg>90) {

			Grade="A Grade";

		}

		else if(Avg>70 && Avg <80) {

			Grade="B Grade";

		}

		else if(Avg<50) {

			Grade="Fail";

		}

		else {

			Grade="C Grade";

		}

	}

	

	void displayResult() {

		System.out.println("Name : "+stuName);

		System.out.println("Register Number : "+regNo);

		System.out.println("Sum of Marks : "+Sum);

		System.out.println("Average of Marks : "+Avg);

		System.out.println("Grade : "+ Grade);

	}

	

}

public class GradeCalculation {

	public static void main(String[] args) {

		Student obj=new Student(15,"Dhivya");

		obj.getMarks();

		obj.calculateGrade();

		obj.displayResult();

		

	}



}

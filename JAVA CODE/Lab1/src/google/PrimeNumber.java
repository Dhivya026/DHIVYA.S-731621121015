package google;
import java.util.Scanner;
public class PrimeNumber {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int count = 0,i;
	      for(i =2;i<=num/2;i++){
	      if(num % i ==0 ){
	       count++;
	     }
	  }
	 if(count == 0){
	   System.out.print(num +" is a Prime Number");
	  }
	  else{
	    System.out.print(num +" is not a Prime Number");
	    }
	}
}
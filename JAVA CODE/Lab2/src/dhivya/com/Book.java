package dhivya.com;
import java.util.Scanner;
class collection{
	private String title;
	private String author;
	private int ISBN;
	
	public collection (String title, String author, int ISBN){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
}
	public String getTitle() {
		return title;
		
	}
	public void setTitle(String title) {
		this.title = title ;
	}
	public String getAuthor() {
		return author;
		
	}
	public void setAuthor(String author) {
		this.author = author ;
	}
	
	public int getISBN() {
		return ISBN;
		
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN ;
	}
	 public void removeData() {
	        this.title = "";
	        this.author = "";
	        this.ISBN = 0;
	    }
}
public class Book {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		String author = sc.next();
		int ISBN = sc.nextInt();
		
		collection obj = new collection(title,author,ISBN);
		
		System.out.println("Title :"+obj.getTitle());
		System.out.println("Author :"+obj.getAuthor());
		System.out.println("ISBN :"+obj.getISBN());
		
	
		
		obj.setTitle("The Alchemist");
		obj.setAuthor("Paulo Coelho");
		obj.setISBN(456);
		
		System.out.println(" ");
		
		
		System.out.println("Upadted Title :"+obj.getTitle());
		System.out.println("Updated Author :"+obj.getAuthor());
		System.out.println("Updated ISBN :"+obj.getISBN());
		
		System.out.println(" ");
		
		
		obj.removeData();
	        
	    System.out.println("Cleared Title :" + obj.getTitle());
	    System.out.println("Cleared Author :" + obj.getAuthor());
	    System.out.println("Cleared ISBN :" + obj.getISBN());
	}

}

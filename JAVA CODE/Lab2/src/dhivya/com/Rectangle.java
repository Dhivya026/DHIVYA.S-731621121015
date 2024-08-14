package dhivya.com;
//Class
public class Rectangle {
	    int width;
		int height;
	//Constructor
		public Rectangle (int width, int height) {
			this.width = width;
			this.height = height;
			
		}
	//Method
		void display() {
			System.out.println("Area : " +width * height);
			System.out.println("Perimeter :" + 2 *( width + height));
		}
	//Object		
		public static void main(String[] args) {
			Rectangle obj = new Rectangle(2,4);
			obj.display();
			}
	}



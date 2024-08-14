package dhivya.com;
class Animals{
	void makeSound() {
		System.out.println("Animal Makes Sound");
	} 
}

class cat extends Animals{
    @Override
    void makeSound() {
    	System.out.println("Cat Barks");
    	super.makeSound();
    	
    }
}
    public class Animal {
    	public static void main(String[] args) {
    		Animals obj = new cat();
    		obj.makeSound();
    		
    	}

 } 
    




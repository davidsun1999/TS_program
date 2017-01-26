package basic;


/**
 * Driver.java     @author David Sun
 * Represents a driver to run triangle type program
 */
public class Driver {

	
	public Driver() {
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("This is a triangle determain program. please type the lengh of each side, end with Enter key ");
		System.out.println();
			
			
		//  generate ConsoleLoader object
		Loader	consoleLoader 	= new ConsoleLoader();
			
		//  generate triangle object use ConsoleLoader
		Shape 	triangle	= new Triangle(consoleLoader.loadDoubleArray());
			
		//  get triangle type string
		String 	type 	= triangle.getType();
			
			
		System.out.println();
			
		System.out.println("the type of this triangle is " + type);
			
		
	}

	
	
}

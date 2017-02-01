package basic;

import loader.ConsoleLoader;
import loader.Loader;
import shape.Shape;
import shape.Triangle;

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
			
		double[] sides = consoleLoader.loadDoubleArray();
		
		//  generate triangle object use ConsoleLoader
		Shape 	triangle	= new Triangle(sides);
			
		//  get triangle type string
		String 	type 	= triangle.getType();
			
			
		System.out.println();
			
		System.out.println("the type of this triangle is " + type);
			
		
	}

	
	
}

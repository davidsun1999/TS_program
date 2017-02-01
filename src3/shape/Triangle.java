package shape;


/**
 * Triangle.java     @author David Sun 
 * Represents a triangle with lengths of three sides that can determine the type
 */
public class Triangle implements Shape {

	public double[] 		sides = new double[3];
	
	public Triangle() {
	}
	
	public Triangle(double[] sides) {
		
		this.sides = sides;
	}
	
	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		this.sides = sides;
	}

	public  void doSomething(){
		
	}


	
	


	
	
}

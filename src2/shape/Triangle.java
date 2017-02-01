package shape;

/**
 * Triangle.java     @author David Sun 
 * Represents a triangle with lengths of three sides that can determine the type
 */
public class Triangle implements Shape {

	private double[]		sides 			= new double[3];
	private MathTriangle 	mathTriangle;
	
	public Triangle(double[] sides) {

		this.sides 			= sides;
		this.mathTriangle 	= new MathTriangle(sides);
		
	}
	
	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		
		this.sides = sides;
	}

	
	//=== Return the type of triangle ============
	public String getType() {
		return mathTriangle.getType();
	}
	
}

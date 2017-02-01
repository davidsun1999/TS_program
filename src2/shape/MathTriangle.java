/**
 * 
 */
package shape;

import math.IMath;
import math.MathAPI;

/**
 * MathTriangle.java    @author David
 *
 */
public class MathTriangle implements Shape {

	private double[]	sides = new double[3];
	private	MathAPI iMath;


	public MathTriangle(double[] sides) {
		this.sides = sides;
		iMath = new IMath();
	}
	
	@Override
	public String getType() {
		return iMath.getTriangleType(sides);
	}




}

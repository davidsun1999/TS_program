package basic;

/**
 * 
 */

/**
 * Triangle.java     @author David Sun 
 * Represents a triangle with lengths of three sides that can determine the type
 */
public class Triangle implements Shape {

	private double[] 		sides = new double[3];
	private	TriangleType	type;
	
	
	
	
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

	
	public void determineType()
	{
		
		if(sides==null)
		{
			return;
		}
		
		if(!isLegal())
		{
			this.type = TriangleType.ILLEGAL;
		}
		
		else if(isEquilateral())
		{
			this.type =	TriangleType.EQUILATERAL;
		}
		else if(isIsosceles())
		{
			this.type =	TriangleType.ISOSCELES;
		}
		else
		{
			this.type =	TriangleType.SCALENE;
		}
		
	}
	
	//=== Return true if the triangle is legal ======
	public boolean isLegal()
	{
		return sides[0]+sides[1]>sides[2]&&sides[1]+sides[2]>sides[0]&& sides[0]+sides[2]>sides[1];
	}
	
	//=== Return true if the triangle is equilateralTriangle  ======
	public boolean isEquilateral()
	{
		return sides[0]==sides[1] && sides[2]==sides[1];
	}
	
	
	//=== Return true if the triangle is isoscelesTriangle  ======
	public boolean isIsosceles()
	{
		return sides[0]==sides[1] || sides[2]==sides[1]|| sides[0]==sides[2];
	}
	
	
	
	
	//=== Return the type of triangle ============
	@Override
	public String getType() {
		determineType();
		
		return this.type.toString();
		
	}
	
	
	enum TriangleType
	{
		ILLEGAL, EQUILATERAL, ISOSCELES, SCALENE;	
	}


	
	
}

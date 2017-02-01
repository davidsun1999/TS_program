
package math;

/**
 * IMath.java   @author David
 *
 */
public class IMath implements MathAPI {

	
	public IMath() {
		
	}

	@Override
	public String getTriangleType(double[] sides) {
		return determineType(sides).toString();
	}
	

	public TriangleType determineType(double[] 	sides)
	{
		
		if(!isLegal(sides))
		{
			return TriangleType.ILLEGAL;
		}
		
		else if(isEquilateral(sides))
		{
			return TriangleType.EQUILATERAL;
		}
		else if(isIsosceles(sides))
		{
			return TriangleType.ISOSCELES;
		}
		else
		{
			return TriangleType.SCALENE;
		}
		
	}
	
	//=== Return true if the triangle is legal ======
	public boolean isLegal(double[] sides)
	{
		return sides[0]+sides[1]>sides[2]&&sides[1]+sides[2]>sides[0]&& sides[0]+sides[2]>sides[1];
	}
	
	//=== Return true if the triangle is equilateralTriangle  ======
	public boolean isEquilateral(double[] sides)
	{
		return sides[0]==sides[1] && sides[2]==sides[1];
	}
	
	
	//=== Return true if the triangle is isoscelesTriangle  ======
	public boolean isIsosceles(double[] sides)
	{
		return sides[0]==sides[1] || sides[2]==sides[1]|| sides[0]==sides[2];
	}
	

	enum TriangleType
	{
		ILLEGAL, EQUILATERAL, ISOSCELES, SCALENE;	
	}

}

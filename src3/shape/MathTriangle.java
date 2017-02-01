/**
 * 
 */
package shape;


/**
 * @author Susan
 *
 */
public class MathTriangle extends  TriangleDecorator {

	
	private	TriangleType	type;

	public MathTriangle(Triangle decoratedTriangle) {
		// TODO Auto-generated constructor stub
		super(decoratedTriangle);

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

	public String getType() {
		determineType();
		
		return this.type.toString();
		
	}
	
	
	enum TriangleType
	{
		ILLEGAL, EQUILATERAL, ISOSCELES, SCALENE;	
	}
	
/*
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	*/
	

}

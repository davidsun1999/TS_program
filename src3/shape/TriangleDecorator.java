/**
 * 
 */
package shape;

/**
 * @author Susan
 *
 */

public abstract class TriangleDecorator extends  Triangle {
	Triangle decoratedTriangle;


	public TriangleDecorator(Triangle decoratedTriangle) {
			// TODO Auto-generated constructor stub
		this.decoratedTriangle = decoratedTriangle;
		this.sides = decoratedTriangle.sides;
	}
		

	public void doSomething() {
			// TODO Auto-generated method stub
		decoratedTriangle.doSomething();
	}

	public abstract String getType();
		
		

}

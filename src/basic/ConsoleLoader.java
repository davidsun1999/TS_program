package basic;

import java.util.Scanner;

/**
 * ConsoleLoader.java    @author David Sun
 * Represents a console loader which can load data from console
 */
public class ConsoleLoader implements Loader {

	public ConsoleLoader() {
	}

	//=====load double array from console ===============
	@Override
	public double[] loadDoubleArray() {
		
		
		double[] sides = new double[3];
		
		for(int i=0; i<sides.length; i++)
		{
			try
			{
				System.out.print("the lengh of side " + (i+1)+": ");
				
				double input = extracted().nextDouble();
				
				if(input<=0)
				{
					System.out.println("The input should be positive value");
					i--;
				}
				else
				{
					sides[i] =input;
					
				}
				 
				
			}
			
			//  catch the exception which get from error input
			catch (Exception e)
			{
				System.out.println("This is incorrect input. please try again");
				i--;
			}
		}
		return sides;
	}
	
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	

}

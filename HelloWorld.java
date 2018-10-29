

import java.util.Scanner; 
public class HelloWorld {
	
	public static void main (String[] args) {
		//Prints "Hello World" to the Console
		System.out.println("Hello World")  ;
		//Making a Scanner for user input (Finding the area of a Trapezoid) 
		Scanner Read = new Scanner(System.in);
		//Declaring Variables
		double SmallBase;
		double BigBase;
		double Height;
		//Declaring measurement of Small Base.
		System.out.print("Enter the length of the trapezoids smallest base: ");
		SmallBase = Read.nextDouble();
		//Declaring measurement of Largest Base
		System.out.print("Enter the length of the trapezoids largest base： ");
		BigBase = Read.nextDouble();
		//Declaring Height
		System.out.print("Enter the length Trapezoids height： ");
		Height = Read.nextDouble();
		//Begin Calculations
		double Sumofbases = BigBase + SmallBase;
		double draftarea = Sumofbases / 2;
		double Area = draftarea * Height;
		//Print Final Value
		System.out.println("The area of the Trapezoid is " + Area);
	}

}

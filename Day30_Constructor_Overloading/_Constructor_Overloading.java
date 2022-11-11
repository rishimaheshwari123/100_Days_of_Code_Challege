/*
Question ->
   A constructor that has parameters is known as parameterized constructor. 
   If we want to initialize fields of the class with our own values, 
  then use a parameterized constructor.
    
    */

Solution ->
  
  
import java.io.*;

class overloading
{
	overloading(String name)
	{
		System.out.println("Constructor with one " +
					"argument - String : " + name);
	}

	// constructor with two arguments
	overloading(String name, int age)
	{

		System.out.println("Constructor with two arguments : " +
				" String and Integer : " + name + " "+ age);

	}

	// Constructor with one argument but with different
	// type than previous..
	overloading(long id)
	{
		System.out.println("Constructor with one argument : " +
											"Long : " + id);
	}
}


public class constructorOverloading{
	public static void main(String[] args)
	{
		// Creating the objects of the class named 'Geek'
		// by passing different arguments

		// Invoke the constructor with one argument of
		// type 'String'.
		overloading g2 = new overloading("Shikhar");

		// Invoke the constructor with two arguments
		overloading g3 = new overloading("Dharmesh", 26);

		// Invoke the constructor with one argument of
		// type 'Long'.
		overloading g4 = new overloading(325614567);
	}

}

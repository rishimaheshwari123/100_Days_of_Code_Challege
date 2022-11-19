/*
Question ->
  
 The word polymorphism means having many forms.
 In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. 

 Real-life Illustration: Polymorphism

 A person at the same time can have different characteristics.
 Like a man at the same time is a father, a husband, an employee.
 So the same person possesses different behavior in different situations.
 This is called polymorphism. 
 Polymorphism is considered one of the important features of Object-Oriented Programming. 
 Polymorphism allows us to perform a single action in different ways.
 In other words, polymorphism allows you to define one interface and have multiple implementations.
 The word “poly” means many and “morphs” means forms, So it means many forms.
   
In Java polymorphism is mainly divided into two types: 

Compile-time Polymorphism
Runtime Polymorphism

*/

Solution ->
  class Helper {

	static int Multiply(int a, int b)
	{
		return a * b;
	}

	
	static double Multiply(double a, double b)
	{

		return a * b;
	}
}

public class Polymorphism {
    public static void main(String[] args) {

		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}

    


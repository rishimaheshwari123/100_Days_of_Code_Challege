/*
  Question ->
  
  Java constructors or constructors in Java is a terminology been used to construct something in our programs. 
  A constructor in Java is a special method that is used to initialize objects.
  The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. 

 In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created.
 At the time of calling the constructor, memory for the object is allocated in the memory.
 It is a special type of method which is used to initialize the object. 
 Every time an object is created using the new() keyword, at least one constructor is called.
  
  
  */
  
  
  
 Solution ->
  
import java.io.*;

class constructor {

	String name;
	int id;

	constructor(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

public class constructors{
public static void main(String[] args) {
    constructor c = new constructor("adam", 1);
    System.out.println("Name Is : " + c.name + " and Id : " + c.id);

}
}

/*
Question ->
  
  If you don't use any modifier, it is treated as default by default. 
  The default modifier is accessible only within package.
  It cannot be accessed from outside the package. It provides more accessibility than private.
  But, it is more restrictive than protected, and public
  
  Example of default access modifier
  
  In this example, we have created two packages pack and mypack.
  We are accessing the A class from outside its package, since A class is not public,
  so it cannot be accessed from outside the package.
   
   */
    
  Solution - > 

    package pack;

    public class Moderiers {
   
      protected void msg(){

        System.out.println("Hello");
        
    }  
}

//save by Moderiers.java 

package mypack;  
import pack.*; 

class Default{  
  public static void main(String args[]){
    
    Default obj = new Default();//Compile Time Error  
    
    obj.msg();//Compile Time Error  

  }  
  
}  

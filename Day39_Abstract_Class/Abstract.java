/*
Question ->
  
In object oriented programming, abstraction is defined as hiding the unnecessary details (implementation) ,
from the user and to focus on essential details (functionality).
It increases the efficiency and thus reduces complexity.

In Java, abstraction can be achieved using abstract classes
and methods. In this tutorial, we will learn about abstract methods and its use in Java.
  
A class is declared abstract using the abstract keyword. It can have zero or more abstract and non-abstract methods.
We need to extend the abstract class and implement its methods. It cannot be instantiated.
  
  */
  
Solution ->
    
abstract class Parent{
    Parent(){
        System.out.println("I am a Parent class constructor");
    }
    public void sayHello(){
        System.out.println("hello Rishi");
    }
    abstract public void greed();
    abstract public void greed2();
}


class Child extends Parent{
    @Override
    public void greed(){
        System.out.println("hello gandu goodmorning");
    }
    @Override
    public void greed2(){
        System.out.println("hello golu goodmorning");
    }
}

 abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am a good boy");
    }
}
public class tut_53_Abstract {
    public static void main(String[] args) {
        
    // Parent p = new Parent(); // You can not do this becouse this class is a abstract class 
    Child c = new Child();

    }
}

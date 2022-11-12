/*

Question ->
Inheritance is an important pillar of OOP(Object-Oriented Programming). 
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.
In Java, inheritance means creating new classes based on existing ones.
A class that inherits from another class can reuse the methods and fields of that class. 
In addition, you can add new fields and methods to your current class as well

Important terminologies used in Inheritance: 

1. Class: 
  Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. 
  Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.

2. Super Class/Parent Class: 
   The class whose features are inherited is known as a superclass(or a base class or a parent class).

3. Sub Class/Child Class:
   The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). 
   The subclass can add its own fields and methods in addition to the superclass fields and methods.
   
 4. Reusability: 
      Inheritance supports the concept of “reusability”, i.e. 
      when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. 
      By doing this, we are reusing the fields and methods of the existing class.
      
  */
  
  Solution -> 
  
class Base{
    int x;
    public void setX(int a){
        System.out.println("I am in base clsss");
        x = a;
    }
    public void getX(){
        System.out.println(x);
    }
    public void printMe(){
        System.out.println("I am drive class");
    }
}
class Derived extends Base{
    int y;
    public void setY(int b){
        y  = b;
    }
    public void getY(){
        System.out.println(y);
    }
}

public class tut_45_Enharitance {
    public static void main(String[] args) {
        
        Derived b = new Derived();
        b.setX(4);
        b.getX();
        
        b.setY(5);
        b.getY();
    }
}

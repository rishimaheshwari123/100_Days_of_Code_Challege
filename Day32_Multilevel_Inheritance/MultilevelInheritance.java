/*

Question ->
  In Multilevel Inheritance, a derived class will be inheriting a base class, 
  and as well as the derived class also acts as the base class for other classes.
  In the below image, class A serves as a base class for the derived class B,
  which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.
  
 */ 
  
Solution ->
class Base{
    public void show1(){
        System.out.println("I am Base class");
    }
}
class Derived extends Base{
    public void show2(){
        System.out.println("I am Driver class");
    }
}
class AnotherDriveClass extends Derived{
    public void show3(){
        System.out.println("I am  also Driver class");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        AnotherDriveClass a =  new AnotherDriveClass();
        a.show1();
        a.show2();
        a.show3();
    }
}

/*
Question -> 
   An interface in Java is a blueprint of a class. It has static constants and abstract methods.

  The interface in Java is a mechanism to achieve abstraction
. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
  
  In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
  
  It cannot be instantiated just like the abstract class.

  Since Java 8, we can have default and static methods in an interface.

  Since Java 9, we can have private methods in an interface.
    
 */
    
Solution ->
  
  
interface Bicycle{
    int a =45;
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}

interface HornBicycle{
    public void blowHorn();
    public void hornPlease();
}

class AvoneCycle implements Bicycle,HornBicycle{
    public void applyBreak(int decrement){
        System.out.println("Break fale ");
    }
    public void speedUp(int increment){
        System.out.println("Speed is 180 km/hour");
    }
    public void blowHorn(){
        System.out.println("Tunu nu nu nu tunu nu nu ");
    }
    public void hornPlease(){
        System.out.println("EK bar aja aja aja ");
    }


}

public class interfaceCode {
    public static void main(String[] args) {
        AvoneCycle ab = new AvoneCycle();
        ab.applyBreak(1);
        // You can create properties in interfaces 
        System.out.println(ab.a);
        // You can not modify the properties of interfaces becouse they are final
        // ab.a = 595;

        ab.blowHorn();
        ab.hornPlease();

    }
}

    

/*
Question ->
  
  What is a class in Java
   A class is a group of objects which have common properties. 
  It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
  
  Create a simple calculator which can perform basic arithmetic operations like addition, 
  subtraction, multiplication or division depending upon the user input.
    
  Time Complexity: O(1)
  Auxiliary Space: O(1)
  
    */
    
Solution ->
  import java.util.concurrent.Callable;

class Claculater{
    int a;
    int b;
    public int sum(int a ,int b){
        return a+b;
    }
    public int sub(int a ,int b){
        return a-b;
    }
    public int mul(int a ,int b){
        return a*b;
    }
    public int devide(int a ,int b){
        return a/b;
    }
}
public class classInJava{
    public static void main(String[] args) {
        Claculater c  = new Claculater();
        System.out.println("The value of a+b is : "+c.sum(10,5));
        System.out.println("The value of a-b is : "+c.sub(10,5));
        System.out.println("The value of a*b is : "+c.mul(10,5));
        System.out.println("The value of a/b is : "+c.devide(10,5));
            
      
    }
}

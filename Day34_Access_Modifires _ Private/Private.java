/*
Question -> 
  The private access modifier is accessible only within the class.
    
  Simple example of private access modifier
  
  In this example, we have created two classes A and Simple.
  A class contains private data member and private method. 
  We are accessing these private members from outside the class, so there is a compile-time error.
    
    */
Solution -> 
    
    class A{  
    private int data=40;  
    public void msg(){
        System.out.println("Hello java"+data);
    }  
    }  
      
    public class PrivateAccessModifire {

     public static void main(String args[]){  
       A obj=new A();  

      //    System.out.println(obj.data);   Compile Time Error  
     //  obj.msg();Compile Time Error  

     obj.msg();
       }  
    }

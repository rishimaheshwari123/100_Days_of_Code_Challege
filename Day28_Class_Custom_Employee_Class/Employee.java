/*
Question ->
  
  In this question we are creating our custom employee class 
  In this class we have two methods first one is printDetails it will print id and name of a employee
  and the second method is print salary of employee
    
    */
    
Solution->
    
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("Your id is -> "+ id);
        System.out.println("Your name is ->  "+ name);
    }
    public void getSalary(){
       System.out.println("Your salary is  -> "+salary);
    }
}

public class tut_38_customClass{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Rishi = new Employee();// Instantiating a new Employee Object
        Employee jon = new Employee();// Instantiating a new Employee Object

        //Setting Attributes for Rishi
        Rishi.id = 1;
        Rishi.name = "Rishi Maheshwari";
        Rishi.salary = 546656;

        
        //Setting Attributes for john
        jon.id = 6;
        jon.name= "Jon";
        jon.salary = 36651656;

        // Printing the  Attributes
        // System.out.println(Rishi.id);
        // System.out.println(Rishi.name);
        Rishi.printDetails();
        Rishi.getSalary();
        jon.printDetails();
        jon.getSalary();

        
    }
}   

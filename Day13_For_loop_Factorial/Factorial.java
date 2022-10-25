/*
Question ->
          Find the factorial of n number ,n is denoted by n!.
           n! = 5!;
           5!= 5*4*3*2*1


Logic -> 
        In this challenge we print the factorial of a  number n.
        Simply we run a for loop i=1 to i<=n and i++.
        first we chack the condition if i<=n then multiply the value of i in factorial and store in factorial.
        And outside of this loop we print the value of factorial.


*/
             
Solution ->
  
  import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int Factorial = 1;
       System.out.println("Enter the value of n ");
       int n =  sc.nextInt();
       for(int i=1; i<=n; i++){
        Factorial*=i;
       }  
       System.out.println("The factorial of "+n+"! is "+ Factorial );
    }
}

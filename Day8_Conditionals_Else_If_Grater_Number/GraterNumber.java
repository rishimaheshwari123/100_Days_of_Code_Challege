 /*Topic : Conditional if else
   
 In this challenge we chack which is grater number
 
 Task 
  
 We have three variable a, b and c .
   
 We compair all the variable and return  element which is grater element .
 
 Compair  three element :-
                          (a > b && a > c)
                          return a;

                          (b > a && b > c)
                          return b;

                         (c > a && c > b)
                          return c;

*/
import java.util.Scanner;
import java.util.Scanner;
public class GraterNumber{
    public static void main(String[] args) {
       Scanner sc  = new  Scanner(System.in); 
       System.out.println("Enter your first number ");
       int a = sc.nextInt();

       System.out.println("Enter your second number ");
       int b = sc.nextInt();

       System.out.println("Enter your third number ");
        int c = sc.nextInt();

        if(a>b && a>c ){
            System.out.println("The gratest number between ( a ,b ,c ) is a =  "+ a);
        }
        else if (b>a && b>c){
            System.out.println("The gratest number between ( a ,b ,c ) is b = "+ b);
       }
        else if (c>a && c>b){
            System.out.println("The gratest number between ( a ,b ,c ) c = "+ c);
       }
       else{
        System.out.println("Please enter valid number ");
       }


    }
}

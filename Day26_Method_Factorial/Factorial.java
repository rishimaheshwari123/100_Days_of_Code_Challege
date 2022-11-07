/*
Question ->
   Factorial Program using recursion
   in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:

   4! = 4*3*2*1 = 24  
   5! = 5*4*3*2*1 = 120
   
   Time Complexity: O(n)
   Auxiliary Space: O(n)
   */

Solution ->
  
import java.util.Scanner;

public class factorial {
    public static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+"! is  = "+fac(n));
    }
}

  

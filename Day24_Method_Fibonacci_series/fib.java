/*
Question ->
          In this challenge we are doing Fibonacci series ,
          a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. The simplest is the series 1, 1, 2, 3, 5, 8
          
           Input: N = 10 
           Output: 0 1 1 2 3 5 8 13 21 34 
           Here first term of Fibonacci is 0 and second is 1, so that 3rd term = first(o) + second(1) etc and so on.
             
           Time Complexity: O(N) 
           Auxiliary Space: O(1)
           
  */         
             
 Solution ->
   
   public class fib {

    public static void fibonacci(int N){
        int number1 = 0, number2 = 1;
        int count  = 0;
        while(count < N){

            System.out.print(number1 + " ");

            int number3 =  number1 + number2;
            number1 =  number2;
            number2 = number3;

            count++;
        }
    }
    public static void main(String[] args) {
        int N = 10;
        fibonacci(N);
    }
}

/*
Question ->
  
  In this question  we are doing fibonacci series, fibonacci series isnext number is the sum of previous two numbers.
  example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
  The first two numbers of fibonacci series are 0 and 1.

  We implement the fibonacci series without recursion .
  
  Explanation ->
                First we take three integer variable n1, n2,n3. And initialize the value of n1 = 0, n2=1.
                We take one more variable count = 10  mean we want to print 10 time.
                first we print the value of n1, n2.
                Now we run a loop i=2 to i<count and ++i.
                The we add n1 and n2 and store the value in n3,and print n3.
                Then the n1 become n2 and n2 become n3.
                
  
  */
  
  Solution->
  
  public class fibonacci {
    public static void main(String args[]) {

        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; ++i){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}

  
  
 
 

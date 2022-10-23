Question->
  In this question we create a diamond Pattern like this
                
                *
               ***
              *****
             *******
              *****
               ***
                *
                
  Logic -> 
          First we initialize the value of n is 4, and we run a for loor i=1 to i<=n.
          And we run another for loop for print spaces it will run j=1 to j<=n-i.
          Then we print our stars so we again run a loop to j=1 and j<=2*i-1 in the loop we print our stars.
          Then outside of the loops we print next line.
            
            
            
 Solution->
            
            import java.nio.ShortBuffer;
            import java.rmi.StubNotFoundException;

            public class AdvancedPatterns_6 {
            public static void main(String[] args) {
               int n =4;
            //  uper half
            for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
             }
            for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
            }
            System.out.println();
            }
            // lowar half
            for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
             }
            for(int j=1; j<=2*i-1; j++){
            System.out.print("*");
            }
            System.out.println();
         }
       }
      }
            

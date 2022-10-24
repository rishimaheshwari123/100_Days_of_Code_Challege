Question ->
          In this question we create a number of Pyramid  Like this
                        1
                       2 2
                      3 3 3 
                     4 4 4 4
                    5 5 5 5 5


Logic->
        First we run a loop i=0 to i<=n and in this loop we run another loop,
        j=1 to j<=n-i and in this inner loop we simply print spaces.
        Out side of this loop we run another for loop j=1 to j<=i; in this loop we 
        print the value of i and out side of the loop we simple give a new line

Solution->
 
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
    }
}

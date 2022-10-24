Question -> In this question we print a palindromic pattern like this 
                                1
                              2 1 2
                            3 2 1 2 3
                          4 3 2 1 2 3 4 
                        5 4 3 2 1 2 3 4 5
  
  

  
  logic -> 
  
  For solve this question we use 4 for loops.
  First loop we start i=1 to i<=n and in this loop we have a another loop it will start to j=1 to j<=n-i.
  In this loop we print spaces.
  Out side of this loop but inside of first loop we have a another loop it will start up to j=1 to j>=1 and j--
  In this loop we print the value of j.
  Out side of loop but inside of first loop we have a another loop it will start j=2 to j<=1 and j++.
  In this loop we print the value of j and out side of this loop we give a new line




Solution ->
  
  public class PalindromicPattern {
    public static void main(String[] args) {
        int n= 5;
        
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

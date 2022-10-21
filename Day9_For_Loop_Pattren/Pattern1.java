/*Question ->
  
In this challenge we are drow a patern Patern is like this
  
*
**
***
****

Explain ->  We use to for loops first loops start with 1 and go up to 4,
             and the second loop start with 1 and go up to i.
             After the value of i  we give a new line .
  */
              
Solution->
  
  public class Patterns_5_ {
  public static void main(String[] args) {
    for(int i=1; i<=4; i++){
    for(int j=1; j<=i; j++){
      System.out.print("*");
    }
    System.out.println(); 
  }
  }
  }
    
               

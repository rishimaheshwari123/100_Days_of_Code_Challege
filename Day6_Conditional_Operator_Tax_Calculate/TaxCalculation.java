Write a Java program that calculates and shows the sum of all even integers from 0 to n, 
where n is specified by the user via keyboard. Assume that n is an integer greater than 0.
Income (G.)                Tax Rate (%)
1-100,000                       0 
100,001-500,000                10 
500,001-1,000,000              20 
1,000,001-4,000,000            30
above 4,000,000                37
According to the table, if a person’s income is 550,000 G., there is no tax for the first 100,000 G.
10% of the income in the range 100,001-500,000 are taxed, which equals 40,000 G.
The last50,000 G. is taxed with the rate of 20% resulting 10,000 G. Therefore, the total tax for this person is 60,000 G. 

 Write a method called tax() which returns the amount of tax associated with the income supplied
 as the only input to the method. Assume that there are no decimal points in any incomes.
  
  
  
 SOLUTION->
  
  
import java.util.Scanner;

public class incomText {
    public static void main(String[] args) {
        System.out.println("Enter your income laks");
        Scanner sc = new Scanner(System.in);
        double tax =0;
        double income = sc.nextDouble();
        if(income > 100001 && income <500000){
             
            System.out.println("You need to pay total text is - "+income*0.1);
        }
        else if(income >500001 && income <1000000){
          
            System.out.println( "You need to pay total text is - "+  income*0.2);
        }
        else if(tax >1000001 && tax <4000000){
            
            System.out.println("You need to pay total text is - "+ income*0.3);
        }
        else if(income>4000000){
            
            System.out.println("You need to pay total text is - "+income*0.37);
        }
        else{
            System.out.println("You need to pay total text is - "+income);
        }

       
    }  
}

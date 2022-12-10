/*
Question 

The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
The ArrayList class maintains the insertion order and is non-synchronized.
The elements stored in the ArrayList class can be randomly accessed.
*/

Solution -> 
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(1);  
      list.add(2);  
      list.add(6);  

      list.add(2,55);
      list.remove(2);
      ArrayList<Integer> list2 = new ArrayList<>(); list.add(1);  
      list2.add(22);  
      list2.add(66);
      list2.addAll(list);

      Iterator itr = list2.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }   
}

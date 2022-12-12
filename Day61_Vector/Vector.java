/*
Question -> 
  Vector uses a dynamic array to store the data elements.
  It is similar to ArrayList. However, 
  It is synchronized and contains many methods that are not the part of Collection framework.
    
   */

Solution -> 
  
import java.util.*;

public class vectorEx {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Rishi");
        v.add("Ayush");
        v.add("Kundan");
        v.add("Ajay");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*
Question -> 
  
  HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. 
  Hashing is used to store the elements in the HashSet. It contains unique items.
  */

Solution -> 
  
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]) {

        HashSet<String> set = new HashSet<String>();
        set.add("Rishi");
        set.add("Ayush");
        set.add("Kundan");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

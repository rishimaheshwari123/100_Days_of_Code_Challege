/*
Question -> 
  LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. 
  It can store the duplicate elements. It maintains the insertion order and is not synchronized.
  In LinkedList, the manipulation is fast because no shifting is required.
  
 */

Solution -> 
 
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list  = new LinkedList<>();
        list.add("Rishi");
        list.add("Kundan");
        list.add("Ayush");
        list.add("Ajay");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"-> ");
        }
        System.out.println("");
    }
}

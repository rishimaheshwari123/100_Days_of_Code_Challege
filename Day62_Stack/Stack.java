/*
Question -> 
  The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
  The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
  boolean peek(), boolean push(object o), which defines its properties.
    
    */

import java.util.Iterator;
import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(52);
        s.push(85);
        s.push(36);
        s.pop();

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

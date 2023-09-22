package Assignments.Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedListInReverse 
{
	 public static void main(String[] args) 
	 {
	    LinkedList<String> names = new LinkedList<>();
	    names.add("Abhi");
	    names.add("Shivam");
	    names.add("Sahil");

	    System.out.println("using Iterator: ");
	    Iterator<String> itr = names.descendingIterator();
	    while (itr.hasNext()) 
	    {
	       String name = itr.next();
	       System.out.println(name);
	    }
	    
	    System.out.println();
	    System.out.println("using For Loop: ");
	    for (int i = names.size() - 1; i >= 0; i--) 
	    {
	       String name = names.get(i);
	       System.out.println(name);
	    }
	    
	 }
}

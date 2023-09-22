package Assignments.Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateThroughLinkedList 
{
   public static void main(String[] args) 
   {
	   LinkedList<String> list = new LinkedList<>();
       list.add("Anish");
       list.add("Ravi");
       list.add("Ganesh");
       
       System.out.println("Using Iterator: ");
       Iterator<String> itr = list.iterator();
       while (itr.hasNext()) 
       {
           String str = itr.next();
           System.out.println(str);
       }
       System.out.println();
        System.out.println("Using for each Loop: ");
       for (String name : list) 
       {
           System.out.println(name);
       }
   }
}

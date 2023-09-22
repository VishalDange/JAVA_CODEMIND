package Assignment_CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashset 
{
	public static void main(String[] args) 
	{
        Set<String> hs=new HashSet<>();
        hs.add("Anish");
        hs.add("Abhi");
        hs.add("Chaitanya");
        hs.add("Chaitanya");

        
        System.out.println("Using Iterator\n");
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        System.out.println();
        System.out.println("Using For Each Loop:\n");
        System.out.println("Using for each loop:");
        for(String val:hs)
        {
        	System.out.println(val);
        }
	}

}

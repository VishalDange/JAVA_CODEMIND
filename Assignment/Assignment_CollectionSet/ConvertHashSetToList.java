package Assignment_CollectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertHashSetToList 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
	    set.add(10);
	    set.add(20);
	    set.add(30);

	    ArrayList<Integer> list = new ArrayList<>(set);

	    System.out.println(list);
	}

}

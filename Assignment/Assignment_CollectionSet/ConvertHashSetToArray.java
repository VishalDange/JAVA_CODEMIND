package Assignment_CollectionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertHashSetToArray 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
	    set.add(1);
	    set.add(7);
	    set.add(10);

	    Integer[] array = set.toArray(new Integer[0]);
	    
	    System.out.println(Arrays.toString(array));
	}

}

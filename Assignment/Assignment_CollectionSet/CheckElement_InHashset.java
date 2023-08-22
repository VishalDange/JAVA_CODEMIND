package Assignment_CollectionSet;

import java.util.HashSet;
import java.util.Set;

public class CheckElement_InHashset 
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);

		boolean present = set.contains(2);
		System.out.println(present);

	}
}

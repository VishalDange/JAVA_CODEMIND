package Assignment_CollectionSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NoLessThanGivenNumberinTreeSet 
{
  public static void main(String[] args) 
  {
	    Set<Integer> set = new TreeSet<>();
	    set.add(1);
	    set.add(2);
	    set.add(3);
	    set.add(4);
	    set.add(5);
	    set.add(6);
	    set.add(7);
	    set.add(8);
	    set.add(9);

	    List<Integer> list = new ArrayList<>();

	    for (Integer num : set) 
	    {
	      if (num < 7) {
	        list.add(num);
	      }
	    }

	    System.out.println(list);
  }
}

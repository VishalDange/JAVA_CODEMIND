package Assignments.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class SortGivenArrayList 
{
	 public static void main(String[] args) 
	 {
		 
	     ArrayList<Integer> list = new ArrayList<>();
	     list.add(9);
	     list.add(5);
	     list.add(3);
	     list.add(6);
	     list.add(4);
	     list.add(8);
	     list.add(1);
	     list.add(2);
	     list.add(7);

	     Collections.sort(list);

	     System.out.println(list);
	 }
}

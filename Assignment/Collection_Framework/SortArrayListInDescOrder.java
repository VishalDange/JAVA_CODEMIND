package Assignments.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListInDescOrder 
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

		list.sort(Collections.reverseOrder());

		System.out.println(list);
	}
}

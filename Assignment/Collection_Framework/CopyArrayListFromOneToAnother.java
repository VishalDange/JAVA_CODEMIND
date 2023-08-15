package Assignments.Collection_Framework;

import java.util.ArrayList;

public class CopyArrayListFromOneToAnother 
{
	public static void main(String[] args) 
	{
	    ArrayList<String> source = new ArrayList<>();
	    source.add("Anish");
	    source.add("Rohit");
	    source.add("Abhi");
	    source.add("Shivam");
	    source.add("Sahil");
	    source.add("Omkar");

	    ArrayList<String> list = new ArrayList<>();

	    for (String item : source) 
	    {
	        list.add(item);
	    }

	    System.out.println(list);
	}
}


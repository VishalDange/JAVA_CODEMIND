package Assignments;

public class reverseString 
{
	public static void main(String[] args) {
		String str="MyJava";
	    char [] arr=new char[str.length()];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=str.charAt(i);
	    }
	   
	    	int start=0;
	    	int end=arr.length-1;
	    	while(start<end)
	    	{
	    		char temp=arr[start];
	    		arr[start]=arr[end];
	    		arr[end]=temp;
	    	}
	      System.out.println(arr);
	}

}

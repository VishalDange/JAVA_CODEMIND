

public class SecondLargestInArray 
{
	 public static void main(String[] args) {


	        int[] arr = {25,10,35,15,45};

	        int largest = Integer.MIN_VALUE;
	        int secondLarge = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLarge = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLarge) {
	                secondLarge = arr[i];
	            }
	        }

	        System.out.println("Second largest number in the array is: " + secondLarge);
	    }
}

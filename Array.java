

public class Array {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        System.out.println("Given Array: ");
	        for(int i=0;i<array.length;i++)
	        {
	            System.out.print(array[i]+" ");

	        }
	        System.out.println();
	        System.out.println("Alternate Array: ");
	        for (int i = 0; i < array.length; i += 2) {
	            System.out.println(array[i]+" ");
	        }
	        
            System.out.println("Total Numbers In an Array Is: "+array.length);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
	    
	    
	    int[] array2 = {34,54,67,82,45};
	    System.out.println("Given Array: ");
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+" ");

        }
        System.out.println();

        int smallNumber = array2[0];

        for (int i = 1; i <array2.length; i++) {
            if (array2[i] < smallNumber) {
                smallNumber = array2[i];
            }
        }
        System.out.println("The smallest number in the array is: " + smallNumber);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int largeNumber = array2[0];
        System.out.println("Given Array: ");
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+" ");

        }
        System.out.println();
        
       for (int i = 1; i < array2.length; i++) {
            if (array2[i] > largeNumber) {
                 largeNumber = array2[i];
            }
        }
        System.out.println("The Largest number in the array is: " + largeNumber);
        
        
    }
	
}

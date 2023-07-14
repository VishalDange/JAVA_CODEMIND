import java.util.Scanner;

public class Frequency 
{
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter elements in an array: ");
	        int[] arr = new int[10];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("Enter number to find the frequency : ");
	        int number = scanner.nextInt();

	        int frequency = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == number) {
	                frequency++;
	            }
	        }

	        System.out.println("The frequency of " + number + " is " + frequency);
	    }

}

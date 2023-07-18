import java.util.Scanner;
public class EvenOdd 
{
	  public static void main(String[] args) 
	  {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int[] numbers = new int[n];

	        System.out.println("Enter the elements: ");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        int sumOfEvenNumbers = 0;
	        int sumOfOddNumbers = 0;

	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                sumOfEvenNumbers += number;
	            } else {
	                sumOfOddNumbers += number;
	            }
	        }

	        System.out.println("The sum of even numbers is: " + sumOfEvenNumbers);
	        System.out.println("The sum of odd numbers is: " + sumOfOddNumbers);
	    }}

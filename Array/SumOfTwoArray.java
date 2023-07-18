import java.util.Scanner;
public class SumOfTwoArray 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] sumArray = new int[n];

        for (int i = 0; i < n; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("The sum of the two arrays is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }

}

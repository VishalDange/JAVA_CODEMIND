import java.util.Scanner;
class scannerClass{

	void add()
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("Addition is: " + result);
	}
	void sub()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number ");
		float num1 = sc.nextFloat();
		System.out.println("Enter Second number ");
		float num2 = sc.nextFloat();
		float result = num1 - num2;
		System.out.println("Substarction is: " + result);
	}
	void multiply()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number ");
		int num2 = sc.nextInt();
		int result = num1 * num2;
		System.out.println("Multiplication is: " + result);
	}

	void div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number ");
		int num2 = sc.nextInt();
		int result = num1 / num2;
		System.out.println("Division is: " + result);
	}


	public static void main(String args[])
	{
		scannerClass obj = new scannerClass();
		
		obj.add();
		System.out.println();
		obj.sub();
		System.out.println();
		obj.multiply();
		System.out.println();
		obj.div();

		
	}
}

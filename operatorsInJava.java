public class operatorsInJava
{
    public static void main(String[] args) 
    {

        int a = 20;
        int b = 6;
        int c = 10;
        // Arithmetic operators
        System.out.println("Arithmetic operators: ");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // Using uniary operators
        System.out.println("Uniary operators: ");

        System.out.println("Post increment : " + (a++));
        System.out.println("Post decrement : " + (b--));
        System.out.println("Pre increment : " + (++a));
        System.out.println("Pre decrement : " + (--b));

        // Comparison operators
        System.out.println("Comparison operators: ");

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a != c: " + (a != c));

        boolean x = true;
        boolean y = false;
       
        // Logical operators
        System.out.println("Logical operators: ");
        System.out.println("x && y: " + (x && y));
        System.out.println("!x: " + (!x));
        System.out.println("x || y: " + (x || y));
        
        int d = 0b1010;
        int e = 0b1100;

        // Bitwise operators

        System.out.println("Bitwise operators: ");
        System.out.println("e >>> 1: " + (e >>> 1));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
    }
}
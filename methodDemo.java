public class methodDemo {

  public int addNumber(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  public int subNumber(int num1, int num2) {
    int sub = num1 - num2;
    return sub;
  }

  public int mulNumber(int num1, int num2) {
    int mul = num1 * num2;
    return mul;
  }

  public int divNumber(int num1, int num2) {
    int div = num1 / num2;
    return div;
  }

  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 3;
    methodDemo md = new methodDemo();

    int result = md.addNumber(num1, num2);
    int result1 = md.subNumber(num1, num2);
    int result2 = md.mulNumber(num1, num2);
    int result3 = md.divNumber(num1, num2);

    System.out.println("Addition is : " + result);
    System.out.println("Division is : " + result1);
    System.out.println("Multiplication is : " + result2);
    System.out.println("Division is : " + result3);
  }
}

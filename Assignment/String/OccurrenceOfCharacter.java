// package Assignments;

public class OccurrenceOfCharacter 
{ 
  public static void main(String[] args) 
  {
    String str = "Java J2EE Java JSP J2EE";
    int[] countarr = new int[256];
    
    for (int i = 0; i < str.length(); i++) 
    {
        countarr[str.charAt(i)]++;
    }

    for (int i = 0; i < countarr.length; i++) 
    {
        if (countarr[i] > 0) {
            System.out.println((char) i + ": " + countarr[i]);
        }
    }
}
}

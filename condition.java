public class condition
{
    public static void main(String [] args)
    {
    	
          System.out.println("IF-ELSE: ");
    	  int a = 10;       
          if (a % 2 == 0)     
          {           
              System.out.println(a + " is an even number");       
          }       
          else     
          {           
              System.out.println(a + " is an odd number");         
          }   
          
          
          //SWITCH CASE
          System.out.println();

          System.out.println("SWITCH CASE: ");
          int month = 2;
          switch (month) 
          {
          case 1:
            System.out.println("January");
            break;
            
          case 2:
            System.out.println("February");
            break;
            
          case 3:
            System.out.println("March");
            break;
            
          case 4:
            System.out.println("April");
            break;
            
          case 5:
            System.out.println("May");
            break;
            
          case 6:
            System.out.println("June");
            break;
            
          default:
            System.out.println("Enter valid Number...");
            
            System.out.println();
          } 
          
          
          System.out.println();

          System.out.println("LOOPS: ");
            System.out.println("FOR LOOP: ");
            for(int i=1;i<=5;i++)
            {
            	System.out.println(i);
            }
            System.out.println();

            System.out.println("WHILE LOOP: ");
            int i=1;
            while(i<=5)
            {
            	System.out.println(i);
            	i++;
            }
            
            System.out.println("DO-WHILE LOOP: ");
            int j=2;
            do
            {
                System.out.println(j);
                j++;
	
            }while(j<=5);
            
    }

}


import java.util.Scanner;
class factorialNo
 {
   public static void main(String args[])
    {
      int act =1;
      System.out.println("enter any no for factorial: ");
      
      Scanner he = new Scanner(System.in);
      int fact = he.nextInt();    
        
          for(int i=1;i<=fact;i++)
           {
            act = act *i; 
           }
             System.out.println("factorial of "+fact+": "+act);
    }


 }
import java.util.Scanner;
class pattern
{

  public static void main(String args[])
    {
       Scanner he = new Scanner(System.in);
       System.out.println("Enter No for pattern");  
       int ma = he.nextInt();
      for(int i=ma;i>=1;i--)
       {
         for(int j=1;j<=i;j++)
           {
              System.out.print('*');
            }
              System.out.println("");
       } 


    }
}
import java.util.Scanner;
class oddnoSum
{

   public static void main(String args[])
   {
      Scanner he = new Scanner(System.in);
      System.out.println("Enter the number for sum of oddno") ;
      int A = he.nextInt();
      int sum=0;
      for(int i=1;i<=A;i++)
      {
          if(i%2 == 1)
          {
              sum += i;
          }    
      }
      System.out.println("the sum of all odd no upto " + A + " is:" +sum);
   }

}
import java.util.Scanner;
class series
 {
  
  public static void main(String args[])
   { 
     int N, i, sum = 0;

     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     N = in.nextInt();

     for(i=0;i<=N;i++)
       { 
        if((i%2) == 1)
         {
         sum +=i;
         }           
             
             
        }
        System.out.println("sum of all odd numbers" + sum);
     }
  }
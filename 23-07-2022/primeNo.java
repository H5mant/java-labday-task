import java.util.Scanner;
class primeNo
{
  public static void main(String args[])
  {
   int count=0,i;
   Scanner he = new Scanner(System.in);
   System.out.println("Enter No: ");
   int num = he.nextInt(); 
   for(i=1;i<=num;i++)
    {
     if(num%i==0)
       {
        count+=1;  
       }
     }
      if(count==2)
      {
      System.out.println("prime no: "+num);
      }

     else 
       {
         System.out.println("not prime: "+num);
       }
     
   }

}
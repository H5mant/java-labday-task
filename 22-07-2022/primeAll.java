import java.util.Scanner;
class primeAll
{
  public static void main(String args[])
  {
   
   Scanner he = new Scanner(System.in);
   System.out.println("Enter No: ");
   int num = he.nextInt(); 
   for(int i=2;i<=num;i++)
   {
    int count =0;
     for(int j=2;j<i;j++)
     {
      if(i%j==0)
       {
        count++;
       }
     }
     if(count==0)
     {
      System.out.println(i+"");
     }      
   }
}
}
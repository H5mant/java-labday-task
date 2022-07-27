import java.util.Scanner;
class table
{
   public static void main(String args[])
   {
    Scanner num = new Scanner(System.in);   
    System.out.println("Enter No For Table");
    int tab = num.nextInt();
    System.out.println("table upto");
    int row = num.nextInt();

    for(int i=1;i<=row;i++)
    {
     int tab2 = tab*i;  
     System.out.println(tab+"*"+i+"="+tab2);
             
    }

   }
}
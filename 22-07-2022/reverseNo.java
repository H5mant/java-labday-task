import java.util.Scanner;

public class reverseNo
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   System.out.print("ENTER ANY NUMBER:");
   int no = scan.nextInt();
   int reversedno = reverseno(no);   
   System.out.println(no+"reverse number is: "+reversedNo);
   Scan.close();
  }
 public static int reverseno(int data)
 {
   int num=0,rem=1;
   while(data!=0)
    {
    rem = data%10;
    num = num*10+rem;
    data = data/10;
    }
   return num;
 }

}
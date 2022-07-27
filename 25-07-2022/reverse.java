/*
code of reverse number
by hemant bhandari
*/

import java.util.Scanner;
public class reverse
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);  //creating scanner object and named sc.
   System.out.print("ENTER ANY NUMBER:");
   int no = sc.nextInt(); //reading and storing value in variable no.
   int reversedNo = reverseNo(no); //calling reverseNo method and store it reversed value in reversedNo.  
   System.out.println("reverse no is: "+reversedNo);
   sc.close();
  }

 public static int reverseNo(int data)
 {
   int num=0,rem=1;
   while(data!=0) //reversing the number.
    {
    rem = data%10;
    num = num*10+rem;
    data = data/10;
    }
   return num;  //returning the value.
 }

}
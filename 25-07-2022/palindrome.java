/*
code of palindrome number
by hemant bhandari
*/

import java.util.Scanner;
public class palindrome
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);  //creating scanner object and named sc.
   System.out.print("ENTER ANY NUMBER:");
   int no = sc.nextInt(); //reading and storing value in variable no.
   boolean result = palindromeNo(no); //calling reverseNo method and store it reversed value in reversedNo.  
 

   if(result)
   {
      System.out.println(no+" is palindrome number");
   }
   else
   {
      System.out.println(no+" is not palindrome number");
   }
   sc.close();
  }

 public static boolean palindromeNo(int data)
 {
   int num=0,rem=1,old=data;
   while(data!=0) //reversing the number.
    {
    rem = data%10;
    num = num*10+rem;
    data = data/10;
    }
    if(num == old)
    {
    return true;
    }
    else
    {
     return false;
    }

 }
}
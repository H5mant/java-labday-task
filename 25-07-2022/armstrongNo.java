import java.util.Scanner;
public class armstrongNo
{
public static void main(String args[])
{
 Scanner no = new Scanner(System.in);
 System.out.print("ENTER ANY NUMBER:");
 int number = no.nextInt();
 boolean output = checkArmstrong(number);
 if(output)
 {
    System.out.println(number+" is armstrong number.");
 }
 else
 {
     System.out.println(number+" is not armstrong number.");
 }
}
public static boolean checkArmstrong(int data)
{
 int temp=0,old=data,digit,count=0,check=data;
  while(check!=0)
  {
   check=check/10;
   count++;
  }
  while(data!=0)
 {
  digit = data%10;
  temp += Math.pow(digit,count);
  data = data/10;
 }
  if(old == data)
  {
     return true; 
  }
  else
  {
     return false;
  }
}
}
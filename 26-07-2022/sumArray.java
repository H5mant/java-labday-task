import java.util.Scanner;
public class sumArray
{

 public static void main(String args[])
 {

  Scanner data = new Scanner(System.in);
  System.out.println("enter the size of array: ");
  int size = data.nextInt();
 
  int arr[] = new int[size];
  System.out.println("enter "+size+"of element");
 
  for(int i=0;i<size;i++)
   {
     arr[i] = data.nextInt(); 
   }
   System.out.println("---------------");
   int result=sum(size,arr);
   System.out.println(result+"is sum of array");
 }

 public static int sum(int size, int arr[])
 {
  int total=0;
  for(int k:arr)
  {
    total+=k;
  } 
   return total;
 }
}
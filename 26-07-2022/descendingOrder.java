import java.util.Scanner;
public class descendingOrder
{

 public static void main(String args[])
 {

  Scanner data = new Scanner(System.in);
  System.out.println("enter the size of array: ");
  int size = data.nextInt();
 
  int arr[] = new int[size];
  System.out.println("enter"+size+"of element");
 
  for(int i=0;i<size;i++)
   {
     arr[i] = data.nextInt(); 
   }
   System.out.println("---------------");
   sorting(size,arr);
   System.out.println("\n");
 }

 public static void sorting(int size, int arr[])
 {
  for(int i=0;i<size;i++)
  {
   for(int j=i+1;j<size;j++)
   {
     if(arr[i]<arr[j])
     {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
     }
    }
  }
  for(int k:arr)
  {
    System.out.println(k+"");
  } 

 }
}
import java.util.Scanner;
public class ascendingOrder
{

public static void main(String args[])
{

  //creating scanner object named data
  Scanner data = new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int size = data.nextInt();

  //creating array object and storing array size in it.
  int arr[] = new int[size];
  System.out.println("Enter "+size+" elements :");
  
  //store user input elementin array
  for(int i=0;i<size;i++)
   {
      arr[i] = data.nextInt();
   }
   sorting(size,arr);
   System.out.println("\n");
}

public static void sorting(int size, int arr[])
{
    for(int i =0;i<size;i++)
    {
      for(int j=i+1;j<size;j++)
      {
       if(arr[i]>arr[j])
       {
       int temp = arr[i];
       arr[i] = arr[i];
       arr[j] = temp;
       }
      }
    }
    for(int k: arr)
    {
     System.out.println(k+"");
    }

}
}
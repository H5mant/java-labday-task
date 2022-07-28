/*
program of matrix addition in 2 dimensional aaray
*/

import java.util.Scanner;

public class matrixAdd
{

public static void main(String args[])
{
   
   //creating scanner object named he
   Scanner he = new Scanner(System.in);
   System.out.println("Enter the no of rows:");
   int rows = he.nextInt();
   System.out.println("enter the no of cols:");
   int cols = he.nextInt();


   //creating three array arr,brr and crr to store value init
   int arr[][] = new int[rows][cols];
   int brr[][] = new int[rows][cols];
   int crr[][] = new int[rows][cols];

  
  //store value in first array
  System.out.println("Enter value of first array:");
   for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
       {
         arr[i][j] = he.nextInt();
       }
     }


    //store value in second array
    System.out.println("Enter value of second array:");
    for(int i=0;i<rows;i++)
      {
        for(int j=0;j<cols;j++)
         {
           brr[i][j] = he.nextInt(); 
         }
      }

    //calling display method
    display(rows,cols,arr,brr,crr);
    he.close();
}

  //creating method name display for addition in matrix
  public static void display(int rows,int cols,int arr[][],int brr[][],int crr[][])
  {
   /*using for loop for addition of matrix and store it in crr*/
 
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++)
        {
        crr[i][j] = arr[i][j] + brr[i][j];

        //display result value
        System.out.print(crr[i][j]+" ");
        }
      System.out.println(" "); 
    }
 
  }
}
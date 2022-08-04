/*
program of finding possible two number in array
whose addition will equal to target
BY HEMANT SINGH BHANDARI
*/

//importing scanner utility to get user input 
import java.util.Scanner;

//main class
public class target{
       public static void main(String args[]){
       
       //creating scanner object name scan
       Scanner scan =new Scanner(System.in);
       System.out.println("Enter any size of array");
       int size = scan.nextInt();
       
       //creating array ar      
       int[] ar;
       ar = new int[size];
       System.out.println("enter the"+size+"value in array");

       //for loop to store element in array
       for(int i=0;i<size;i++)
       {
         ar[i] = scan.nextInt();
       }
       System.out.println("enter the target no");
       int target = scan.nextInt();
   
       //creating object of search class 
        search find =new search();
  
        find.sum(ar,size,target);
        scan.close();
    }
}

//class search to find possibility of target 
 class search{
    public void sum(int ar[],int size, int target){
      int length =size;

      for(int i=0;i<length;i++){
        for(int j=i+1;j<length;j++){
    
      //comparing sum of two elements
      if(target ==ar[i]+ar[j]){
       
       System.out.println("element: "+ar[i]+" and "+ ar[j]);
       System.out.println("index :"+i+" and "+j);
       }     
      }
     }


}
}

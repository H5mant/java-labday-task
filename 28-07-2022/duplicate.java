/*
program to count the duplicate element in an array
by hemant singh bhandari
*/

//using the scanner utility to get input from user
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int num = scan.nextInt();//storing input of size of an array in variable 
        int count=0;
        int ar[] = new int[num];//array object to create array
        
        System.out.println("enter the element");

        //for loop is storing element in array
        for(int i=0;i<num;i++){
          ar[i] = scan.nextInt();  
        }   
       
        System.out.println("duplicate data are:--------");

          //element is compared till loop is running  
          for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(ar[i]==ar[j]){
                count++;}
            }
        }
        //printing the ouput of program
        System.out.println(count+" Element are duplicate");
  }
}
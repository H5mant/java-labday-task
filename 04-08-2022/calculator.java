/*
program of calcultor include addition,subtraction,multiplication and divide


*/

// import scanner utility to scan the input from user

import java.util.Scanner;

//main class 
//class name calculator

class calculator
{

   //main method
    public static void main(String args[])
    {
        
		//scanner object
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers for Element:");
		int size = scan.nextInt();
		int ar[];
         
		//creating array object to get input value 
        ar =new int[size];
		System.out.println("enter "+size+" number"+ "in array");
		
		//storing value
		for(int i=0;i<size;i++){
		    ar[i] =scan.nextInt();		
		}
		
        int start =ar[0];
      
	    System.out.println("press key for operation:");
		System.out.println(" for addition press: a \n for subtraction press: s \n for multiplication press: m");
		System.out.println(" for division press: d");
		
		char option = scan.next().charAt(0);
		
		switch(option){
		  case 'a' : addition(ar);//calling addition method
		                   break;
		  case 's' : subtraction(ar);
		                   break;
	      case 'm' : multiplication(ar);
		                   break;
		  case 'd' : division(ar);
		                   break;
          default : System.out.println("select according option");		
		
		}
		scan.close();
    }


    //add method
    public static void addition(int ...args){
	 int result = 0;
	 System.out.println("Addition of element :");
	
	  //adding
	  for(int x:args){
	     System.out.println(x+" ");
		 result+=x;
	  }
	System.out.println("sum of elements are "+result);
	}
	
	//subtraction method
	public static void subtraction(int ...args){
		int result = 0;
		System.out.println("subtraction of element :");
		
		//subtraction
		for(int x:args){
			System.out.println(x+" ");
			if(result !=0)
			{
			  result-=x;
			}
			
			if(result==0)
			{
			 result=start;
             start=0;			 
			}
		}
		System.out.println("subtraction of element are: "+result);
	}
	
	//multiplication method
	public static void multiplication(int ...args){
		int result = 1;
		System.out.println("multiplication of element :");

        //multiplication		
		for(int x:args){
			System.out.println(x+" ");
			result*=x;
		}
		System.out.println("multiplication of elements are" +result);
	}
	
	//divisionmethod
	public static void division(int ...args){
		int result = 0;
		System.out.println("division of element :");
		
		//divide
		for(int x:args){
			System.out.println(x+" ");
			if(result !=0)
			{
			 result/=x;
			}
			if(result==0)
			{
				result=start;
				start=0;
			}
		}
		System.out.println("division of elements are" +result);
	}
}
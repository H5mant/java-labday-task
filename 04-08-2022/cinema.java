/* This is a java program for a cinema in which you can add your movie details, and print
your movie details */

import java.util.Scanner;          // scanner class
import static java.lang.System.*; // it is used to avoid evry time type Sytem.out.println
class cinema                      // it is our main class 
{
   public static void main(String args[])        // it is our main method 
 {
	Scanner ps = new Scanner(System.in);      // scanner object
	out.println(" Please enter your movie name here = ");
	String movieName = ps.next();     // read movie name
	out.println(" Please enter price of ticket of your movie  = ");
	int price = ps.nextInt();        // read ticket price
	out.println("Please enter start time of your movie = ");
	int startTime = ps.nextInt();    // read start time of movie
	out.println("Please enter end time of your movie = ");
	int endTime = ps.nextInt();     // read end time of movie
	
	
	
	movie starts = new movie();        // object of movie class
	out.println("Choose what you want to do with your movie ");
	out.println("to add details enter = add" );
	out.println("to print details enter = print");
	String choose = ps.next();
	
	
	switch(choose)          // switch statement is use for perform one operation at one time
	{
		
		case "add": starts.addDetail(movieName,startTime,endTime,price);
					break;
		
			
		case "print": starts.printDetail(movieName,startTime,endTime,price);
					break;
		
		default : out.println(" Please select valid statement 'add or print' ");
	}               

 }
}

class movie         // it is our sub class
{
	String Name;
	int Price;
	int Start;
	int End;
	 
	public void addDetail(String name,int price,int start,int end)     // this is a method for add details
	{
		Name= name;
		Price = price;	
		Start = start;
		End = end;
		
		out.println("your movie details added in the data successfully ");
	}
	
	 // this is a method for get details 
	public void printDetail(String movieName,int price,int startTime,int endTime)
	{
		
		out.println(" This is your movie name = "+movieName);
		out.println(" This is your show timing = "+startTime+" - "+endTime+" pm");
		out.println(" This is your ticket price = "+price);
	}
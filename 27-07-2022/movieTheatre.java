/*
   program to create movie theatre management to store and display details
*/

//importing scanner to get input from user

import java.util.Scanner;

public class movieTheatre{

public static void main(String args[]){
  
   Scanner⁬ he = new Scanner(System.in);
   System.out.println("Enter movie name:");
   String movieName = he.next();
   System.out.println("Enter start time:");
   int startTime = he.nextInt();
   System.out.println("Enter end time :");
   int endTime = he.nextInt();
   System.out.println("enter price :");
   int price = he.nextInt();

   movie Show =new movie();

   show.setDetail();
   he.close();
}
}
 class movie{

     String Name;
     int Start,End,Price;

     public void setDetail(){
     Name = name;
     Start = start;
     End = end;
     Price =price;
     
}

  public void getDetail(){
        System.out.println("*****TICKET*****");
        System.out.println("MOVIE NAME :"+Name);
        System.out.println("Screen Time :" +Start+":00 pm - "+End+" :00 pm");
        System.out.println("Ticket price :Rs." +Price+"/-");

}
}
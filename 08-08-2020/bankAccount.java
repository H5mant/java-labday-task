package bankService;

import java.util.Scanner;

import bankService.*;

public class bankAccount{

    public static void main(String args[])
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter your Name: ");
     String name=scan.next(); 
     System.out.println("Enter your Account no: ");
     int accountNo=scan.nextInt();
     System.out.println("Enter your balance: ");
     int balance=scan.nextInt();
     int amount; 
     System.out.println("Select any option: ");
     System.out.println("To deposit Amount,press :A\nTo Withdraw Amount,press :W ");
     String option = scan.next();
     customer holder=new customer();
     
     holder.createAccount(name,accountNo,balance);

     switch(option)
        {
        case "A":
              holder.checkAmount();
              System.out.println("Enter Amount to Deposit: ");
              amount = scan.nextInt();
              holder.depositAmount(amount);
              break;
    
        case "W":
              holder.checkAmount(); 
              System.out.println("Enter Amount to Withdraw: "); 
              amount =scan.nextInt();
              holder.withdrawAmount(amount);
              break;

        default :
               System.out.println("select appropriate option.");    

        }
      holder.getDetail();
      scan.close();
   } 
}
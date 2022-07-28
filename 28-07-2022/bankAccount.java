/*
Bank management system by hemant singh bhandari
*/
// importing scanner utility to get input from user
import java.util.Scanner;
   
public class bankAccount{

public static void main(String args[]){


   Scanner scan = new Scanner(System.in);
   System.out.println("Enter Account Holder Name: ");
   String userName = scan.next();
   System.out.println("Enter Account Number: ");
   int accountNum = scan.nextInt();
   System.out.println("Enter Account Balance: ");
   int balance = scan.nextInt();
   System.out.println("Enter Amount: ");
   int amount = scan.nextInt();
   System.out.println("-------------------");
   
   customer user = new customer();


   user.createAccount(userName,accountNum,balance);

   user.depositAmount(amount);
   user.getAmount(); 
   user.withdrawAmount(amount);

   user.getDetail();
   scan.close();


}
}
   class customer{
	//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
	//creating method createAccount to store information of user
	public void createAccount(String name,int num,int bal){
		userName = name;
		accountNum = num;
		balance = bal;
			
	}
	
	//creating withdrawAmount method to delete amount from balance
	public void withdrawAmount(int amount){
		balance -= amount;
		System.out.println(userName+" your current balance after withdrawing Rs."+amount+" is : "+balance);
	}
	
	//creating depositAmount method to add amount
	public void depositAmount(int amount){
		balance += amount;
		System.out.println(userName+" your current balance after depositing Rs."+amount+" is : "+balance);
	}
	
	//creating getAmount method to check balance
	public void getAmount(){
		System.out.println(userName+" your current balance is : "+balance);
	}
	
	//Creating method getDetail to display information of User
	public void getDetail(){
		System.out.println("-----Account Detail------");
		System.out.println("Account Holder  NAME : "+ userName );
		System.out.println("Account Number : "+accountNum);
		System.out.println("Account Balance: Rs."+balance+"/-");
	}
    }
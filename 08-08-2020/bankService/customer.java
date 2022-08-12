package bankService;

class customer{
   String name;
   int amount,accountNo,balance;
   
   public void createAccount(String n,int no,int bal)   
   {
     name = n;
     accountNo = no;
     balance = bal;
   }

   public void withdrawAmount(int amount)
   {
    if(amount>balance)
     {
       System.out.println("----------\n Not Enough Money in Account");
     }
    else
     {
     balance -=amount;
     System.out.println("balance left after withdraw is "+balance); 
     }
   }

   public void depositAmount(int amount)
   {
    if(amount>0)
    {
    balance+=amount;
    System.out.println("Total balance after deposit is:"+balance);
    }
    else 
    {
    System.out.println("try again with appropriate amount");
    }
   }

   public void checkAmount()
   {
   System.out.println(name+"your balance is: "+balance);
   }
  
  public void getDetail()
  {
  System.out.println("Account holder Name: "+name);
  System.out.println("Account number: "+accountNo);
  System.out.println("Account Balance: "+balance); 
    
  } 
}
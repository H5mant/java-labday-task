import java.util.Scanner;


class aggregation
    {
        public static void main(String args[])
		{
	      Scanner scan=new Scanner(System.in);
		  System.out.println("Enter Employee Name:");
		  String name =scan.nextLine(); 
	      System.out.println("Enter Employee City:");
		  String city =scan.nextLine();
		  System.out.println("Enter Employee State:");
		  String state =scan.nextLine();
		  System.out.println("Enter Employee Id:");
		  int id =scan.nextInt();
		  System.out.println("Enter Employee Pincode:");
		  int pincode =scan.nextInt();
		  
		  Address adr1 = new Address(pincode,city,state);
		  
		  employee emp1 = new employee(id,name,adr1);	  
		  
		  emp1.getDetail();
          scan.close();		  
	    } 
    }
	
	class Address
    {
	int pinCode;
	String cityName,stateName;
	
	   Address(int pin,String city, String state)
	    {
	   
	      pinCode = pin;
	      cityName = city;
	      stateName = state;
	    }
	}
	
	class employee
	{
	    int empId;
        String empName,empState;

         Address adr;

       employee(int id,String name,Address adrr)
	   {
	   
	   empId = id;
	   empName = name;
	   adr = adrr;
	   
	   }

      public void getDetail()
	  {
	  
	      System.out.println("********EMPLOYEE DETAILS********");
		  System.out.println("HI "+empName+" your Id No is: "+empId+" and your address is: "+adr.cityName+" "+adr.stateName+"\n pincode is "+adr.pinCode);
		  System.out.println("********************************");
	  }	   
	
	}
class leapyear
 {
  
  public static void main(String args[])
   { 
     int n=1947,n2=2022;  
     for(int i=n;i<=n2;i++)
       { 
         if(i%4==0)
           {
            System.out.println("leap year: " +i); 
           }                      
        }
     }
 }
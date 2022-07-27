class bigNumber{

   public static void main(String args[]){
   
    int a=17,b=32,c=45,d=15,bigNumber;
    bigNumber = ( (a>b && a>c && a>d) ? a : (b>c && b>d) ? b : (c>d) ? c : d);

    System.out.println("bigNumber:\na:" +a+ " b:" +b+ " c:" +c+ " d:" +d+ "\nbiggest NO is :"+bigNumber);
   }
   }
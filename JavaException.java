public class JavaException{  
  public static void main(String args[]){   
      try
	  {
	  int a; 
	  a=100/0;
	    System.out.println(a);
	  }
	  catch(ArithmeticException ex)
	  {
		  System.out.println(ex.getMessage());
		  //get message is used to ask at runtime that basically what is the error 
		  //now in this line it will directly tell that /0 is not valid 
		  // and our program will not corrupt
		  //line below this getmessage will also work 
	  }
	  System.out.println("Main End");
   }  
  } 
public class ExceptionArray{  
  public static void main(String args[]){  
    try{
      int a[]=new int[5];  
      a[10]=50; 
     System.out.println("Main End");
    
    }
    catch(ArrayIndexOutOfBoundsException ex)
    {
      System.err.println(ex.getMessage());
    } 
    System.out.println("Main End");
   }  
  } 
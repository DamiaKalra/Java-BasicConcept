import java.util.*;
public class TryCatch {
    public static void main(String args[]){  
        try {
                int a,b,c; 
                Scanner sc=new Scanner(System.in); 
                System.out.print("Enter two elements "); 
                a=sc.nextInt();
                b=sc.nextInt();
                c=a/b;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage()); 
        }  
        finally{
            System.out.println("i am always here "); 
        }
                 try{
            int n;  
            Scanner sc=new Scanner(System.in);  
            System.out.print("Enter the number of elements ");   
            n=sc.nextInt();  
            int[] array = new int[10];  
            System.out.println("Enter the elements of the array: ");  
        
            for(int i=0; i<n; i++)  
            { 
            array[i]=sc.nextInt();  
            }  
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.err.println(ex.getMessage());
          } 
          finally{
            System.out.println("i am always here "); 
        }
          System.out.println("Main End");
    }
}

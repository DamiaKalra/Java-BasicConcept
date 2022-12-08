import java.io.*;
import java.util.*;
public class FileString {
    public static void main(String[] args){
    try{
        //writing file
        BufferedWriter br=new BufferedWriter(new FileWriter("Task2.txt"));
        //reading file
        BufferedReader b=new BufferedReader(new FileReader("Task2.txt"));
        String str; 
        //int n; 
        Scanner scn=new Scanner(System.in);  
        System.out.print("Enter the number of names "); 
        int n=0;
    //handeling InputMismatchException 
    try {
         n  = scn.nextInt();
    }
    catch(InputMismatchException ex)
    {
        System.out.println(ex.getMessage()); 
    }  
    finally{
        System.out.println("i am always here "); 
    }
        //int n  = scn.nextInt(); 
        String[] array = new String[n];  
        System.out.println("Enter the names of the array: ");  
        for(int i=0; i<n; i++)  
        { 
        array[i]=scn.nextLine(); 
        br.write( array[i]);
        
        //System.out.println("\n");
        }
        br.close();  
        while ((str = b.readLine()) != null)
        // Print the string
        System.out.println(str);
        br.close();
    }
    catch(IOException ex){
        System.out.println(ex.getMessage());
        }
    }
}
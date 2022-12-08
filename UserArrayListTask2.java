import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class UserArrayListTask2 {
    public static void main(String[] args) {
        
        ArrayList<String> list=new ArrayList<String>(); 
        String str="";
     
        Scanner sc= new Scanner(System.in); 
        do
	{
        System.out.print("Enter a string: ");
        
        str= sc.nextLine();
        list.add(str);
	}
    while(!str.equals("quit"));
    System.out.println("out from list");
       System.out.println(list); 
}
}



//     if(a == -1)
//     System.out.println("The element C is not in the ArrayList");
//  else
//     System.out.println("The element C is in the ArrayList at index " + a);
//  if(b == -1)
//     System.out.println("The element Z is not in the ArrayList");
//  else
//     System.out.println("The element Z is in the ArrayList at index " + b);

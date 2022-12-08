import java.util.*;
public class TokenTask2 {
    public static void main(String arg[])
    {
        String c=null;
        String mystring="";
        do{
            Scanner s=new Scanner(System.in);
        System.out.println("Enter your property");
        String name=s.nextLine();
        System.out.println("Enter your value");
        String value=s.nextLine();
        mystring+=name+"="+value+";";
        System.out.println("Do you want to continue");
        c=s.nextLine();
        }while(!c.equals("stop"));
        System.out.println();
        System.out.println(mystring);
}
}



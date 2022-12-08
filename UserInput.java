import java.util.*;
public class UserInput {
    public static void main(String args[])
    {
        System.out.println("Enter 2 numbers");
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int z=x/y;
        System.out.println(z);
    }
}

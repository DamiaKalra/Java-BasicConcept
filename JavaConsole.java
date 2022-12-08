import java.io.*;
import java.util.*;
public class JavaConsole {
     public static void main(String[] args) {
    String text=System.console().readLine();
    System.out.println("Text is"+ text);
    Console console=System.console();
    System.out.println("Enter your password :");
    char[] password=console.readPassword();
    System.out.println(" password is  :"+String.valueOf(password));
}
}

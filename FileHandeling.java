import java.io.*;
import java.util.Scanner;
public class FileHandeling {
    public static void main(String args[]){
try {
    BufferedWriter br=new BufferedWriter(new FileWriter("first.txt"));
    // br.write("Welcome To PR3 Training institute");
    // br.close();
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    while(n>=0)
    {
        String name=scan.nextLine();
        br.write(name+"\n");
        n--;
    }
    br.close();
}
catch(IOException ex){
    System.out.println(ex.getMessage());
    }
}
}

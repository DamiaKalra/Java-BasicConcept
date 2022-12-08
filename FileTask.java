import java.io.*;
import java.util.*;
public class FileTask {
    public static void main(String[] args)
    {
        try {
    BufferedWriter br=new BufferedWriter(new FileWriter("Task.txt"));
            
        Scanner scn = new Scanner(System.in);
        String str2 = scn.nextLine();
        br.write(str2);
        System.out.println("Entered String str2 : " + str2);
            br.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            }
        }
        }

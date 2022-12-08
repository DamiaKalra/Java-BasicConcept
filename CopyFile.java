import java.io.*;
public class CopyFile {
    public static void main(String[] args)
        throws IOException
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(
                "Task2.txt");
            fos = new FileOutputStream(
                "Taskoutput.txt");
 
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            System.out.println(
                "copied the file successfully");
        }
        finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
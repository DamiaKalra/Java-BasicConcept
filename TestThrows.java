import java.io.*;
public class TestThrows {
    static String getValue() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        System.out.println(str);
       return str;
    }
    public static void main(String args[])
    {
        try
        {
            TestThrows.getValue();
        }
        catch(IOException e)
        {
          System.err.println(e.getMessage());
        }
    }
}

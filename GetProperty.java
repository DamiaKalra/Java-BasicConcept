import java.util.*;
import java.io.*;
public class GetProperty {
    public static void main(String args[])throws Exception{
        FileReader reader=new FileReader("db.properties");
        Properties p=new Properties();
        p.load(reader);
        System.out.println(p.getProperty("name"));

        //Properties p=System.getProperties();
        Set set=p.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }}}

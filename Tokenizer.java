import java.util.*;
public class Tokenizer {
    public static void main(String arg[])
    {
StringTokenizer st=new StringTokenizer("come,to,learn",",");
System.out.println("Total tokens: "+ st.countTokens());
while(st.hasMoreTokens()){
    System.out.println( "Next Token: "+st.nextToken());
}
    }
}

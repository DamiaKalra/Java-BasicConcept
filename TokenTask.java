import java.util.*;
public class TokenTask {
    public static void main(String arg[])
    {
StringTokenizer st=new StringTokenizer("name=damia;class=java;duration=6 weeks;","=;");
System.out.println("Total tokens: "+ st.countTokens());
while(st.hasMoreTokens()){
    System.out.println( st.nextToken()+ " is "+st.nextToken());
}
}
}


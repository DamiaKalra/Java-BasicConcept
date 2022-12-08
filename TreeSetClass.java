import java.util.*;
public class TreeSetClass {
    public static void main(String args[]){
        TreeSet<String> ts=new TreeSet<String>();
         ts.add("damia");
         ts.add("mishti");
         ts.add("arnav");
         ts.add("tania");
             Iterator<String> itr=ts.iterator();
             while(itr.hasNext()){
                 System.out.println(itr.next());
             }
 }
}

import java.util.*;
public class HashSetClass {
    public static void main(String args[]){
        //basically no repition is there only display at one time
       HashSet<String> set=new HashSet<String>();
        set.add("damia");
        set.add("mishti");
        set.add("damia");
        set.add("tania");
            Iterator<String> itr=set.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
}
}

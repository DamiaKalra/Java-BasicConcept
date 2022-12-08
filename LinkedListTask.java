import java.util.*;
public class LinkedListTask {
    public static void main(String args[]){
        LinkedList<String> li=new LinkedList<String>();
        li.add("damia");
        li.add("mishti");
        li.add("karan");
        li.add("tania");
            Iterator<String> itr=li.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
    }
}

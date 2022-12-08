import java.util.*;
public class MapInterfaceJava {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
         map.put(1," damia");
         map.put(2, " mishti");
         map.put(3," karan");
         map.put(4," tania");
         for(Map.Entry m:map.entrySet())
         {
            System.out.println(m.getKey()+""+m.getValue());
         }
 }
}

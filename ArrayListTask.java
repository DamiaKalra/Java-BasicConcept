import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayListTask {
   public static void main(String[] args) {
    ArrayList<String> list=new ArrayList<String>();   
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E");
      System.out.println("Elements of the list are given below");
      for (String v : list) {
        System.out.println(v);
     }
;  
      int a = list.indexOf("C");
      int b = list.indexOf("Z");
      if(a == -1)
         System.out.println("The element C is not in the ArrayList");
      else
         System.out.println("The element C is in the ArrayList at index " + a);
      if(b == -1)
         System.out.println("The element Z is not in the ArrayList");
      else
         System.out.println("The element Z is in the ArrayList at index " + b);
   }
}

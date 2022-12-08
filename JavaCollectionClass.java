import java.util.*;
public class JavaCollectionClass {
    public static void main(String args[]){
    List<String> list=new ArrayList<String>();
    list.add("C");
    list.add("Core java");
    list.add("Advance java");
System.out.println("Initial collection value"+list);
Collections.addAll(list,"servlet","JSP");
System.out.print("After adding elements collection value:"+list);
String[] strArr={"c#",".Net"};
Collections.addAll(list,strArr);
System.out.print("After adding array collection value:"+list);
}
}

import java.util.*;
enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,FRIDAY,SATURDAY
}
public class EnumsetClass {
    public static void main(String args[]){
        Set<days>set=EnumSet.of(days.TUESDAY,days.WEDNESDAY);
        Iterator<days> iter=set.iterator();
        while(iter.hasNext())
        System.out.println(iter.next());
        Set<days> set1=EnumSet.allOf(days.class);
        System.out.println("WEEK DAYS "+set1);
        /*Set<days> set2=EnumSet.noneOf(days.class);
        System.out.println("WEEK DAYS"+set2);*/
}
}

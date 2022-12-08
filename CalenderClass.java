import java.util.Calendar;
public class CalenderClass {
    public static void main(String args[])
    {
        Calendar cal= Calendar.getInstance();
        int day,month,year,hours,min,sec;
        day=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH);
        year=cal.get(Calendar.YEAR);
        System.out.print("Today's date : ");
        System.out.print(day+"/");
        System.out.print(month+"/");
        System.out.print(year);
        hours=cal.get(Calendar.HOUR);
        min=cal.get(Calendar.MINUTE);
        sec=cal.get(Calendar.SECOND);
       System.out.print("Current Time :");
       System.out.print(hours + " :");
       System.out.print(min +" :");
       System.out.println(sec);
    }
    





}

import java.util.*;
public class ClockTask{
public static void main(String args[])
{
for(int i=0;i<=3;i++)
{
    try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println(e.getMessage());
    }
Calendar cal = Calendar.getInstance();
int hours=cal.get(Calendar.HOUR);
int min =cal.get(Calendar.MINUTE);
int sec=cal.get(Calendar.SECOND);
System.out.println(hours+":"+min+":"+sec);
}
}
}
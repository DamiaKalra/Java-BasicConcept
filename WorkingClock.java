import java.applet.Applet;
import java.awt.*;
import java.util.*;

import javax.swing.text.Position;
public class WorkingClock extends Applet implements Runnable{
    String str;
    Font f1;
    public void init(){
        f1= new Font("Arial",Font.BOLD,25);
    str="";
setBackground(Color.yellow);
}
public void start(){
    Thread t=new Thread(this);
    t.start();
}
public void run(){
    try{
        while(true)
        {
            Calendar cal=Calendar.getInstance();
            int hour=cal.get(Calendar.HOUR);
            int min =cal.get(Calendar.MINUTE);
            int sec =cal.get(Calendar.SECOND);
            str=hour+":"+min+":"+sec;
            Thread.sleep(1000);
            repaint();
        }
    }
    catch(InterruptedException e)
    {
System.out.println(e.getMessage());
    }
}
public void paint(Graphics g){
    g.setColor(Color.red);
     g.setFont(f1);
    //  g.getClipBounds(CENTER_ALIGNMENT);
    g.drawString(str,10,20);
}
}
/*
<applet code="WorkingClock" width="400" height="800"></applet>
*/



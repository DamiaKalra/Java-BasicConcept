import java.applet.Applet;
import java.awt.*;
import java.util.*;
public class BannerMove extends Applet implements Runnable{
    String str;
    public void init(){
    str="Welcome To PR3 Training institute";
setBackground(Color.pink);
}
public void start(){
    Thread t=new Thread(this);
    t.start();
}
public void run(){
    try{
        while(true)
        { 
            //String name="Welcome To PR3 Training institute";  
            char ch=str.charAt(0);//returns the char value at the 4th index  
            str =str.substring(1,str.length());
            str += ch; 
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
    g.setColor(Color.blue);
    g.drawString(str,10,20);
}
}
/*
<applet code="BannerMove" width="400" height="800"></applet>
*/

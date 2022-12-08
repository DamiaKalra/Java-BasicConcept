import java.applet.*;
import java.awt.*;
public class TestApplet extends Applet{
    public void paint(Graphics g)
    {
        g.drawString("hi", 10, 20);
    }
}
/*<applet code="TestApplet" height="100" width="200"></applet> */
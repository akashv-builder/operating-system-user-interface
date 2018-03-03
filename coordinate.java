import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code=coordinate.class width=700 height=700>
</applet>*/

public class coordinate extends Applet
{

    String msg="";
    
    int x=0,y=0;

    public void init()
{

    addMouseListener(new mouseadapter());
}

class mouseadapter extends MouseAdapter
{

    public void mouseClicked(MouseEvent me)
{

    x=me.getX();
    y=me.getY();
    
    msg="clicked at"+x+","+y;

    repaint();
}
}

public void paint(Graphics g)
{

  g.drawString(msg,x,y);
}
}
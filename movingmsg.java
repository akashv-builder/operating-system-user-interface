
import java.awt.*;
import java.applet.*;


/*<applet code=movingmsg.class height=300 width=800></applet>*/

public class movingmsg extends Applet implements Runnable
{ 

      String msg="Every super ending has a starting...";

     public void init()
{

    Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,50);
    setFont(f);

    setForeground(Color.red);
 
    setBackground(Color.black);

    new Thread(this).start();
    
}


     public void paint(Graphics g)
{
     

     g.drawString(msg,50,150);
}

      public void run()
{

      while(true)
{

      try
{     Thread.sleep(500);

}

     catch(Exception e){}
     msg=msg.substring(1)+""+msg.substring(0,1);

      repaint();

 
      
    

     

}
}
}


    
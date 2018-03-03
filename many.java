import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.applet.*;




public class many extends JFrame implements Runnable
{ 

   

     JLabel l;

     String s;

     public many()
{   

    l=new JLabel("Every super ending has a starting...");

    Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,50);
    l.setFont(f);

    l.setForeground(Color.red);
 
    l.setBackground(Color.black);

    Thread t=new Thread();
    t.start();
    
}



      public void run()
{

      while(true)
{

      

      try
{     Thread.sleep(500);

}

     catch(Exception e){}

     s=l.getText();
   
    
     s=s.substring(1)+""+s.substring(0,1);

     l.setText(s);

      
 
      
    

     

}
}



                  public static void main(String args[])
{                   
                      many m=new many();

                      m.setSize(2000,2000);				
		       
                      m.setVisible(true);
}
}
    
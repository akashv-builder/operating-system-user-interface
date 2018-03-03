import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class imageviewer extends JFrame implements Runnable,ActionListener

{

        JLabel l;
        JButton b;

        String images[]={"7.jpg","8.jpg","9.jpg","10.jpg","11.jpg","12.jpg","13.jpg","14.jpg","15.jpg","16.jpg","17.jpg","18.jpg","19.jpg","20.jpg","21.jpg"};

        ImageIcon i,i1;

        int p;

        public imageviewer()
{
        setLayout(null);
        

        getContentPane().setBackground(Color.blue);

        l=new JLabel("3.jpg");
        l.setBounds(0,0,1950,1000);

       
       
          i1=new ImageIcon("back.gif");


          b=new JButton(i1);
          b.setBounds(1500,700,149,58);
          b.addActionListener(this);

      
         add(b);
         add(l);
   
        Thread t=new Thread(this);

        t.start();
}
 
        public void run()

{

        while(true)

{       p=(int)(Math.random()*10);

        if(p>=0 && p<=15)
{
        i=new ImageIcon(images[p]);
}


        l.setIcon(i);

        try
{
        Thread.sleep(1500);

}

        catch(Exception e){}

}
}



           public void actionPerformed(ActionEvent ae)
{
          



           if(ae.getSource()==b)
{          screen6 r=new screen6();

       
           r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("HOME SCREEN");
           this.dispose();
}     
   
}


        public static void main(String args[])

{

         imageviewer s=new imageviewer();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("IMAGE VIEWER");

}
}       


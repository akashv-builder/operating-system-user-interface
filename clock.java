import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class clock extends JFrame implements Runnable,ActionListener
{
   
           

           JLabel l1,l2,l3,l4,l5,l6;

           int second,minute,hour;
 
           ImageIcon i,i1;
 
           JButton b;


          

           
           public clock()
{       

           setLayout(null);  

           Font f=new Font("Comic Sans MS",Font.BOLD|Font.ITALIC,200);

           

           GregorianCalendar date=new GregorianCalendar();


          
           second=date.get(Calendar.SECOND);
           minute=date.get(Calendar.MINUTE);
           hour=date.get(Calendar.HOUR);

       
 

           l1=new JLabel(""+hour);
           l1.setFont(f);
           l1.setBounds(425,225,400,400);
           l1.setForeground(Color.red);
           l1.setBackground(Color.black);

           l2=new JLabel(""+minute);
           l2.setFont(f);
           l2.setBounds(755,225,400,400);
           l2.setForeground(Color.black);
           
           l3=new JLabel(""+second);
           l3.setFont(f);
           l3.setBounds(1125,225,400,400);
           l3.setForeground(Color.blue);

           l4=new JLabel(":");
           l4.setFont(f);
           l4.setBounds(655,225,400,400);
           l4.setForeground(Color.pink);
        
           l5=new JLabel(":");
           l5.setFont(f);
           l5.setBounds(1000,225,400,400);
           l5.setForeground(Color.orange);
        

          
           i=new ImageIcon("4.jpg");
           l6=new JLabel(i);
           l6.setBounds(0,0,1900,952);

           Font p=new Font("Comic Sans MS",Font.BOLD|Font.ITALIC,70);

          i1=new ImageIcon("back.gif");


          b=new JButton(i1);
          b.setBounds(1500,700,149,58);
          b.addActionListener(this);


           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);


       

          
          add(l3);
          add(l4);
          add(l2);
          add(l5);
          add(l1);
          add(b);
          add(l6);
        

         Thread t=new Thread(this);
         t.start();
          
}
         public void run()
{
         while(true)

{
         try

{        Thread.sleep(1000);

         

}


          catch(Exception e){}

          second=(second+1);

          if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);

          
          
          

          if(second>=60)
{
          minute=(minute+1);

          second=0;
           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);


        




          if(minute>=60)
{          
          hour=(hour+1);
          
          minute=0; 
      
          
           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);

        

}
}
          
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



         clock s=new clock();

        
  

         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("CLOCK");

}


}
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class wall extends JFrame implements ActionListener
{
   
           

           JLabel l1,l2,l3,l4,l5,l6;

           JButton b1,b2,b3,b4,b5,b;
 
           ImageIcon i1,i2,i3,i4,i5,i6;


public wall()

{          

          try
          {

           setLayout(null);

           Font p=new Font("Comic Mans MS",Font.BOLD,40);
           getContentPane().setBackground(Color.pink);
          
          
           i1=new ImageIcon("3.jpg");
           i2=new ImageIcon("4.jpg");
 	   i3=new ImageIcon("picture5.jpg");
           i4=new ImageIcon("picture7.jpg");
           i5=new ImageIcon("picture4.jpg");
        
       

          


           l1=new JLabel(i1);
           l1.setBounds(390,200,200,300);

           l2=new JLabel(i2);
           l2.setBounds(640,200,200,300);
       
           l3=new JLabel(i3);
           l3.setBounds(890,200,200,300);
       
           l4=new JLabel(i4);
           l4.setBounds(1140,200,200,300);
       
           l5=new JLabel(i5);
           l5.setBounds(1390,200,200,300);

           l6=new JLabel("Choose Picture:");
           l6.setBounds(830,0,500,100);
           l6.setFont(p);
       
       
       
         
          i6=new ImageIcon("back.gif");


          b=new JButton(i6);
          b.setBounds(1500,800,149,58);
          b.addActionListener(this);





           b1=new JButton("Select");
           b1.setBounds(390,600,200,70);
           b1.setFont(p);
           b1.addActionListener(this);

           b2=new JButton("Select");
           b2.setBounds(640,600,200,70);
           b2.setFont(p);
           b2.addActionListener(this);

           b3=new JButton("Select");
           b3.setBounds(890,600,200,70);
           b3.setFont(p);
           b3.addActionListener(this);

           b4=new JButton("Select");
           b4.setBounds(1140,600,200,70);
           b4.setFont(p);
           b4.addActionListener(this);

           b5=new JButton("Select");
           b5.setBounds(1390,600,200,70);
           b5.setFont(p);
           b5.addActionListener(this);

         
           
           add(b);
           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           
           add(l6);
           add(l1);
           add(l2);
	   add(l3);
           add(l4);
           add(l5);
           
}

           catch(Exception e){}          
}


 
public void actionPerformed(ActionEvent ae)

{

  if(ae.getSource()==b1)
{
   screen6 s1=new screen6();
 
           s1.l.setIcon(i1);
           s1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           s1.setSize(2000,2000);
           s1.setVisible(true); 
           s1.setExtendedState(JFrame.MAXIMIZED_BOTH);
           s1.setTitle("HOME SCREEN");
           this.dispose();

}

   if(ae.getSource()==b2)
{
   screen6 s2=new screen6();
 
           s2.l.setIcon(i2);
          
           s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           s2.setSize(2000,2000);
           s2.setVisible(true); 
           s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
           s2.setTitle("HOME SCREEN");
           this.dispose();

}

   if(ae.getSource()==b3)
{
   screen6 s3=new screen6();
 
           s3.l.setIcon(i3);
        
           s3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           s3.setSize(2000,2000);
           s3.setVisible(true); 
           s3.setExtendedState(JFrame.MAXIMIZED_BOTH);
           s3.setTitle("HOME SCREEN");
           this.dispose();

}

  if(ae.getSource()==b4)
{
   screen6 s4=new screen6();
 
           s4.l.setIcon(i4);
       
           s4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           s4.setSize(2000,2000);
           s4.setVisible(true); 
           s4.setExtendedState(JFrame.MAXIMIZED_BOTH);
           s4.setTitle("HOME SCREEN");
           this.dispose();

}

   if(ae.getSource()==b5)
{
   screen6 s5=new screen6();
 
           s5.l.setIcon(i5);
         
           s5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           s5.setSize(2000,2000);
           s5.setVisible(true); 
           s5.setExtendedState(JFrame.MAXIMIZED_BOTH);
           s5.setTitle("HOME SCREEN");
           this.dispose();

}

   if(ae.getSource()==b)
{                 screen6 r=new screen6();

       
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

 
           wall r=new wall();

       
           r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("Change Wallpaper");
          
          

}
}

          
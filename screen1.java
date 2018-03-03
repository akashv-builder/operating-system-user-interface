import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class screen1 extends JFrame implements ActionListener
{

          JButton b1,b2,b3;
          

          ImageIcon i1,i2,i3;

          JLabel l1,l2,l3;

          
          public screen1()
{   

          setLayout(null);

          Font f=new Font("Comic Mans MS",Font.BOLD,20);
          

           
          i1=new ImageIcon("1.jpg");
          i2=new ImageIcon("2.png");
          i3=new ImageIcon("3.jpg");


          l1=new JLabel(i1);
          l1.setBounds(600,200,300,400);
         

          l2=new JLabel(i2);
          l2.setBounds(1000,200,300,400);
          

          b1=new JButton("Akash");
          b1.setFont(f);
          b1.setBounds(650,700,200,50);
          b1.addActionListener(this);
          

          b2=new JButton("Guest Login");
          b2.setFont(f);
          b2.setBounds(1050,700,200,50);
          b2.addActionListener(this);

          b3=new JButton("SHUT DOWN");
          b3.setFont(f);
          b3.setBounds(1500,800,200,50);
          b3.addActionListener(this); 
          

          l3=new JLabel(i3);
          l3.setBounds(0,0,1900,952);

         
          
         
          add(b1);
          add(b2);
          add(b3);
          add(l1);
          add(l2);
          add(l3);
          

}

public void actionPerformed(ActionEvent ae)



{        

         if(ae.getSource()==b1)

{        screen2 obj=new screen2();

         obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         obj.setSize(2000,2000);
         obj.setVisible(true); 
         obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
         obj.setTitle("AKASH'S LOGIN SCREEN");

         this.dispose();
}
         if(ae.getSource()==b2)

{        screen3 obj1=new screen3();

         obj1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         obj1.setSize(2000,2000);
         obj1.setVisible(true); 
         obj1.setExtendedState(JFrame.MAXIMIZED_BOTH);
         obj1.setTitle("GUEST LOGIN SCREEN");

         this.dispose();
}        

         if(ae.getSource()==b3)
{

         System.exit(0);

}
          


}


public static void main(String args[])
{

         screen1 s=new screen1();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("CHOOSE USER");

         
}
}

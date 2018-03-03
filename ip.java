import java.net.InetAddress;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class ip extends JFrame implements ActionListener
{


          JLabel l1,l2;
          JButton b;
          ImageIcon i1;
          
          
          public ip()
{   
          setLayout(null);
           
          Font f=new Font("Rockwell",Font.BOLD,80);
          
          getContentPane().setBackground(Color.pink);


          l1=new JLabel("Desktop Name/IP Address:");
          l1.setFont(f);
          l1.setForeground(Color.red);
          l1.setBounds(378,153,1500,200);

          try
{         l2=new JLabel(""+InetAddress.getLocalHost());
          l2.setBounds(578,350,1500,200);
          l2.setForeground(Color.blue);
          l2.setFont(f);
}


           catch(Exception e){}
         
          
          i1=new ImageIcon("back.gif");


          b=new JButton(i1);
          b.setBounds(1500,700,149,58);
          b.addActionListener(this);


          

          add(l1);
          add(l2);
          add(b);


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


         ip s=new ip();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("IP");

}
}
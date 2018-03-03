import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URI;



public class search extends JFrame implements ActionListener
{

     ImageIcon i,i1,i2;
     JTextField t;
     JLabel l;
     JButton b,b1;
     String s1;

public search()
{

     setLayout(null);

     getContentPane().setBackground(Color.pink);

     Font f=new Font("Comic Mans MS",Font.BOLD,40);

     i=new ImageIcon("google1.gif");
     i1=new ImageIcon("search.gif");
 
     l=new JLabel(i);
     l.setBounds(550,0,900,400);

     t=new JTextField(20);
     t.setFont(f);
     t.setBounds(510,400,1000,70);

     b=new JButton(i1);
     b.setBackground(Color.orange);
     b.setBounds(850,500,300,100);
     b.addActionListener(this);

     i2=new ImageIcon("back.gif");
     b1=new JButton(i2);
     b1.setBounds(1500,700,149,58);
     b1.setBackground(Color.yellow);
     b1.addActionListener(this);


     add(l);
     add(t);
     add(b);
     add(b1);

}


public void actionPerformed(ActionEvent ae)
{
           if(ae.getSource()==b1)
{          screen6 r=new screen6();

       
           r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           r.setSize(2000,2000);
           r.setVisible(true); 
           r.setExtendedState(JFrame.MAXIMIZED_BOTH);
           r.setTitle("HOME SCREEN");
         

           this.dispose();
}

            if(ae.getSource()==b)
{

            s1=t.getText();
            int i=s1.length();
           

       
             if(i==0)
{
             JOptionPane.showMessageDialog(null,"Nothing To Search");

             t.requestFocus();

}

            else if(s1.equals("ip"))
{           ip s2=new ip();
            s2.setSize(2000,2000);
            s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            s2.setVisible(true);
            s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            s2.setTitle("IP");
            this.dispose();
}
            else if(s1.equals("notepad"))
{           note s2=new note();
            s2.setSize(2000,2000);
            s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            s2.setVisible(true);
            s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            s2.setTitle("NOTEPAD");
            this.dispose();
}
            else if(s1.equals("slideshow"))
{           imageviewer s2=new imageviewer();
            s2.setSize(2000,2000);
            s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            s2.setVisible(true);
            s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            s2.setTitle("IMAGE VIEWER");
            this.dispose();
}

            else if(s1.equals("clock"))
{           clock s2=new clock();
            s2.setSize(2000,2000);
            s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            s2.setVisible(true);
            s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            s2.setTitle("CLOCK");
            this.dispose();
}

            else
            try
{       
         String url =t.getText();
  
        Desktop.getDesktop().browse(new URI(url));
}
        catch(Exception e){}
               
          
}

}
   public static void main(String args[])

{
         search s=new search();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("Search");

}
}
   
           
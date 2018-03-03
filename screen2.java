import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class screen2 extends JFrame implements ActionListener
{       

        JLabel l1,l2,l3;

        JTextField t1;
      
        JPasswordField t2;
 
        ImageIcon i;

        JButton b1,b2;

        Font f;

        public screen2()
{

        setLayout(null);

        f=new Font("Comic Mans MS",Font.BOLD,30);        

        l1=new JLabel("USERNAME:");
        l1.setFont(f);
        l1.setBounds(600,300,500,50);
        l1.setForeground(Color.yellow);

        l2=new JLabel("PASSWORD:");
        l2.setFont(f);
        l2.setBounds(600,500,500,50);
        l2.setForeground(Color.yellow);

        t1=new JTextField(20);
        t1.setBounds(900,300,300,50);

        t2=new JPasswordField(20);
        t2.setBounds(900,500,300,50);

        b1=new JButton("LOGIN");
        b1.setFont(f);
        b1.setBounds(600,700,200,50);
        b1.addActionListener(this);

        b2=new JButton("SWITCH USER");
        b2.setFont(f);
        b2.setBounds(900,700,300,50);
        b2.addActionListener(this);

        i=new ImageIcon("4.jpg");
        l3=new JLabel(i);
        l3.setBounds(0,0,1900,952);


        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
}

       public void actionPerformed(ActionEvent ae) 

{

        if(ae.getSource()==b1)

{
       

       String s1,s2;

       s1=t1.getText();
       s2=t2.getText();

       int i,j;
       
       i=s1.length();

       j=s2.length();

       
       if(i==0 || j==0)
{
       JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL,TEXT FEILDS CANT BE EMPTY!");

       t1.requestFocus();

}

       else if(s1.equals("akash") && s2.equals("awesome"))
{

       JOptionPane.showMessageDialog(null,"LOGIN SUCESSFULL!");
       
       screen6 r=new screen6();

       r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       r.setSize(2000,2000);
       r.setVisible(true); 
       r.setExtendedState(JFrame.MAXIMIZED_BOTH);
       r.setTitle("HOME SCREEN");
       this.dispose();

}

       else if(i<5 && j<5)

{
       JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL,MINIMUM 5 CHARACTER USERNAME AND PASSWORD REQUIRED!");

}

       else

       JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL,INVALID USERNAME AND PASSWORD");

       

}

       else if(ae.getSource()==b2)
{

             screen1 ls=new screen1();
             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

             ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();
}
}


public static void main(String args[])

{

         screen2 s=new screen2();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("AKASH'S LOGIN SCREEN");
        

}
}       


  

      
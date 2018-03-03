import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.text.*;

public class screen5 extends JFrame implements ActionListener

{            
 
        JLabel l;

        JButton b;

        public screen5()


{       setLayout(null);

        Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,100);

              
 
        Date d=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

        String s=sdf.format(d);
     
        b=new JButton(s);

        b.setBounds(0,0,1900,952);

        b.addActionListener(this);

        b.setForeground(Color.white);

        b.setBackground(Color.black);

        b.setFont(f);

        add(b);
}       

        public void actionPerformed(ActionEvent ae)



{       if(ae.getSource()==b)

{        screen1 obj=new screen1();

         obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         obj.setSize(2000,2000);
         obj.setVisible(true);
         obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
         obj.setTitle("CHOOSE USER");
         this.dispose();
         

}


}



         public static void main(String args[])
{


         screen5 s2=new screen5();
         s2.setSize(2000,2000);
         s2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s2.setVisible(true);
         s2.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s2.setTitle("DATE");

}
}


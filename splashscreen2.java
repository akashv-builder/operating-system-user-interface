import java.util.*;
import java.awt.*;
import javax.swing.*;


public class splashscreen2 extends JFrame
{           
            
             
             public splashscreen2()
{

             setLayout(null);

             Font f=new Font("Arial Black",Font.BOLD|Font.ITALIC,30);
          

             ImageIcon i=new ImageIcon("imageforscreen1.jpg");

             ImageIcon i7=new ImageIcon("loading.gif");
         

             JLabel l=new JLabel(i);
             l.setBounds(25,25,1900,952);

             JLabel l7=new JLabel(i7);
             l7.setBounds(770,330,800,800);


        
             add(l7);
             add(l);

             

             
}


public static void main(String args[])
{

             splashscreen2 s=new splashscreen2();

             s.setSize(2000,2000);
             s.setExtendedState(JFrame.MAXIMIZED_BOTH);
             s.setTitle("SPLASH SCREEN");


            

             s.getContentPane().setBackground(Color.blue);


             s.setVisible(true);

           

             try 

{            Thread.sleep(6000);

}
             catch(Exception e){}

             screen5 ls=new screen5();

             ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("DATE SCREEN");

             s.dispose();

}
}


             




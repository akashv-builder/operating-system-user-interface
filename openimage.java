import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;
public class openimage extends JFrame
{
public String loc1;
JLabel image;
ImageIcon ic;
String imgs[]={"picture1.jpg","picture2.jpg","picture3.jpg","picture4.jpg","picture5.jpg","picture6.jpg","picture7.jpg","picture8.jpg"};
public openimage(String loc1)
{
setSize(800,800);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

setVisible(true);
this.loc1=loc1;
int i;
i=Integer.parseInt(loc1);
setTitle("image"+(i+1));
setLayout(null);
ic=new ImageIcon(imgs[i]);
image=new JLabel(ic);
image.setBounds(0,0,800,800);
add(image);

}

}









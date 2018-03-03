import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class clock1 extends JFrame implements Runnable
{

JLabel hrs,min,sec,sp1,sp2;
int s,m,h;
public void run()
{

while(true)
{
try
{
Thread.sleep(1000);
}
catch(Exception e){}


s=Integer.parseInt(sec.getText());
m=Integer.parseInt(min.getText());
h=Integer.parseInt(hrs.getText());

s++;
	if(s>=0 && s<=9)
	{
	sec.setText("0"+s);
	} 
	else if(s>=10 && s<=59)
	{
			sec.setText(""+s);
	} 
	else
	{
		sec.setText("00");
		m=m+1;
		if(m>=0 && m<=9)
		{		min.setText("0"+m);
		} 
		else if(m>=10 && m<=59)
		{
			min.setText(""+m);
		}		 
		else
		{	min.setText("00");
			h=h+1;
			if(h>=0 && h<=9)
			{	
				hrs.setText("0"+h);
			} 
			else if(h>=10 && h<=59)
			{
				hrs.setText(""+h);
			}		 
			else
			{
			hrs.setText("00");min.setText("00");sec.setText("00");
			}
				
		}
	}

}
}


public clock1()
{
setLayout(new FlowLayout());
hrs=new JLabel("00");
sp1=new JLabel(":");

min=new JLabel("00");
sp2=new JLabel(":");
sec=new JLabel("00");
add(hrs);
add(sp1);
add(min);
add(sp2);
add(sec);

Thread t=new Thread(this);
t.start();
}

public static void main(String args[])
{
clock1 c=new clock1();
c.setSize(300,300);
c.setVisible(true);
}

} 
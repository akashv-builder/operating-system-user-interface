import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calculator extends Frame implements ActionListener

{
JPanel p1,p2,p3,p4;
JButton[] button=new JButton[10];
JButton b1,b2,b3,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20;
JTextField t;
double result,fresult,ans;
int i;
public calculator()
{
setLayout(new BorderLayout());
p1=new JPanel();
t=new JTextField(20);
p1.add(t);
add(p1,BorderLayout.NORTH);
p2=new JPanel(new GridLayout(4,3));
for(int i=1;i<=9;i++)
{
button[i]=new JButton(""+i);
p2.setBounds(100,200,220,200);
p2.add(button[i]);
button[i].addActionListener(this);
}
add(p2,BorderLayout.CENTER);
p3=new JPanel(new GridLayout(1,3));
b1=new JButton("clear");
b2=new JButton("0");
b3=new JButton("=");
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

p2.add(b1);
p2.add(b2);
p2.add(b3);
add(p3,BorderLayout.SOUTH);
p4=new JPanel(new GridLayout(4,5));
a1=new JButton("+");
a2=new JButton("-");
a3=new JButton("X");
a4=new JButton("/");
a5=new JButton("1/x");
a6=new JButton("!");
a7=new JButton("square");
a8=new JButton("cube");
a9=new JButton("sqrt");
a10=new JButton("log");
a11=new JButton("sin");
a12=new JButton("cos");
a13=new JButton("tan");
a14=new JButton("pi");
a15=new JButton("exp");
a16=new JButton("log10");
a17=new JButton("x^y");
a18=new JButton("cosh");
a19=new JButton("sinh");
a20=new JButton("tanh");

a1.addActionListener(this);
a2.addActionListener(this);
a3.addActionListener(this);
a4.addActionListener(this);
a5.addActionListener(this);
a6.addActionListener(this);
a7.addActionListener(this);
a8.addActionListener(this);
a9.addActionListener(this);
a10.addActionListener(this);
a12.addActionListener(this);
a13.addActionListener(this);
a14.addActionListener(this);
a15.addActionListener(this);
a16.addActionListener(this);
a11.addActionListener(this);
a17.addActionListener(this);
a18.addActionListener(this);
a19.addActionListener(this);
a20.addActionListener(this);


p4.add(a1);
p4.add(a2);
p4.add(a3);
p4.add(a4);
p4.add(a5);
p4.add(a6);
p4.add(a7);
p4.add(a8);
p4.add(a9);
p4.add(a10);
p4.add(a11);
p4.add(a12);
p4.add(a13);
p4.add(a14);
p4.add(a15);
p4.add(a16);
p4.add(a17);
p4.add(a18);
p4.add(a19);
p4.add(a20);
add(p4,BorderLayout.EAST);


}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
t.setText("0");
}
for(int i=1;i<=9;i++)
{
if(ae.getSource()==button[i])
{
if(t.getText().equals("0"))
t.setText(""+i);
else
t.setText(t.getText()+""+i);
}
}
if(ae.getSource()==b2)
t.setText(t.getText()+"0");
if(ae.getSource()==a1)
{
result= Double.parseDouble(t.getText());
i=1; 
t.setText("0");
}
if(ae.getSource()==a2)
{
result= Double.parseDouble(t.getText());
i=2; 
t.setText("0");
}
if(ae.getSource()==a3)
{
result= Double.parseDouble(t.getText());
i=2; 
t.setText("0");
}
if(ae.getSource()==a4)
{
result= Double.parseDouble(t.getText());
i=4; 
t.setText("0");
}
if(ae.getSource()==a5)
{
result= Double.parseDouble(t.getText());
i=5; 

}
if(ae.getSource()==a6)
{
result= Double.parseDouble(t.getText());
i=6; 

}
if(ae.getSource()==a7)
{
result= Double.parseDouble(t.getText());
i=7; 

}
if(ae.getSource()==a8)
{
result= Double.parseDouble(t.getText());
i=8; 
}
if(ae.getSource()==a9)
{
result=Math.sqrt( Double.parseDouble(t.getText()));
}
if(ae.getSource()==a10)
{
result=Math.log( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a11)
{
result=Math.sin( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a12)
{
result=Math.cos( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a13)
{
result=Math.tan( Double.parseDouble(t.getText()));

}

if(ae.getSource()==a14)
{
result= Double.parseDouble(t.getText());
i=14; 

}
if(ae.getSource()==a15)
{
result=Math.exp( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a16)
{
result=Math.log10( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a17)
{
result= Double.parseDouble(t.getText());
i=17;
t.setText("0");
}
if(ae.getSource()==a18)
{
result=Math.sinh( Double.parseDouble(t.getText()));
}
if(ae.getSource()==a19)
{
result=Math.cosh( Double.parseDouble(t.getText()));

}
if(ae.getSource()==a20)
{
result=Math.tanh( Double.parseDouble(t.getText()));

}



if(ae.getSource()==b3) 
{

fresult= Double.parseDouble(t.getText());




switch(i)
{
case 1:
{

ans=result+fresult;
t.setText(""+ans); 
result=0;
fresult=0;
}
break;

case 2:
{

ans=result-fresult;
t.setText(""+ans);
result=0;
fresult=0;

}
break;

case 3:
{

ans=result*fresult;
t.setText(""+ans);
result=0;
fresult=0;

}
break;

case 4:
{

ans=result/fresult;
t.setText(""+ans);
result=0;
fresult=0;

}
break;
case 5:
{

ans=1/result;
t.setText(""+ans);
result=0;
fresult=0;

}
break;
case 6:
{
int fact=1;

for ( int c = 1 ; c <= result ; c++ )
fact = fact*c;
t.setText(""+fact);
result=0;
fresult=0;

}
break;
case 7:
{

ans=result*result;
t.setText(""+ans);
result=0;
fresult=0;

}
break;
case 8:
{

ans=result*result*result;
t.setText(""+ans);
result=0;
fresult=0;

}
break;
case 14:
{
double pi=3.14;
ans=result*pi;
t.setText(""+ans);
result=0;
fresult=0;

}
break;
case 17:
{
ans=Math.pow(result,fresult);
t.setText(""+ans);
result=0;
fresult=0;


}
break;
default:
t.setText(""+result);







}

}









}

public static void main(String args[])
{

calculator c= new calculator();
c.setTitle("calculator");
c.setSize(600,400);
c.setVisible(true);

}

}



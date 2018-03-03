import java.applet.*;
import java.awt.*;
/*<applet code=red.class height=1000 width=2000>
</applet>*/


public class red extends Applet
{



public void init()
{
           Font f=new Font("Comic Mans MS",Font.BOLD,40);
           setFont(f);

          
}




public void paint(Graphics g)
{
try
{

while(true)
{
//part1

//upper line
g.drawLine(0,930,1950,930);

//lowerline
g.drawLine(0,390,1950,390);

//making truck
g.drawRect(105,630,450,200);
g.drawOval(150,830,100,100);
g.drawOval(510,830,100,100);
g.drawRect(555,630,200,200);
g.drawRect(580,645,150,150);
g.drawOval(610,650,50,50);
g.drawRect(630,701,10,15);
g.drawRect(620,715,30,50);
g.drawRect(610,765,80,30);
g.drawRect(580,701,30,93);
g.drawRect(704,725,25,20);
g.drawOval(670,690,40,40);
g.drawLine(650,727,670,705);
g.drawLine(650,747,670,709);
g.drawRect(60,796,45,20);

//making 2nd truck
g.drawRoundRect(935,630,350,200,50,50);
g.drawRect(1286,720,200,100);
g.drawRect(1410,570,20,150);
g.drawOval(970,830,100,100);
g.drawOval(1170,830,100,100);
g.drawRect(1416,750,40,20);
g.drawRect(1110,645,150,150);
g.drawOval(1140,650,50,50);
g.drawRect(1160,701,10,15);
g.drawRect(1150,715,30,50);
g.drawRect(1140,765,80,30);
g.drawRect(1110,701,30,93);
g.drawRect(1234,730,25,20);
g.drawOval(1210,690,40,40);
g.drawLine(1180,727,1210,705);
g.drawLine(1180,747,1210,709);
g.drawRect(875,783,60,20);

//making bulidings
g.drawRect(50,50,200,340);
g.drawRect(250,20,300,370);
g.drawRect(550,175,400,215);
g.drawRect(950,75,400,315);
g.drawRect(1350,30,500,360);



//giving names
g.drawString("Dominos",1500,70);
g.drawString("Barber",90,100);
g.drawString("Police Station",1020,130);
g.drawString("Hotel",700,217);
g.drawString("Sip N Bite",300,60);
g.drawString("Bharat Petrolium",170,700);
g.drawString("TT cop.",943,687);

Thread.sleep(600);

//part2

//upper line
g.setColor(Color.white);
g.drawLine(0,930,1950,930);

//lowerline
g.drawLine(0,390,1950,390);

//making truck
g.drawRect(105,630,450,200);
g.drawOval(150,830,100,100);
g.drawOval(510,830,100,100);
g.drawRect(555,630,200,200);
g.drawRect(580,645,150,150);
g.drawOval(610,650,50,50);
g.drawRect(630,701,10,15);
g.drawRect(620,715,30,50);
g.drawRect(610,765,80,30);
g.drawRect(580,701,30,93);
g.drawRect(704,725,25,20);
g.drawOval(670,690,40,40);
g.drawLine(650,727,670,705);
g.drawLine(650,747,670,709);
g.drawRect(60,796,45,20);

//making 2nd truck
g.drawRoundRect(935,630,350,200,50,50);
g.drawRect(1286,720,200,100);
g.drawRect(1410,570,20,150);
g.drawOval(970,830,100,100);
g.drawOval(1170,830,100,100);
g.drawRect(1416,750,40,20);
g.drawRect(1110,645,150,150);
g.drawOval(1140,650,50,50);
g.drawRect(1160,701,10,15);
g.drawRect(1150,715,30,50);
g.drawRect(1140,765,80,30);
g.drawRect(1110,701,30,93);
g.drawRect(1234,730,25,20);
g.drawOval(1210,690,40,40);
g.drawLine(1180,727,1210,705);
g.drawLine(1180,747,1210,709);
g.drawRect(875,783,60,20);

//making bulidings
g.drawRect(50,50,200,340);
g.drawRect(250,20,300,370);
g.drawRect(550,175,400,215);
g.drawRect(950,75,400,315);
g.drawRect(1350,30,500,360);



//giving names
g.drawString("Dominos",1500,70);
g.drawString("Barber",90,100);
g.drawString("Police Station",1020,130);
g.drawString("Hotel",700,217);
g.drawString("Sip N Bite",300,60);
g.drawString("Bharat Petrolium",170,700);
g.drawString("TT cop.",943,687);

}
}
catch(Exception e){}
}
}
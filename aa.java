import java.applet.*;
import java.awt.*;
/*<applet code=aa.class height=800 width=1300>
</applet>*/
public class aa extends Applet
{
public void init()
{
Font f=new Font("Comic sans MS",Font.BOLD/Font.ITALIC,100);
setFont(f);
}

public void paint(Graphics g)

{
 // try
//{

// while(true)
//{
/*Color skyblue = new Color(135,206,235);
g.setColor(skyblue);
g.fillRect(0,0,1400,500);
g.setColor(Color.green);
g.fillRect(0,500,1400,300);

//making of stick
Color brown = new Color(169,64,19);
g.setColor(brown);
g.fillRect(250,450,20,100);

int x[]={210,250,270,230};
int y[]={400,450,450,400};
g.fillPolygon(x,y,4);


int i[]={260,250,270,280};
int j[]={400,450,450,400};
g.fillPolygon(i,j,4);


//to make angry bird
g.setColor(Color.red);
g.fillOval(80,450,80,80);

g.setColor(Color.yellow);
int k[]={130,120,170};
int l[]={490,510,510};
g.fillPolygon(k,l,3);

int m[]={130,120,150};
int n[]={520,510,510};
g.fillPolygon(m,n,3);

g.setColor(Color.white);//eyes formation
g.fillOval(105,475,15,15);
g.setColor(Color.white);
g.fillOval(125,475,15,15);

g.setColor(Color.black);
g.fillOval(115,480,8,8);
g.setColor(Color.black);
g.fillOval(125,480,8,8);

g.fillOval(120,425,10,30);
g.fillOval(110,425,10,30);

//rope formation

g.drawLine(80,500,240,410);
g.drawLine(156,470,280,410);

//making of boxes

g.setColor(brown);
g.fillRect(825,450,200,100);
g.fillRect(1050,450,200,100);

g.setColor(Color.white);
g.drawRect(850,475,150,50);
g.drawRect(1075,475,150,50);

g.setColor(Color.blue);
g.drawRect(875,500,100,25);
g.setColor(Color.yellow);
g.drawRect(1100,500,100,25);

//making balls

g.setColor(Color.red);
g.fillOval(900,400,50,50);

Color deeppink = new Color(255,20,147);
g.setColor(deeppink);
g.fillOval(1125,400,50,50);

//making planks
Color lightbrown = new Color(205,133,63);
g.setColor(lightbrown);

g.fillRect(825,375,20,75);
g.fillRect(1230,375,20,75);
g.fillRect(1020,375,40,75);

// horz. plank

g.fillRect(820,350,435,25);

//shapes
g.setColor(Color.blue);
g.fillRect(875,250,100,100);
g.setColor(Color.yellow);
g.fillRect(1125,250,100,100);

//horz.plank

g.setColor(lightbrown);
g.fillRect(950,230,200,20);

// shape
g.setColor(Color.black);
g.fillRect(1000,150,70,80);

g.setColor(Color.white);
g.fillOval(1000,80,70,70);

Color bl = new Color(25,25,112);
g.setColor(bl);
g.drawString("HURRRR !",150,150);

Thread.sleep(600);*/

//code part 2

g.setColor(skyblue);
g.fillRect(0,0,1400,500);
g.setColor(Color.green);
g.fillRect(0,500,1400,300);

//making of stick

g.setColor(brown);
g.fillRect(250,450,20,100);

int o[]={210,250,270,230};
int p[]={400,450,450,400};
g.fillPolygon(o,p,4);


int q[]={260,250,270,280};
int r[]={400,450,450,400};
g.fillPolygon(q,r,4);


//to make angry bird
g.setColor(Color.red);
g.fillOval(450,325,80,80);

g.setColor(Color.yellow);
int s[]={500,490,540};
int t[]={375,385,385};
g.fillPolygon(s,t,3);

int w[]={500,490,550};
int z[]={395,385,385};
g.fillPolygon(w,z,3);

g.setColor(Color.white);//eyes formation
g.fillOval(475,350,15,15);
g.setColor(Color.white);
g.fillOval(495,350,15,15);

g.setColor(Color.black);
g.fillOval(485,355,8,8);
g.setColor(Color.black);
g.fillOval(495,355,8,8);

g.fillOval(490,300,10,30);
g.fillOval(480,300,10,30);

//rope formation

g.drawLine(200,550,240,410);
g.drawLine(200,550,280,410);

//making of boxes

g.setColor(brown);
g.fillRect(825,450,200,100);
g.fillRect(1050,450,200,100);

g.setColor(Color.white);
g.drawRect(850,475,150,50);
g.drawRect(1075,475,150,50);

g.setColor(Color.blue);
g.drawRect(875,500,100,25);
g.setColor(Color.yellow);
g.drawRect(1100,500,100,25);

//making balls

g.setColor(Color.red);
g.fillOval(900,400,50,50);

g.setColor(deeppink);
g.fillOval(1125,400,50,50);

//making planks

g.setColor(lightbrown);

g.fillRect(825,375,20,75);
g.fillRect(1230,375,20,75);
g.fillRect(1020,375,40,75);

// horz. plank

g.fillRect(820,350,435,25);

//shapes
g.setColor(Color.blue);
g.fillRect(875,250,100,100);
g.setColor(Color.yellow);
g.fillRect(1125,250,100,100);

//horz.plank

g.setColor(lightbrown);
g.fillRect(950,230,200,20);
// shape
g.setColor(Color.black);
g.fillRect(1000,150,70,80);

g.setColor(Color.white);
g.fillOval(1000,80,70,70);

g.setColor(bl);
g.drawString("HURRRR !",450,150);

/*Thread.sleep(600);

//code part 3


g.setColor(skyblue);
g.fillRect(0,0,1400,500);
g.setColor(Color.green);
g.fillRect(0,500,1400,300);

//making of stick

g.setColor(brown);
g.fillRect(250,450,20,100);

int o1[]={210,250,270,230};
int p1[]={400,450,450,400};
g.fillPolygon(o1,p1,4);


int q1[]={260,250,270,280};
int r1[]={400,450,450,400};
g.fillPolygon(q1,r1,4);


//to make angry bird
g.setColor(Color.red);
g.fillOval(740,310,80,80);



g.setColor(Color.white);//eyes formation
g.fillOval(765,340,15,15);
g.setColor(Color.white);
g.fillOval(785,340,15,15);

g.setColor(Color.black);
g.fillOval(775,340,8,8);
g.setColor(Color.black);
g.fillOval(785,340,8,8);

g.fillOval(780,285,10,30);
g.fillOval(770,285,10,30);

//rope formation

g.drawLine(200,550,240,410);
g.drawLine(200,550,280,410);

//making of boxes

g.setColor(brown);
g.fillRect(825,450,200,100);
g.fillRect(1050,450,200,100);

g.setColor(Color.white);
g.drawRect(850,475,150,50);
g.drawRect(1075,475,150,50);

g.setColor(Color.blue);
g.drawRect(875,500,100,25);
g.setColor(Color.yellow);
g.drawRect(1100,500,100,25);

//making balls

g.setColor(Color.red);
g.fillOval(900,400,50,50);

g.setColor(deeppink);
g.fillOval(1125,400,50,50);

//making planks

g.setColor(lightbrown);

g.fillRect(825,375,20,75);
g.fillRect(1230,375,20,75);
g.fillRect(1020,375,40,75);

// horz. plank

g.fillRect(820,350,435,25);

//beaks
g.setColor(Color.yellow);
int s1[]={790,780,830};
int t1[]={360,370,370};
g.fillPolygon(s1,t1,3);

int w1[]={790,780,840};
int z1[]={380,370,370};
g.fillPolygon(w1,z1,3);

//shapes
g.setColor(Color.blue);
g.fillRect(875,250,100,100);
g.setColor(Color.yellow);
g.fillRect(1125,250,100,100);

//horz.plank

g.setColor(lightbrown);
g.fillRect(950,230,200,20);

// shape
g.setColor(Color.black);
g.fillRect(1000,150,70,80);

g.setColor(Color.white);
g.fillOval(1000,80,70,70);

//string print


Color orange = new Color(255,69,0);
g.setColor(orange);
g.drawString("bhoomm!!",350,150);
Thread.sleep(600);

//code part4

g.setColor(skyblue);
g.fillRect(0,0,1400,500);
g.setColor(Color.green);
g.fillRect(0,500,1400,300);

//making of stick

g.setColor(brown);
g.fillRect(250,450,20,100);

int x1[]={210,250,270,230};
int y1[]={400,450,450,400};
g.fillPolygon(x1,y1,4);


int i1[]={260,250,270,280};
int j1[]={400,450,450,400};
g.fillPolygon(i1,j1,4);


//to make angry bird
g.setColor(Color.red);
g.fillOval(1100,550,80,80);

g.setColor(Color.yellow);
int k1[]={1150,1140,1190};
int l1[]={590,610,610};
g.fillPolygon(k1,l1,3);

int m1[]={1150,1140,1170};
int n1[]={620,610,610};
g.fillPolygon(m1,n1,3);

g.setColor(Color.white);//eyes formation
g.fillOval(1125,575,15,15);
g.setColor(Color.white);
g.fillOval(1145,575,15,15);

g.setColor(Color.black);
g.fillOval(1135,580,8,8);
g.setColor(Color.black);
g.fillOval(1145,580,8,8);



//rope formation

g.drawLine(200,550,240,410);
g.drawLine(200,550,280,410);

//making of boxes

g.setColor(brown);
g.fillRect(825,450,200,100);
g.fillRect(1050,450,200,100);

g.setColor(Color.white);
g.drawRect(850,475,150,50);
g.drawRect(1075,475,150,50);

g.setColor(Color.blue);
g.drawRect(875,500,100,25);
g.setColor(Color.yellow);
g.drawRect(1100,500,100,25);

//head poppers
g.setColor(Color.black);
g.fillOval(1140,525,10,30);
g.fillOval(1130,525,10,30);

//making balls

g.setColor(Color.red);
g.fillOval(500,500,50,50);


g.setColor(deeppink);
g.fillOval(400,600,50,50);

//making planks

g.setColor(lightbrown);

g.fillRect(400,575,75,20);
g.fillRect(1200,430,75,20);
g.fillRect(1200,575,40,75);

// horz. plank

g.fillRect(600,600,435,25);

//shapes
g.setColor(Color.blue);
g.fillRect(700,425,100,100);
g.setColor(Color.yellow);
g.fillRect(825,500,100,100);

//horz.plank

g.setColor(lightbrown);
g.fillRect(600,550,200,20);

// shape
g.setColor(Color.black);
g.fillRect(900,550,70,80);

g.setColor(Color.white);
g.fillOval(50,580,70,70);

g.setColor(Color.black);
g.drawString(" 80 POINTS.. ",350,300);
Thread.sleep(6000);




}}
catch(Exception e)
{}

*/
}
}

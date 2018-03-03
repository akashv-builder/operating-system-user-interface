import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;



class screen6 extends JFrame implements ActionListener,Runnable
{
        
         String s1;

         JTextField t1;         

         JButton b1,b2,b3,b4,b5;
      
         JPopupMenu menu;
 
         JMenuItem m1,m2,r1,r2,m4,m5,m6;

         JMenu m3;
      
         ImageIcon i,i4;

         JLabel l;

         JLabel l1,l2,l3,l4,l5,l6;

         int second,minute,hour;

         

         

         

         public screen6()
{
        setLayout(null);

        Font f=new Font("Comic Mans MS",Font.BOLD,30);

        b1=new JButton("START");
        b1.setBounds(0,950,200,50);
        b1.setFont(f);
        b1.addActionListener(this);



        b2=new JButton("FILE MANAGER");
        b2.setBounds(600,950,300,50);
        b2.setFont(f);
        b2.addActionListener(this);
  
        b3=new JButton("INTERNET");
        b3.setBounds(900,950,300,50);
        b3.setFont(f);
        b3.addActionListener(this);
 
        i4=new ImageIcon("search1.gif");
        b4=new JButton(i4);
        b4.setBounds(500,950,100,50);
        b4.setFont(f);
        b4.setBackground(Color.red);
        b4.addActionListener(this);

        b5=new JButton("College Management System");
        b5.setBounds(0,950,200,50);
        b5.setFont(f);
        b5.addActionListener(this);

        t1=new JTextField("Search Apps....??",10);
        t1.setBackground(Color.orange);
        t1.setBounds(200,952,300,50);
        t1.setFont(f);


        i=new ImageIcon("6.jpg");
      


        l=new JLabel(i);
        l.setBounds(0,0,1900,952);

          
        
     
        menu=new JPopupMenu();


        Font f1=new Font("Comic Mans MS",Font.BOLD,80);
        
        
       
        m1=new JMenuItem("Clock");
       
        m1.setFont(f1);
        menu.add(m1);
       
        menu.addSeparator();
       
        m1.addActionListener(this);
       
        m2=new JMenuItem("Slide Show");
       
        m2.setFont(f1);
        menu.add(m2);

        menu.addSeparator();
        
       
        m2.addActionListener(this);
       
        m3=new JMenu("Power Off");
        
        m3.setFont(f1);
        menu.add(m3);
     
        menu.addSeparator();
       
        m3.addActionListener(this);

       
        r1=new JMenuItem("SHUT DOWN");
        r1.setFont(f);
        m3.add(r1);
        m3.addSeparator();
        r1.addActionListener(this);
        r2=new JMenuItem("SWITCH USER");
        r2.setFont(f);
        m3.add(r2);
        r2.addActionListener(this);
     
    
       
        m4=new JMenuItem("Notepad");
        
        m4.setFont(f1);
        menu.add(m4);
        menu.addSeparator();
       
        m4.addActionListener(this);

        m5=new JMenuItem("IP Address");
        m5.setFont(f1);
        m5.addActionListener(this);
        menu.add(m5);
        menu.addSeparator();

        m6=new JMenuItem("Change Background");
        m6.setFont(f1);
        m6.addActionListener(this);
        menu.add(m6);



        GregorianCalendar date=new GregorianCalendar();


          
           second=date.get(Calendar.SECOND);
           minute=date.get(Calendar.MINUTE);
           hour=date.get(Calendar.HOUR);

       
 

           l1=new JLabel(""+hour);
           l1.setFont(f1);
           l1.setBounds(755,0,200,100);
           l1.setForeground(Color.red);
           

           l2=new JLabel(""+minute);
           l2.setFont(f1);
           l2.setBounds(890,0,200,100);
           l2.setForeground(Color.red);
           
           l3=new JLabel(""+second);
           l3.setFont(f1);
           l3.setBounds(1020,0,200,100);
           l3.setForeground(Color.red);

           l4=new JLabel(":");
           l4.setFont(f1);
           l4.setBounds(850,0,200,100);
           l4.setForeground(Color.blue);
        
           l5=new JLabel(":");
           l5.setFont(f1);
           l5.setBounds(980,0,200,100);
           l5.setForeground(Color.blue);
        

          
          
           
           

           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);



         Date d=new Date();

         SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

         String s=sdf.format(d);

         l6=new JLabel(s);
         l6.setBounds(720,100,600,100);
         l6.setFont(f1);
         l6.setForeground(Color.red);
 
     

       

          
          add(l3);
          add(l4);
          add(l2);
          add(l5);
          add(l1);
          add(l6);
          
         
        

         add(l);
         add(b1);
         add(b2);
         add(b3);
         add(t1);
         add(b4);
add(b5);

         Thread t=new Thread(this);
         t.start();
       
        
        
       
}



        public void run()
{
         while(true)

{
         try

{        Thread.sleep(1000);

         

}


          catch(Exception e){}

          second=(second+1);

          if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);

          
          
          

          if(second>=60)
{
          minute=(minute+1);

          second=0;
           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);


        




          if(minute>=60)
{          
          hour=(hour+1);
          
          minute=0; 
      
          
           if(second<10)
          l3.setText("0"+second);
          else l3.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l1.setText("0"+hour);
          else l1.setText(""+hour);

        

}
}
          
}
}





          

         public void actionPerformed(ActionEvent ae)
{
         if(ae.getSource()==b1)
        
{        showPopup(ae);

}

         if(ae.getSource()==m1)

{        clock r=new clock();

       
         r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r.setSize(2000,2000);
         r.setVisible(true);
         r.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r.setTitle("CLOCK");
         this.dispose(); 

}


       
         if(ae.getSource()==b2)

{        computer r1=new computer();

       
         r1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r1.setSize(2000,2000);
         r1.setVisible(true); 
         r1.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r1.setTitle("MY COMPUTER");

         this.dispose();

}

         if(ae.getSource()==b3)

{        search r1=new search();

       
         r1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r1.setSize(2000,2000);
         r1.setVisible(true); 
         r1.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r1.setTitle("Search");

         this.dispose();

}

 if(ae.getSource()==b5)

{        splashscreen2 r1=new splashscreen2();

       
         r1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r1.setSize(2000,2000);
         r1.setVisible(true); 
         r1.setExtendedState(JFrame.MAXIMIZED_BOTH);

         this.dispose();

}

            if(ae.getSource()==b4)
{
            s1=t1.getText();

            int i=s1.length();
            
            if(i==0)
{          
           JOptionPane.showMessageDialog(null,"Enter Something To Search");
           t1.setText("");
           t1.requestFocus();
       

}

           else if(s1.equals("Search Apps....??"))
{        
           JOptionPane.showMessageDialog(null,"Enter Something To Search");
           t1.setText("");
           t1.requestFocus();
       


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
            JOptionPane.showMessageDialog(null,"Invalid Search,No Item Found");
            t1.setText("");
            t1.requestFocus();
       

       
          
}




         if(ae.getSource()==m2)

{

         imageviewer r=new imageviewer();

         r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r.setSize(2000,2000);
         r.setVisible(true); 
         r.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r.setTitle("IMAGE VIEWER");
         this.dispose();


}


         if(ae.getSource()==r1)
{
         System.exit(0);



}

        
         if(ae.getSource()==r2)
{


             screen1 ls=new screen1();

             ls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             ls.setSize(2000,2000);

             
             ls.setVisible(true);
             ls.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ls.setTitle("CHOOSE USER");
             this.dispose();


}




              if(ae.getSource()==m4)
{


             note ss=new note();

             ss.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             ss.setSize(2000,2000);

             
             ss.setVisible(true);
             ss.setExtendedState(JFrame.MAXIMIZED_BOTH);
             ss.setTitle("NOTEPAD");
             this.dispose();
        
             

             


} 

            if(ae.getSource()==m5)

{

         ip r=new ip();

         r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r.setSize(2000,2000);
         r.setVisible(true); 
         r.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r.setTitle("IP");
         this.dispose();


}

   


         if(ae.getSource()==m6)

{        wall r=new wall();

       
         r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         r.setSize(2000,2000);
         r.setVisible(true);
         r.setExtendedState(JFrame.MAXIMIZED_BOTH);
         r.setTitle("Change wallpaper");
         this.dispose(); 

}
        
}        
       

    
    
    
         public void showPopup(ActionEvent ae)
{
        
        
        
            menu.show(b1,300,500);

            
        
           

            menu.setLocation(0,312);
}
    
  

         public static void main(String args[])
{

         
         screen6 s=new screen6();
         s.setSize(2000,2000);
         s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         s.setVisible(true);
         s.setExtendedState(JFrame.MAXIMIZED_BOTH);
         s.setTitle("HOME SCREEN");
               
         

}

}
import java.util.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class hello2 extends JFrame
{
   
           

           JLabel l1,l2,l3,l4,l5;

           int second,minute,hour;

          

           
           public hello2()
{       

           setLayout(new FlowLayout());   

           

           GregorianCalendar date=new GregorianCalendar();


          
           second=date.get(Calendar.SECOND);
           minute=date.get(Calendar.MINUTE);
           hour=date.get(Calendar.HOUR);

          l1=new JLabel(""+hour);
          l2=new JLabel(""+minute);
          l3=new JLabel(""+second);
          l4=new JLabel(":");
          l5=new JLabel(":");
 


          if(second<10)
          l1.setText("0"+second);
          else l1.setText(""+second);
        

          if(minute<10)
          l2.setText("0"+minute);
          else l2.setText(""+minute);

          if(hour<10)
          l3.setText("0"+hour);
          else l3.setText(""+hour);

         
         
    

          

       

          add(l3);
          add(l4);
          add(l2);
          add(l5);
          add(l1);

      
          
}

         public static void main(String args[])
       
{  

          
         hello2 s=new hello2();


          while(true)
{
	         
          
         

          try

{        Thread.sleep(1000);

         

}


          catch(Exception e){}

          s.second=(s.second+1);

   {       if(s.second<10)
          s.l1.setText("0"+s.second);
          else s.l1.setText(""+s.second);
        

          if(s.minute<10)
          s.l2.setText("0"+s.minute);
          else s.l2.setText(""+s.minute);

          if(s.hour<10)
          s.l3.setText("0"+s.hour);
          else s.l3.setText(""+s.hour);

}         

          

          

         
         

          
          
          

          if(s.second>=59)

{         s.minute=(s.minute+1);

          s.second=0;
          
          
         

          if(s.second<10)
          s.l1.setText("0"+s.second);
          else s.l1.setText(""+s.second);
        

          if(s.minute<10)
          s.l2.setText("0"+s.minute);
          else s.l2.setText(""+s.minute);

          if(s.hour<10)
          s.l3.setText("0"+s.hour);
          else s.l3.setText(""+s.hour);

         
}
        




          if(s.minute>=59)
         
{          s.hour=(s.hour+1);
          
          s.minute=0; 
      
           if(s.second<10)
          s.l1.setText("0"+s.second);
          else s.l1.setText(""+s.second);
        

          if(s.minute<10)
          s.l2.setText("0"+s.minute);
          else s.l2.setText(""+s.minute);

          if(s.hour<10)
          s.l3.setText("0"+s.hour);
          else s.l3.setText(""+s.hour);

         
}

          if(s.hour>24)
{        
          s.hour=0;
          s.minute=0;
          s.second=0;
          
           if(s.second<10)
          s.l1.setText("0"+s.second);
          else s.l1.setText(""+s.second);
        

          if(s.minute<10)
          s.l2.setText("0"+s.minute);
          else s.l2.setText(""+s.minute);

          if(s.hour<10)
          s.l3.setText("0"+s.hour);
        
}
   

          

      
          s.setSize(2000,2000);
          s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          s.setVisible(true);
          
}
}
}


     

    
          



        
          

      

        


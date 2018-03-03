import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
 
public class note extends JFrame implements ActionListener

{
           JButton b;

           JTextArea textArea;
 
           JMenuBar mb; 
	   JMenu file,edit,help;
	
	   JMenuItem openFile,saveFile,close,cut,copy,paste,undo,onlineHelp,aboutNotepad;   
           ImageIcon i1;
 
	    public note() 

{           setLayout(null);

            getContentPane().setBackground(Color.pink);
            Font f=new Font("Arial Black",Font.BOLD,50);
 
          
            onlineHelp=new JMenuItem("ONLINE HELP");
            onlineHelp.setFont(f);
            aboutNotepad=new JMenuItem("ABOUT NOTEPAD");
            aboutNotepad.setFont(f);
            cut=new JMenuItem("CUT");
            cut.setFont(f);
            copy=new JMenuItem("COPY");
            copy.setFont(f);
            paste=new JMenuItem("PASTE");
            paste.setFont(f);
    	    undo=new JMenuItem("UNDO");
   	    undo.setFont(f);

   	    cut.addActionListener(this);
    	    copy.addActionListener(this);
            paste.addActionListener(this);
     	    undo.addActionListener(this); 
            aboutNotepad.addActionListener(this);
            onlineHelp.addActionListener(this);


            textArea = new JTextArea();
            textArea.setBounds(0,100,2000,960);
  
             edit=new JMenu("EDIT");
             edit.setFont(f);
             help=new JMenu("HELP");
             help.setFont(f);
             help.addActionListener(this); 


             edit.add(cut);
             edit.add(copy);
             edit.add(paste);
             edit.add(undo);
            
             help.add(onlineHelp);
             help.add(aboutNotepad);

   
  



            mb = new JMenuBar(); 
            mb.setBounds(0,0,2000,100);

	    file = new JMenu("FILE"); 
            file.setFont(f);
	
	    openFile = new JMenuItem("OPEN FILE"); 
            openFile.setFont(f);  
            openFile.addActionListener(this); 
            saveFile = new JMenuItem("SAVE FILE");
            saveFile.setFont(f);
            saveFile.addActionListener(this);  
	    close = new JMenuItem("CLOSE FILE"); 
            close.setFont(f);
            close.addActionListener(this); 


 
		
            textArea.setFont(new Font("Century Gothic",Font.BOLD,30));


          i1=new ImageIcon("back.gif");


          b=new JButton(i1);
          b.setBounds(1500,700,149,58);
          b.addActionListener(this);

         add(b);
		
		
 
		
                file.add(openFile);
                file.add(saveFile);
                file.add(close);

                
                mb.add(file);
                mb.add(edit);
                mb.add(help);


                add(mb);
     
                add(textArea);

               
		
 
}
 
	       public void actionPerformed (ActionEvent ae) 

{
		
		if (ae.getSource() ==close)
			
                this.dispose();
 
		
		
                else if (ae.getSource()==openFile) 

{
			JFileChooser open = new JFileChooser();  
			int option = open.showOpenDialog(this); 
			
			if (option==JFileChooser.APPROVE_OPTION) 

{
		        this.textArea.setText(""); 
				

                        try 

{
				
			Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while (scan.hasNext())
						
                        this.textArea.append(scan.nextLine() + "\n");
				
}                       catch (Exception ex)
{ 


		        System.out.println(ex.getMessage());
}
}
}
 
		
		         else if (ae.getSource()==saveFile) 
{
			JFileChooser save = new JFileChooser(); 
			
                        int option = save.showSaveDialog(this); 
			
			if (option==JFileChooser.APPROVE_OPTION) 

{
		        try

{
					
			BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
			out.write(this.textArea.getText());
			out.close(); 
				
} 
                        catch (Exception ex) 
{
		        System.out.println(ex.getMessage());

}
}
}                         

                        
			if(ae.getSource()==cut)
{
                        textArea.cut();
                         

}
			

     		        if(ae.getSource()==paste)
{
                        textArea.paste();


}
			

   		        if(ae.getSource()==copy)
{
                        textArea.copy();

}
			

     		        if(ae.getSource()==undo)
{
                        try
{                   //    undo.undo();
}

                        catch(Exception e)
{             
                        e.printStackTrace();

}




}

                    if(ae.getSource()==onlineHelp)

{
		    JOptionPane.showMessageDialog(null,"FOR MORE INFORMATION VISIT WWW.MICROSOFTNOTEPAD.COM");



}


               
                    if(ae.getSource()==aboutNotepad)

{
		    JOptionPane.showMessageDialog(null,"A PRODUCT OF AWESOME AKKU");



}
                  if(ae.getSource()==b)
{                 screen6 r=new screen6();

       
                  r.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                  r.setSize(2000,2000);
                  r.setVisible(true); 
                  r.setExtendedState(JFrame.MAXIMIZED_BOTH);
                  r.setTitle("HOME SCREEN");
                  this.dispose();
}    
   

                    

}

  
	                

                        public static void main(String[] args) 
		
{                       note s=new note();

     		        s.setSize(2000,2000);
   		        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  		        s.setVisible(true);
                        s.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        s.setTitle("NOTEPAD");
        


}


}



 
 



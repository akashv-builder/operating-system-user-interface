import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.tree.*;

public class folders extends JFrame implements ActionListener 
{
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JButton back;
	JTextField tf;
	Font t=new Font("Batang",Font.BOLD,18);
	JTree tree;
	ImageIcon ic1,ic2,ic3;
	JScrollPane jsp;
	int i,j;
	Font f1=new Font("Forte",Font.BOLD,20);
	public folders()
	{
		setLayout(null);
		getContentPane().setBackground(Color.white);
		//setContentPane(new JLabel(new ImageIcon("v.jpg")));
		ic1=new ImageIcon("folderimage.jpg");
		b1=new JButton(ic1);
		b1.setBounds(300,100,200,200);
		add(b1);
		b1.addActionListener(this);
		b2=new JButton(ic1);
		b2.setBounds(600,100,200,200);
		add(b2);
		b2.addActionListener(this);
		b3=new JButton(ic1);
		b3.setBounds(900,100,200,200);
		add(b3);
		b3.addActionListener(this);
		l1=new JLabel("Pictures");
		l1.setBounds(350,220,200,200);
		l1.setForeground(Color.black);
		l1.setFont(t);
		add(l1);
		l2=new JLabel("Audios");
		l2.setBounds(650,220,200,200);
		l2.setFont(t);
		add(l2);
		l3=new JLabel("Files");
		l3.setBounds(950,220,200,200);
		l3.setFont(t);
		add(l3);
		tf=new JTextField();
		tf.setText("My Computer->New Volume(A:)->");
        tf.setFont(t);
		ImageIcon imageicon=new ImageIcon("back.jpg");
		back=new JButton(imageicon);
		back.setMargin(new Insets(0, 0, 0, 0));
		back.setBounds(10,10,40,40);
                back.addActionListener(this);
		tf.setBounds(300,10,800,40);
		add(back);
		add(tf);
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("MY Computer");
		DefaultMutableTreeNode a=new DefaultMutableTreeNode("New Volume(A:)");
		top.add(a);
		DefaultMutableTreeNode pictures=new DefaultMutableTreeNode("pictures");
		a.add(pictures);
		DefaultMutableTreeNode jimage1=new DefaultMutableTreeNode("image1");
		DefaultMutableTreeNode jimage2=new DefaultMutableTreeNode("image2");
		DefaultMutableTreeNode jimage3=new DefaultMutableTreeNode("image3");
		DefaultMutableTreeNode jimage4=new DefaultMutableTreeNode("image4");
		DefaultMutableTreeNode jimage5=new DefaultMutableTreeNode("image5");
		DefaultMutableTreeNode jimage6=new DefaultMutableTreeNode("image6");
		DefaultMutableTreeNode jimage7=new DefaultMutableTreeNode("image7");
		DefaultMutableTreeNode jimage8=new DefaultMutableTreeNode("image8");
		pictures.add(jimage1);
		pictures.add(jimage2);
		pictures.add(jimage3);
		pictures.add(jimage4);
		pictures.add(jimage5);
		pictures.add(jimage6);
		pictures.add(jimage7);
		pictures.add(jimage8);
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("New Volume(B:)");
		top.add(b);
		tree=new JTree(top);
		jsp=new JScrollPane(tree);
		jsp.setBounds(0,100,250,700);
		add(jsp);
		//tree.addSelectionListener(new TreeSelectionListener() {
		//public void valueChanged(TreeSelectionEvent tse) {
		//} 
		//}
		//);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			{
				
			driver1 j=new driver1();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("PICTURE FOLDER");
			j.setBackground(Color.black);
			j.setVisible(true);
                        this.dispose();	
					
			}
		
		if(ae.getSource()==b2)
			{
				
			audios j=new audios();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("AUDIO FOLDER");
			j.setVisible(true);
                        this.dispose();	
					
			}
			
		if(ae.getSource()==b3)
			{
				
				
					
			}
      
                 if(ae.getSource()==back)
{                computer j=new computer();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("MY COMPUTER");
			j.setVisible(true);
                        this.dispose();

}
		
	}
	public static void main(String args[])
	{
		folders	j=new folders();
		j.setExtendedState(JFrame.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		j.setTitle("FOLDERS");
		j.setVisible(true);
	}
}








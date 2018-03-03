import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.tree.*;

public class computer extends JFrame implements ActionListener 
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
	public computer()
	{
		setLayout(null);
		getContentPane().setBackground(Color.white);
		//setContentPane(new JLabel(new ImageIcon("v.jpg")));
		ic1=new ImageIcon("drivera.jpg");
		ic2=new ImageIcon("driverb.jpg");
		ic3=new ImageIcon("driverc.jpg");
		b1=new JButton(ic1);
		b1.setBounds(300,100,320,70);
		b1.setMargin(new Insets(0, 0, 0, 0));
		add(b1);
		b1.addActionListener(this);
		b2=new JButton(ic2);
		b2.setBounds(650,100,320,70);
		b2.setMargin(new Insets(0, 0, 0, 0));
		add(b2);
		
		b2.addActionListener(this);
		b3=new JButton(ic3);
		b3.setBounds(1000,100,320,70);
		b3.setMargin(new Insets(0, 0, 0, 0));
		add(b3);
		b3.addActionListener(this);
		tf=new JTextField();
		tf.setText("My Computer->");
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
				
			folders	j=new folders();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("New Volume(A:)");
			j.setVisible(true);
                        j.setTitle("FOLDERS");
                        this.dispose();
					
			}
		
		if(ae.getSource()==b2)
			{
			
					
			}
			

                       if(ae.getSource()==b3)
			{
			
					
			}
		if(ae.getSource()==back)
			{
                        screen6 j1=new screen6();
			j1.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j1.setTitle("HOME SCREEN");
			j1.setVisible(true);
                        this.dispose();




			}
		
	}
	public static void main(String args[])
	{
		computer j=new computer();
		j.setExtendedState(JFrame.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setTitle("My Computer");
		j.setVisible(true);
	}
}








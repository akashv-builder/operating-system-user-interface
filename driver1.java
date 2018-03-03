import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.tree.*;

public class driver1 extends JFrame implements ActionListener 
{
	JButton[] button=new JButton[9];
	JLabel[] name=new JLabel[9];
	JPanel p1,p2,p3;
	JButton back;
	JTextField tf;
	Font t=new Font("Batang",Font.BOLD,18);
	JTree tree;
	String imgs[]={"image1.jpg","image2.jpg","image3.jpg","image4.jpg","image5.jpg","image6.jpg","image7.jpg","image8.jpg"};
	ImageIcon ic;
	JScrollPane jsp;
	int i,j;
	Font f1=new Font("Forte",Font.BOLD,20);
	public driver1()
	{
		setLayout(null);
		getContentPane().setBackground(Color.white);
		//setContentPane(new JLabel(new ImageIcon("v.jpg")));
		p1=new JPanel(new GridLayout(5,5));
		for(i=0;i<=3;i++)
		{
			ic=new ImageIcon(imgs[i]);
			button[i]=new JButton(ic);
			button[i].setMargin(new Insets(0, 0, 0, 0));
			button[i].addActionListener(this);
			
			p1.add(button[i]);
			
		}
		for(j=0;j<=3;j++)
		{
			name[j]=new JLabel(imgs[j]);
			name[j].setFont(f1);
			p1.add(name[j]);
		
		}
		for(i=4;i<=7;i++)
		{
			ic=new ImageIcon(imgs[i]);
			button[i]=new JButton(ic);
			button[i].setMargin(new Insets(0, 0, 0, 0));
			button[i].addActionListener(this);
			p1.add(button[i]);
		}
		for(j=4;j<=7;j++)
		{
			name[j]=new JLabel(imgs[j]);
			name[j].setFont(f1);
			p1.add(name[j]);
		
		}
		p1.setBackground(Color.white);
		p1.setBounds(500,100,700,700);
		add(p1);
		
		p2=new JPanel();
		
		tf=new JTextField();
		tf.setText("My Computer->New Volume(A:)->Pictures->");
        tf.setFont(t);
		ImageIcon imageicon=new ImageIcon("back.jpg");
		back=new JButton(imageicon);
		back.setMargin(new Insets(0, 0, 0, 0));
		back.setBounds(10,10,40,40);
                back.addActionListener(this);
		tf.setBounds(300,10,800,40);
		add(back);
		add(tf);
		p2.setBounds(0,0,1400,100);
		p2.setBackground(Color.blue);
		add(p2);
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
		p3=new JPanel();
		p3.setBounds(0,100,200,700);
		add(jsp);
		
		//tree.addSelectionListener(new TreeSelectionListener() {
		//public void valueChanged(TreeSelectionEvent tse) {
		//} 
		//}
		//);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		for(i=0;i<=7;i++)
		{
			if(ae.getSource()==button[i])
				{
					String loc=""+i;
					setLayout(null);
					openimage j=new openimage(loc);
					
				}
		}

                  if(ae.getSource()==back)

                 {       folders j=new folders();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("FOLDERS");
			j.setVisible(true);
                        this.dispose();
	}
}
	public static void main(String args[])
	{
		driver1 j=new driver1();
		j.setExtendedState(JFrame.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		j.setTitle("PICTURE FOLDER");
		j.setBackground(Color.black);
		j.setVisible(true);
	}
}








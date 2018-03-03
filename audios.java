import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.tree.*;

public class audios extends JFrame implements ActionListener 
{
	JButton[] button=new JButton[9];
	JLabel[] name=new JLabel[9];
	JPanel p1,p2,p3;
	JButton back;
	JTextField tf;
	Font t=new Font("Batang",Font.BOLD,18);
	JTree tree;
	String audios[]={"audio1.jpg","audio2.jpg","audio3.jpg","audio4.jpg"};
	ImageIcon ic;
	JScrollPane jsp;
	int i,j;
	Font f1=new Font("Forte",Font.BOLD,20);
	public audios()
	{
		setLayout(null);
		setBackground(Color.white);
		//setContentPane(new JLabel(new ImageIcon("v.jpg")));
			ic=new ImageIcon("audioimage.jpg");
			button[1]=new JButton(ic);
			button[1].setMargin(new Insets(0, 0, 0, 0));
			button[1].addActionListener(this);
			button[1].setBounds(300,100,200,200);
			add(button[1]);
			button[2]=new JButton(ic);
			button[2].setMargin(new Insets(0, 0, 0, 0));
			button[2].addActionListener(this);
			button[2].setBounds(600,100,200,200);
			add(button[2]);
			button[3]=new JButton(ic);
			button[3].setMargin(new Insets(0, 0, 0, 0));
			button[3].addActionListener(this);
			button[3].setBounds(900,100,200,200);
			add(button[3]);
			p1=new JPanel();
		
		
			
			name[1]=new JLabel(audios[1]);
			name[1].setFont(f1);
			add(name[1]);
			name[1].setBounds(300,300,200,100);
			name[2]=new JLabel(audios[2]);
			name[2].setFont(f1);
			add(name[2]);
			name[2].setBounds(600,300,200,100);
			name[3]=new JLabel(audios[3]);
			name[3].setFont(f1);
			add(name[3]);
			name[3].setBounds(900,300,200,100);
			name[3].setForeground(Color.black);
		
		
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
		
		add(jsp);
		
		//tree.addSelectionListener(new TreeSelectionListener() {
		//public void valueChanged(TreeSelectionEvent tse) {
		//} 
		//}
		//);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		for(i=0;i<=3;i++)
		{
			if(ae.getSource()==button[i])
				{	
		
					String loc=""+i;
					setLayout(null);
					audioplay j=new audioplay(loc);
					
				}
		}


               if(ae.getSource()==back)
{

              	/*	folders j=new folders();
			j.setExtendedState(JFrame.MAXIMIZED_BOTH);
			j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			j.setTitle("FOLDERS");
			j.setVisible(true);
                        this.dispose();*/

}

	}
	public static void main(String args[])
	{
		audios j=new audios();
		j.setExtendedState(JFrame.MAXIMIZED_BOTH);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		j.setTitle("AUDIO FOLDER");
		j.setVisible(true);
	}
}








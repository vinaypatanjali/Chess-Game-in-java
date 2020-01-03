package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;

class ChessLogin
{
	JFrame jfrm;
	JLabel jl1,jl2,jl3;
	JButton jb;
	JTextField jtf1,jtf2;
	public static String nplayer1,nplayer2;
	
	
	public ChessLogin()
	{
		jfrm=new JFrame("Chess Game");
	
jfrm.setLayout(new BorderLayout());
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jfrm.setSize(400,400);

JPanel jp=new JPanel(new GridLayout(3,3));

jb=new JButton("Play");

jl1=new JLabel("Player 1: ");
jl2=new JLabel("Player 2: ");
jl3=new JLabel("CREATED BY VINAY PATANJALI,\n ROLLNO 19576");

jtf1=new JTextField("",40);
jtf2=new JTextField("",40);

jb.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent a)
{
	nplayer1=jtf1.getText();
	nplayer2=jtf2.getText();
	new ChessGame();
	jfrm.dispose();
}	
}
);


jp.add(jl1);
jp.add(jtf1);
jp.add(jl2);
jp.add(jtf2);
jp.add(jl3);
jfrm.add(jp,BorderLayout.CENTER);
jfrm.add(jb,BorderLayout.SOUTH);
jfrm.setVisible(true);

	}
	
	public static void main(String a[])
	{
		new ChessLogin();
	}
	
}
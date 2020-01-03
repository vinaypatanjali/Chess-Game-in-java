package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;
import java.io.*;

//bug 1:queen giving check and mate whether there is a piece or not in between
//bug 2 : if any pawn goes inside other player than it cant be converted
public class ChessGame extends MouseAdapter
{
	
	JFrame jfrm;
	static JButton jb[][]=new JButton[8][8];
	static JLabel l[]=new JLabel[64];
	static JLabel turn= new JLabel("Player 1 turn : black");
	static JLabel check= new JLabel("Check");
	static String players="Player 1: "+ChessLogin.nplayer1+"  ||  Player 2: "+ChessLogin.nplayer2;
	static JLabel play= new JLabel(players);
	static JButton myButton,current,restart,instr;
	String s=null;
	static ImageIcon ii[]=new ImageIcon[10];
	static ImageIcon ii1[]=new ImageIcon[10];
	JPanel jp,jp1,jp2,jp3,jp4;
	static int sum=0;
	static int x=0,y=0,i1=0,i2=0,j2=0,j1=0,pselect=0,count=0,isWhite=0,player1=1,isBlack=0,isbetween=0;
	
	
public ChessGame()
{
	
		
jfrm=new JFrame("Chess");
	
jfrm.setLayout(new BorderLayout());
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jfrm.setSize(900,900);


			//for black icons
			for(int i=0;i<10;i++)
			{
				ii[i]=new ImageIcon("C:/Users/pvina/Documents/Java Programs/ChessV/chess icons/c"+(i+1)+".png");
			}
			
			//for white icons
			for(int i=0;i<10;i++)
			{
				ii1[i]=new ImageIcon("C:/Users/pvina/Documents/Java Programs/ChessV/chess icons/w"+(i+1)+".png");
			}
			
			

jp=new JPanel(new GridLayout(8,8));
jp1=new JPanel(new FlowLayout());
jp2=new JPanel(new GridLayout());
jp3=new JPanel(new GridLayout());

jp4=new JPanel();
jp4.setLayout(null);

for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{

			//s=""+(sum+1);
			//sum+=1;

				jb[i][j]=new JButton();
				

			jp.add(jb[i][j]);
			jb[i][j].addMouseListener(this);
			}
		}
		
		
		for(int i=0;i<8;i++)
		{
		for(int j=0;j<8;j++)
			jb[i][j].setOpaque(true);
		}
		
		
		for(int i=0;i<8;i++)
		{
			
			if((i+1)%2==0)
			{
		for(int j=0;j<8;j++){
			if((j+1)%2!=0)
				jb[i][j].setBackground(Color.BLACK);
		}
				
			}
			else
			{
				for(int j=0;j<8;j++)
				{
			if((j+1)%2==0)
				jb[i][j].setBackground(Color.BLACK);
		}
			}
				
				
		}
		
		
		//for black player 1st line
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<8;j++)
			{
				
			if(j%2==0)
				{
			jb[i][j].setIcon(ii[j]);
			
				}
			else 
			{
				jb[i][j].setIcon(ii[j]);
			}
			}
		}
		
		//for black player 2nd line
		for(int i=1;i<2;i++)
		{
			for(int j=0;j<8;j++)
			{
				
			if(j%2==0)
				{
			jb[i][j].setIcon(ii[8]);
				}
			else 
			{
				jb[i][j].setIcon(ii[9]);
			}
			}
		}
		
		
		//for white player 1st line
		for(int i=6;i<7;i++)
		{
			for(int j=0;j<8;j++)
			{
				
			if(j%2==0)
				{
			jb[i][j].setIcon(ii1[8]);
				}
			else 
			{
				jb[i][j].setIcon(ii1[9]);
			}
			}
		}
		
		//for white player 2nd line
		for(int i=7;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				
			if(j%2==0)
				{
			jb[i][j].setIcon(ii1[j]);
				}
			else 
			{
				jb[i][j].setIcon(ii1[j]);
			}
			}
		}
		
		JLabel jlabel=new JLabel(" ( CREATED BY VINAY PATANJALI, ROLL NO 19576 )");
		
		jp1.add(jlabel);
		
		for(int i=0;i<64;i++)
		l[i]=new JLabel();
		l[0].setText("\nOut pieces here...");
			for(int i=0;i<10;i++)
		jp1.add(l[i]);
		
		
		
		
		restart=new JButton("RESTART");
		restart.addMouseListener(this);
		check.setOpaque(true);
		
		instr=new JButton("Instructions");
		instr.addMouseListener(this);
		instr.setOpaque(true);
		
		instr.addActionListener(new  ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try{
				File file=new File("C:\\Users\\pvina\\Documents\\Java Programs\\ChessV\\Instructions.docx");
				Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
       
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,""+e);
					
				}
			}
		});
		
		//jp2.add(jlabel);
		jp2.add(turn);
		jp2.add(check);
		jp2.add(play);
		jp2.add(instr);
		jp2.add(restart);
		
		
	jfrm.add(jp,BorderLayout.CENTER);	
	jfrm.add(jp1,BorderLayout.SOUTH);	
	jfrm.add(jp2,BorderLayout.NORTH);	

jfrm.pack();
jfrm.setVisible(true);
}

public void mouseClicked(MouseEvent e)
{
	if(pselect==0){
	check.setText("Check");
	check.setBackground(null);
	myButton = (JButton)e.getSource();
	
	//Icon icon=myButton.getIcon();
	for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
		{
			if(jb[i][j]==myButton)
			{
				i1=i;
				j1=j;
			}
		}
		}
		

		
	if(myButton.getIcon()==ii[9]||myButton.getIcon()==ii[8]||myButton.getIcon()==ii1[8]||myButton.getIcon()==ii1[9])
	{
		pselect=1;
	}
	else if(myButton.getIcon()==ii[0]||myButton.getIcon()==ii[7]||myButton.getIcon()==ii1[0]||myButton.getIcon()==ii1[7])
	{
		pselect=2;
	}
	else if(myButton.getIcon()==ii[1]||myButton.getIcon()==ii[6]||myButton.getIcon()==ii1[1]||myButton.getIcon()==ii1[6])
	{
		pselect=3;
	}
	else if(myButton.getIcon()==ii[2]||myButton.getIcon()==ii[5]||myButton.getIcon()==ii1[2]||myButton.getIcon()==ii1[5])
	{
		pselect=4;
	}
	else if(myButton.getIcon()==ii[3]||myButton.getIcon()==ii1[3])
	{
		pselect=5;
	}
	else if(myButton.getIcon()==ii[4]||myButton.getIcon()==ii1[4])
	{
		pselect=6;
	}
	}
	//pawn
	else if(pselect==1)
	{
		current=(JButton) e.getSource();
		
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");
		
		
		isWorB();
		
		//System.out.println("isWhite: "+isWhite);
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
		{
			if(jb[i][j]==current)
			{
				i2=i;
				j2=j;
			}
		}
		}
		
			if((i2+1)<8&&(j2+1)<8&&(j2-1)>-1&&(jb[i2+1][j2+1].getIcon()==ii1[4]||jb[i2+1][j2-1].getIcon()==ii1[4])&&isWhite==1)
	{
		check.setText("Player 1: Check and Mate.");
		check.setBackground(Color.YELLOW);
	}
	
	if((i2-1)>-1&&(j2+1)<8&&(j2-1)>-1&&(jb[i2-1][j2+1].getIcon()==ii[4]||jb[i2-1][j2-1].getIcon()==ii[4])&&isWhite==0)
	{
		check.setText("Player 2: Check and Mate.");
		check.setBackground(Color.ORANGE);
	}
	
		
		
		Pawn.pawn(current,myButton);
		
	}
	//rook
	else if(pselect==2)
	{
		current=(JButton) e.getSource();
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");
		
		
		isWorB();
		
		isKingSafe();
		
		
		
		Rook.rook(current,myButton);
		
	}
	//knight
	else if(pselect==3)
	{
		current=(JButton) e.getSource();
		isWorB();
		
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");
		
		isWorB();
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
		{
			if(jb[i][j]==current)
			{
				i2=i;
				j2=j;
			}
		}
		}
		
			if((i2+1)<8&&(j2+1)<8&&(i2-1)>-1&&(j2-2)>-1&&(i2-2)>-1&&(j2+2)<8&&(i2+2)<8&&(j2-1)>-1&&(jb[i2+2][j2-1].getIcon()==ii1[4]||jb[i2+2][j2+1].getIcon()==ii1[4]||jb[i2+1][j2+2].getIcon()==ii1[4]||jb[i2+1][j2-2].getIcon()==ii1[4]||jb[i2-2][j2+1].getIcon()==ii1[4]||jb[i2-2][j2-1].getIcon()==ii1[4]||jb[i2-1][j2+2].getIcon()==ii1[4]||jb[i2-1][j2-2].getIcon()==ii1[4])&&isBlack==1)
	{
		check.setText("Player 1: Check and Mate.");
		check.setBackground(Color.YELLOW);
	}
	
	else if((i2+1)<8&&(j2+1)<8&&(j2-1)>-1&&(i2-1)>-1&&(j2-2)>-1&&(i2-2)>-1&&(j2+2)<8&&(i2+2)<8&&(jb[i2+2][j2-1].getIcon()==ii[4]||jb[i2+2][j2+1].getIcon()==ii[4]||jb[i2+1][j2+2].getIcon()==ii[4]||jb[i2+1][j2-2].getIcon()==ii[4]||jb[i2-2][j2+1].getIcon()==ii[4]||jb[i2-2][j2-1].getIcon()==ii[4]||jb[i2-1][j2+2].getIcon()==ii[4]||jb[i2-1][j2-2].getIcon()==ii[4])&&isBlack==0)
	{
		check.setText("Player 2: Check and Mate.");
		check.setBackground(Color.ORANGE);
	}
		
		isWorB();
		Knight.knight(current,myButton);
		
	}
	//bishop
	else if(pselect==4)
	{
		current=(JButton) e.getSource();
		
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");
		
		isWorB();
		
		isKingSafe();
		
		
		
		Bishop.bishop(current,myButton);
		
	}
	//queen
	else if(pselect==5)
	{
		current=(JButton) e.getSource();
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");
		
		isWorB();
		
	isKingSafe();
		
		
		
		
		
		Queen.queen(current,myButton);
		
	}
	//king
	else if(pselect==6)
	{
		current=(JButton) e.getSource();
		
		if(player1==1)
			turn.setText("Player 2 turn: WHITE");
		else
			turn.setText("Player 1 turn: BLACK");


		
		isWorB();
		King.king(current,myButton);
		
	}
	
	
	if(e.getSource()==restart)
	{
		clear();
	}
	
}





int isWorB()
{
	for(int i=0;i<10;i++)
	{
		if(current.getIcon()==ii1[i])
		{
			isWhite=1;
			break;
		}
		else
			isWhite=0;
	}
	
	
	for(int i=0;i<10;i++)
	{
		if(myButton.getIcon()==ii[i])
		{
			isBlack=1;
			break;
		}
		else
			isBlack=0;
	}
	return isWhite;
}

void clear()
{
	jfrm.dispose();
		new ChessGame();
}


void isKingSafe()
{
	//rook
	
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
		{
			if(jb[i][j]==current)
			{
				i2=i;
				j2=j;
			}
		}
		}
		
		if(pselect==2){
		//rook player 2
		for(int i=0;i<8;i++)
		{
		if(isBlack==0)
		{
		System.out.println("isvlack=0");
			if((i2-i)>-1&&jb[i2-i][j2].getIcon()==ii[4])
			{System.out.println("isiconbetween=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&jb[i2-j][j2].getIcon()!=null&&jb[i2-j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&jb[i2][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-i)>-1&&jb[i2][j2-i].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&jb[i2][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&jb[i2][j2+j].getIcon()!=null&&jb[i2][j2+j].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2+i)<8&&jb[i2+i][j2].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((i2+j)<8&&jb[i2+j][j2].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
		}
		else if(isBlack==1)
		{
		System.out.println("isvlack"+isBlack);
			if((i2-i)>-1&&jb[i2-i][j2].getIcon()==ii1[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&jb[i2-j][j2].getIcon()!=null&&jb[i2-j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&jb[i2][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-i)>-1&&jb[i2][j2-i].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&jb[i2][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&jb[i2][j2+j].getIcon()!=null&&jb[i2][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2+i)<8&&jb[i2+i][j2].getIcon()==ii1[4])
			{System.out.println("in i2+i");
				for(int j=1;j<8;j++)
				{
				if((i2+j)<8&&jb[i2+j][j2].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
		}
			}
	
	
			
			
			
		
		
		
		for(int i=0;i<8;i++)
		{
					
			if((i2+i)<8&&(j2+i)<8&&(i2-i)>-1&&(j2-i)>-1&&isbetween==0)
			{
			isbetween=0;
			if((jb[i2+i][j2].getIcon()==ii[4]||jb[i2][j2+i].getIcon()==ii[4]||jb[i2-i][j2].getIcon()==ii[4]||jb[i2][j2-i].getIcon()==ii[4])&&isBlack==0)
	{
		check.setText("Player 2: Check and Mate.");
		check.setBackground(Color.YELLOW);
		break;
	}
	
	else if((jb[i2+i][j2].getIcon()==ii1[4]||jb[i2][j2+i].getIcon()==ii1[4]||jb[i2-i][j2].getIcon()==ii1[4]||jb[i2][j2-i].getIcon()==ii1[4])&&isBlack==1)
	{
		check.setText("Player 1: Check and Mate.");
		check.setBackground(Color.ORANGE);
		break;
	}
	
	
			}
			
	
		}
}
		
		//bishop
		else if(pselect==4)
	{
		
		for(int i=0;i<8;i++)
		{
		if(isBlack==0)
		{
		System.out.println("isvlack"+isBlack);
			if((i2-i)>-1&&(j2-i)>-1&&jb[i2-i][j2-i].getIcon()==ii[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&(j2-j)>-1&&jb[i2-j][j2-j].getIcon()!=null&&jb[i2-j][j2-j].getIcon()!=ii[4])
					{
						System.out.println("1isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&(i2+i)<8&&jb[i2+i][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-j)>-1&&(i2+j)<8&&jb[i2+j][j2-j].getIcon()!=null&&jb[i2+j][j2-j].getIcon()!=ii[4])
					{
						System.out.println("2isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&(i2+i)<8&&jb[i2+i][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&(i2+j)<8&&jb[i2+j][j2+j].getIcon()!=null&&jb[i2+j][j2+j].getIcon()!=ii[4])
					{
						System.out.println("3isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2-i)>-1&&(j2+i)<8&&jb[i2-i][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((i2-j)>-1&&(j2+j)<8&&jb[i2-j][j2+j].getIcon()!=null&&jb[i2-j][j2+j].getIcon()!=ii[4])
					{
						System.out.println("4he;;o isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
		}
		else if(isBlack==1)
		{
		System.out.println("isvlack"+isBlack);
			if((i2-i)>-1&&(j2-i)>-1&&jb[i2-i][j2-i].getIcon()==ii1[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&(j2-j)>-1&&jb[i2-j][j2-j].getIcon()!=null&&jb[i2-j][j2-j].getIcon()!=ii1[4])
					{
						System.out.println("1isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&(i2+i)<8&&jb[i2+i][j2-i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-j)>-1&&(i2+j)<8&&jb[i2+j][j2-j].getIcon()!=null&&jb[i2+j][j2-j].getIcon()!=ii1[4])
					{
						System.out.println("2isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&(i2+i)<8&&jb[i2+i][j2+i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&(i2+j)<8&&jb[i2+j][j2+j].getIcon()!=null&&jb[i2+j][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("3isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2-i)>-1&&(j2+i)<8&&jb[i2-i][j2+i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((i2-j)>-1&&(j2+j)<8&&jb[i2-j][j2+j].getIcon()!=null&&jb[i2-j][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("4he;;o isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
			}
		
		}
		
		
		
		
		//condition for check and mate
		for(int i=0;i<8;i++){
			System.out.println("in for");
		if(((i2+i)<8&&(j2+i)<8&&ii[4]==jb[i2+i][j2+i].getIcon()||(i2+i)<8&&(j2-i)>-1&&ii[4]==jb[i2+i][j2-i].getIcon()||(i2-i)>-1&&(j2+i)<8&&ii[4]==jb[i2-i][j2+i].getIcon()||(i2-i)>-1&&(j2-i)>-1&&ii[4]==jb[i2-i][j2-i].getIcon())&&isBlack==0&&isbetween==0)
		{System.out.println("in for bishop player2");
			check.setText("Player 2: Check and Mate.");
		check.setBackground(Color.ORANGE);
		}
		else if(((i2+i)<8&&(j2+i)<8&&ii1[4]==jb[i2+i][j2+i].getIcon()||(i2+i)<8&&(j2-i)>-1&&ii1[4]==jb[i2+i][j2-i].getIcon()||(i2-i)>-1&&(j2+i)<8&&ii1[4]==jb[i2-i][j2+i].getIcon()||(i2-i)>-1&&(j2-i)>-1&&ii1[4]==jb[i2-i][j2-i].getIcon())&&isBlack==1&&isbetween==0)
		{System.out.println("in for bishop player1");
			check.setText("Player 1: Check and Mate.");
		check.setBackground(Color.YELLOW);
		}
		}
		
	}
	
	
			
		
		if(pselect==5)
		{
		//queen
		for(int i=0;i<8;i++)
		{
		if(isBlack==0)
		{
		System.out.println("isvlack=0");
			if((i2-i)>-1&&jb[i2-i][j2].getIcon()==ii[4])
			{System.out.println("isiconbetween=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&jb[i2-j][j2].getIcon()!=null&&jb[i2-j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&jb[i2][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-i)>-1&&jb[i2][j2-i].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&jb[i2][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&jb[i2][j2+j].getIcon()!=null&&jb[i2][j2+j].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2+i)<8&&jb[i2+i][j2].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((i2+j)<8&&jb[i2+j][j2].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			//System.out.println("isvlack"+isBlack);
			else if((i2-i)>-1&&(j2-i)>-1&&jb[i2-i][j2-i].getIcon()==ii[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&(j2-j)>-1&&jb[i2-j][j2-j].getIcon()!=null&&jb[i2-j][j2-j].getIcon()!=ii[4])
					{
						System.out.println("1isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&(i2+i)<8&&jb[i2+i][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-j)>-1&&(i2+j)<8&&jb[i2+j][j2-j].getIcon()!=null&&jb[i2+j][j2-j].getIcon()!=ii[4])
					{
						System.out.println("2isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&(i2+i)<8&&jb[i2+i][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&(i2+j)<8&&jb[i2+j][j2+j].getIcon()!=null&&jb[i2+j][j2+j].getIcon()!=ii[4])
					{
						System.out.println("3isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2-i)>-1&&(j2+i)<8&&jb[i2-i][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((i2-j)>-1&&(j2+j)<8&&jb[i2-j][j2+j].getIcon()!=null&&jb[i2-j][j2+j].getIcon()!=ii[4])
					{
						System.out.println("4he;;o isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
		}
		else if(isBlack==1)
		{
		System.out.println("isvlack"+isBlack);
			if((i2-i)>-1&&jb[i2-i][j2].getIcon()==ii1[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&jb[i2-j][j2].getIcon()!=null&&jb[i2-j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&jb[i2][j2-i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-i)>-1&&jb[i2][j2-i].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&jb[i2][j2+i].getIcon()==ii[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&jb[i2][j2+j].getIcon()!=null&&jb[i2][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2+i)<8&&jb[i2+i][j2].getIcon()==ii1[4])
			{System.out.println("in i2+i");
				for(int j=1;j<8;j++)
				{
				if((i2+j)<8&&jb[i2+j][j2].getIcon()!=null&&jb[i2+j][j2].getIcon()!=ii1[4])
					{
						System.out.println("isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			//System.out.println("isvlack"+isBlack);
			else if((i2-i)>-1&&(j2-i)>-1&&jb[i2-i][j2-i].getIcon()==ii1[4])
			{System.out.println("isiconking=1");
				for(int j=1;j<8;j++)
				{
					if((i2-j)>-1&&(j2-j)>-1&&jb[i2-j][j2-j].getIcon()!=null&&jb[i2-j][j2-j].getIcon()!=ii1[4])
					{
						System.out.println("1isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}

					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2-i)>-1&&(i2+i)<8&&jb[i2+i][j2-i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((j2-j)>-1&&(i2+j)<8&&jb[i2+j][j2-j].getIcon()!=null&&jb[i2+j][j2-j].getIcon()!=ii1[4])
					{
						System.out.println("2isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((j2+i)<8&&(i2+i)<8&&jb[i2+i][j2+i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((j2+j)<8&&(i2+j)<8&&jb[i2+j][j2+j].getIcon()!=null&&jb[i2+j][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("3isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			else if((i2-i)>-1&&(j2+i)<8&&jb[i2-i][j2+i].getIcon()==ii1[4])
			{for(int j=1;j<8;j++)
				{
				if((i2-j)>-1&&(j2+j)<8&&jb[i2-j][j2+j].getIcon()!=null&&jb[i2-j][j2+j].getIcon()!=ii1[4])
					{
						System.out.println("4he;;o isbetween=1 i2: "+i2+" j2: "+j2+" j: "+j);
						isbetween=1;
						break;
					}
					else 
					{System.out.println("isbetween=0");
						isbetween=0;
					}
				}
			}
			
			if(isbetween==1)
				break;
		}
			}
	
	
			
			
			
		
		
		
		for(int i=0;i<8;i++){
		if(((i2+i)<8&&ii[4]==jb[i2+i][j2].getIcon()||(j2+i)<8&&ii[4]==jb[i2][j2+i].getIcon()||(j2-i)>-1&&ii[4]==jb[i2][j2-i].getIcon()||(i2-i)>-1&&ii[4]==jb[i2-i][j2].getIcon()||(i2+i)<8&&(j2+i)<8&&ii[4]==jb[i2+i][j2+i].getIcon()||(i2-i)>-1&&(j2-i)>-1&&ii[4]==jb[i2-i][j2-i].getIcon()||(i2-i)>-1&&(j2+i)<8&&ii[4]==jb[i2-i][j2+i].getIcon()||(i2+i)<8&&(j2-i)>-1&&ii[4]==jb[i2+i][j2-i].getIcon())&&isBlack==0&&isbetween==0)
		{
			check.setText("Player 2: Check and Mate.");
		check.setBackground(Color.ORANGE);
		}
		else if(((i2+i)<8&&ii1[4]==jb[i2+i][j2].getIcon()||(j2+i)<8&&ii1[4]==jb[i2][j2+i].getIcon()||(j2-i)>-1&&ii1[4]==jb[i2][j2-i].getIcon()||(i2-i)>-1&&ii1[4]==jb[i2-i][j2].getIcon()||(i2+i)<8&&(j2+i)<8&&ii1[4]==jb[i2+i][j2+i].getIcon()||(i2-i)>-1&&(j2-i)>-1&&ii1[4]==jb[i2-i][j2-i].getIcon()||(i2-i)>-1&&(j2+i)<8&&ii1[4]==jb[i2-i][j2+i].getIcon()||(i2+i)<8&&(j2-i)>-1&&ii1[4]==jb[i2+i][j2-i].getIcon())&&isBlack==1&&isbetween==0)
		{
			check.setText("Player 1: Check and Mate.");
		check.setBackground(Color.YELLOW);
		}
		}
}
		
		isbetween=0;
		
	

}


public static void main(String args[])
{
	new ChessGame();
}
}
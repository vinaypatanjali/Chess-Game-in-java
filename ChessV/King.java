package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;


public class King extends ChessGame
{
	static public void king(JButton current,JButton myButton)
	{
		pselect=0;
		
		
		
	if(player1==1)
	{
		player1=0;
	if(current.getIcon()==null)
	{

			player1=0;
	if((i1+1)<8&&current==jb[i1+1][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
	
	}
	else if((j1+1)<8&&current==jb[i1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
	
	}
	else if((j1-1)>-1&&current==jb[i1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
		else if((i1-1)>-1&&current==jb[i1-1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1+1)<8&&current==jb[i1+1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
	
		
	}
	else if((i1+1)<8&&(j1-1)>-1&&current==jb[i1+1][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		

	}
	//moving backward
	else if((i1-1)>-1&&(j1+1)<8&&current==jb[i1-1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
		
	}
	else if((i1-1)>-1&&(j1-1)>-1&&current==jb[i1-1][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
	
	}
	else 
		player1=1;
	

	}
	else if(current.getIcon()!=null&&isWhite==1)
	{
			player1=0;
	if((i1+1)<8&&current==jb[i1+1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((j1+1)<8&&current==jb[i1][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
		else if((j1-1)>-1&&current==jb[i1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
		else if((i1-1)>-1&&current==jb[i1-1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	
	}
	else if((i1+1)<8&&(j1+1)<8&&current==jb[i1+1][j1+1])
	{
		
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
		else if((i1-1)>-1&&(j1-1)>-1&&current==jb[i1-1][j1-1])
	{
		
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
		else if((i1-1)>-1&&(j1+1)<8&&current==jb[i1-1][j1+1])
	{
		
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
		else if((i1+1)<8&&(j1-1)>-1&&current==jb[i1+1][j1-1])
	{
		
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=1;

	}
		
	}
	else
		player1=1;
	}
	
	
	
	//player2 rook
	else if(player1==0)
	{
		player1=1;
	if(current.getIcon()==null)
	{

	if((i1+1)<8&&current==jb[i1+1][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((j1+1)<8&&current==jb[i1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
	
	}
	else if((j1-1)>-1&&current==jb[i1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	
	}
		else if((i1-1)>-1&&current==jb[i1-1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if((i1+1)<8&&(j1+1)<8&&current==jb[i1+1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1-1)>-1&&current==jb[i1+1][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	//moving forward
	else if((i1-1)>-1&&(j1+1)<8&&current==jb[i1-1][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-1)>-1&&(j1-1)>-1&&current==jb[i1-1][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
		else
	{
		player1=0;
		JOptionPane.showMessageDialog(null,"Cant move here");
		
	}
	
		
	
	}
	else if(current.getIcon()!=null&&isWhite==0)
	{

	if((i1+1)<8&&current==jb[i1+1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	
	}
	else if((j1+1)<8&&current==jb[i1][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	
	}
		else if((j1-1)>-1&&current==jb[i1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	
	}
		else if((i1-1)>-1&&current==jb[i1-1][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if(current.getIcon()!=null&&isWhite==0)
	{
	if((i1+1)<8&&(j1+1)<8&&current==jb[i1+1][j1+1])	
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else if((i1-1)>-1&&(j1-1)>-1&&current==jb[i1-1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else if((i1-1)>-1&&(j1+1)<8&&current==jb[i1-1][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else if((i1+1)<8&&(j1-1)>-1&&current==jb[i1+1][j1-1])
	{
	l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
else
player1=0;	
	}
	else
	{
		player1=0;
		JOptionPane.showMessageDialog(null,"Cant move here");
	
	}
	}
	}
	}
}
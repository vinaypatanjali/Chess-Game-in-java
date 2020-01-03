package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;


public class Knight extends ChessGame
{
	static public void knight(JButton current,JButton myButton)
	{
		pselect=0;
		
	
		
		
		
	if(player1==1)
	{
		player1=0;
	
	if(current.getIcon()==null)
	{
		//moving front
	if((i1+2)<8&&(j1-1)>-1&&current==jb[i1+2][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+2)<8&&(j1+1)<8&&current==jb[i1+2][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else if((i1+1)<8&&(j1+2)<8&&current==jb[i1+1][j1+2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1-2)>-1&&current==jb[i1+1][j1-2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}//moving backward
	else if((i1-2)>-1&&(j1+1)<8&&current==jb[i1-2][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-2)>-1&&(j1-1)>-1&&current==jb[i1-2][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else if((i1-1)>-1&&(j1+2)<8&&current==jb[i1-1][j1+2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-1)>-1&&(j1-2)>-1&&current==jb[i1-1][j1-2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else
	{
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=1;
	}
	}
	else if(current.getIcon()!=null&&isWhite==1)
	{
		if((i1+2)<8&&(j1-1)>-1&&current==jb[i1+2][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1+2)<8&&(j1+1)<8&&current==jb[i1+2][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if((i1+1)<8&&(j1+2)<8&&current==jb[i1+1][j1+2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1-2)>-1&&current==jb[i1+1][j1-2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}//moving backward
	else if((i1-2)>-1&&(j1+1)>8&&current==jb[i1-2][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1-2)>-1&&(j1-1)>-1&&current==jb[i1-2][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if((i1-1)>-1&&(j1+2)<8&&current==jb[i1-1][j1+2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1-1)>-1&&(j1-2)>-1&&current==jb[i1-1][j1-2])
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
	}
	
	
	//for player 2
	else if(player1==0)
	{
		player1=1;
	
	if(current.getIcon()==null)
	{
		//moving BACKWARD player 2
	if((i1-2)>-1&&(j1+1)<8&&current==jb[i1-2][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-2)>-1&&(j1-1)>-1&&current==jb[i1-2][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else if((i1-1)>-1&&(j1+2)<8&&current==jb[i1-1][j1+2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-1)>-1&&(j1-2)>-1&&current==jb[i1-1][j1-2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}//moving forwRD player2
	else if((i1+2)<8&&(j1+1)<8&&current==jb[i1+2][j1+1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+2)<8&&(j1-1)>-1&&current==jb[i1+2][j1-1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else if((i1+11)<8&&(j1+2)<8&&current==jb[i1+1][j1+2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1-2)>-1&&current==jb[i1+1][j1-2])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);

	}
	else
	{
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=0;
	}
	}
else if((current.getIcon()!=null)&&isWhite==0)
	{

		if((i1+2)<8&&(j1-1)>-1&&current==jb[i1+2][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1+2)<8&&(j1+1)<8&&current==jb[i1+2][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if((i1+1)<8&&(j1+2)<8&&current==jb[i1+1][j1+2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1+1)<8&&(j1-2)>-1&&current==jb[i1+1][j1-2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}//moving backward
	else if((i1-2)>-1&&(j1+1)>8&&current==jb[i1-2][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1-2)>-1&&(j1-1)>-1&&current==jb[i1-2][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else if((i1-1)>-1&&(j1+2)<8&&current==jb[i1-1][j1+2])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		
	}
	else if((i1-1)>-1&&(j1-2)>-1&&current==jb[i1-1][j1-2])
	{
	l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);

	}
	else
	{
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=0;
	}
	}
	else
		player1=0;
	}
	}
}
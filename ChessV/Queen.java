package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;


public class Queen extends ChessGame
{
	static public void queen(JButton current,JButton myButton)
	{
		pselect=0;

	if(player1==1)
	{
		player1=0;
		for(int i=0;i<8;i++)
		{player1=0;
	if(current.getIcon()==null)
	{
		
	if((i1+i)<8&&current==jb[i1+i][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((j1+i)<8&&current==jb[i1][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((j1-i)>-1&&current==jb[i1][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&current==jb[i1-i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1+i)<8&&current==jb[i1+i][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
		
	}
	else if((i1+i)<8&&(j1-i)>-1&&current==jb[i1+i][j1-i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;

	}
	//moving backward
	else if((i1-i)>-1&&(j1+i)<8&&current==jb[i1-i][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
		
	}
	else if((i1-i)>-1&&(j1-i)>-1&&current==jb[i1-i][j1-i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else
	{
		//JOptionPane.showMessageDialog(null,"Cant move here");
		player1=1;
	}
	
		}

	else if(current.getIcon()!=null&&isWhite==1)
	{

	if((i1+i)<8&&current==jb[i1+i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((j1+i)<8&&current==jb[i1][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		else if((j1-i)>-1&&current==jb[i1][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		else if((i1-i)>-1&&current==jb[i1-i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1+i)<8&&current==jb[i1+i][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&(j1-i)>-1&&current==jb[i1-i][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&(j1+i)<8&&current==jb[i1-i][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1-i)>-1&&current==jb[i1+i][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else
	{
		player1=1;
	}
		
		
	}
	else
		player1=1;
		}
	
	}
	
	
	
	//player2 queen
	else if(player1==0)
	{
		player1=1;
		for(int i=1;i<8;i++)
		{player1=1;
	if(current.getIcon()==null)
	{
		
	if((i1+i)<8&&current==jb[i1+i][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((j1+i)<8&&current==jb[i1][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((j1-i)>-1&&current==jb[i1][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		else if((i1-i)>-1&&current==jb[i1-i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		//moving BACKWARD player 2
	else if((i1+i)<8&&(j1+i)<8&&current==jb[i1+i][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1-i)>-1&&current==jb[i1+i][j1-i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	//moving forward
	else if((i1-i)>-1&&(j1+i)<8&&current==jb[i1-i][j1+i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&(j1-i)>-1&&current==jb[i1-i][j1-i])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		break;
	}
	else
	{
		//JOptionPane.showMessageDialog(null,"Cant move here");
		player1=0;
	}

	}
	else if(current.getIcon()!=null&&isWhite==0)
	{

	if((i1+i)<8&&current==jb[i1+i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((j1+i)<8&&current==jb[i1][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		else if((j1-i)>-1&&current==jb[i1][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
		else if((i1-i)>-1&&current==jb[i1-i][j1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1+i)<8&&current==jb[i1+i][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&(j1-i)>-1&&current==jb[i1-i][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1-i)>-1&&(j1+i)<8&&current==jb[i1-i][j1+i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else if((i1+i)<8&&(j1-i)>-1&&current==jb[i1+i][j1-i])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
		break;
	}
	else
	{
		player1=0;
	}
		
	}
	else
		player1=0;
		}
	}
	}
}
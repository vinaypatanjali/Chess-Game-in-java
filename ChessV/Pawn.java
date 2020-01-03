package ChessV;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.*;


public class Pawn extends ChessGame
{
	static public void pawn(JButton current,JButton myButton)
	{
		pselect=0;
		//System.out.println("isWhite: "+isWhite);
		
		
	if(player1==1)
	{
		
		//turn.setText("Player 2 turn: WHITE");
	
	
	
	player1=0;
	if(current.getIcon()==null)
	{
	if((i1+1)<8&&current==jb[i1+1][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1+2)<8&&current==jb[i1+2][j1])
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
	else if(isWhite==1&&current.getIcon()!=null)
	{
		//System.out.println("iswhite:"+isWhite);
	
	if((j1+1)<8&&current==jb[i1+1][j1+1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else if((j1-1)>-1&&(i1+1)<8&&current==jb[i1+1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else
	{
		//System.out.println("In else");
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=1;
	}
	}
	else
	{
		System.out.println("player 1:isWhite: "+isWhite);
		System.out.println("i1:"+(i1)+"j1:"+(j1));
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=1;
	}
	
	}
	
	
	//for player 2
	else if(player1==0)
	{
		player1=1;
	//turn.setText("Player 1 turn: BLACK");
	if(current.getIcon()==null)
	{
	if((i1-1)<8&&current==ChessGame.jb[i1-1][j1])
	{
		current.setIcon(myButton.getIcon());
		myButton.setIcon(null);
		
	}
	else if((i1-2)>-1&&current==ChessGame.jb[i1-2][j1])
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
	else if(current.getIcon()!=null&&isWhite==0)
	{
		
//System.out.println("in else if iswhite:"+isWhite);
	if((i1-1)>-1&&(j1-1)>-1&&current==jb[i1-1][j1-1])
	{
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else if((j1+1)<8&&(i1-1)>-1&&current==jb[i1-1][j1+1])
	{
	System.out.println();	
		l[count].setIcon(current.getIcon());
		current.setIcon(myButton.getIcon());
		count++;
		
		myButton.setIcon(null);
	}
	else
	{
		
		System.out.println("In else player 2");
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=0;
	}
	}
	else
	{
		System.out.println("in else");
		JOptionPane.showMessageDialog(null,"Cant move here");
		player1=0;
	}
	}
	}
}
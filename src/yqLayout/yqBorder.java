package yqLayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class yqBorder extends JFrame{
	public yqBorder(){
		super();
		//
		Container myContainer=getContentPane();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		//
		p1.add(new Button());p1.setSize(10,10);
		p2.add(new Button());
		p3.add(new Button());
		p4.add(new Button());
		p5.add(new Button());
		//
		setLayout(new BorderLayout());
		myContainer.add(p1,BorderLayout.CENTER);
		/*myContainer.add(p2);
		myContainer.add(p1,BorderLayout.SOUTH);
		myContainer.add(p1,BorderLayout.WEST);
		myContainer.add(p1,BorderLayout.EAST);*/
		//myContainer.add(new Button(),BorderLayout.NORTH);
		myContainer.add(new Button(),BorderLayout.NORTH);
		myContainer.add(new Button(),BorderLayout.SOUTH);
		myContainer.add(new Button(),BorderLayout.WEST);
		myContainer.add(new Button(),BorderLayout.EAST);
		//
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args){
		new yqBorder();
	}
	
}

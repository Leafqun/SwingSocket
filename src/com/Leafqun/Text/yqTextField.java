package com.Leafqun.Text;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class yqTextField extends JFrame{
	public yqTextField(){
		//super();
		//define container and Panel
		Container myContainer=getContentPane();
		JPanel panel1=new JPanel();
		JScrollPane sp=new JScrollPane();
		JPanel button=new JPanel();
		//define components
		final JTextField jft=new JTextField("Leafqun",100);
		final JButton jb=new JButton("clear");
		final JTextArea jta=new JTextArea();
		
		//action
		jft.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jft.setText("´¥·¢ÊÂ¼þ");
			}
		});
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jft.setText("");
				jft.requestFocus();
			}
		});
		
		//set property
		//button.add(jb);
		sp.setSize(400,100);
		button.setSize(50,25);
		setSize(400,300);
		setVisible(true);
		//set layout
		sp.add(jta);
		panel1.add(jft);
		button.add(jb);
		setLayout(new BorderLayout(5,5)); 
		//myContainer.add(sp,BorderLayout.NORTH);
		myContainer.add(panel1,BorderLayout.CENTER);
		myContainer.add(button,BorderLayout.SOUTH);
	
	}
}

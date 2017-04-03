package com.Leafqun.qq;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class clientFrame extends JFrame{
	public JTextArea ta=new JTextArea();
	public JTextField tf=new JTextField();
	//BufferedWriter bw;
	//BufferedReader br;
	public clientFrame(){
		//container
		super("Client");
		Container myContainer=getContentPane();
		JScrollPane myPane=new JScrollPane(ta);
		//component
		//component add into container
		myContainer.add(myPane);
		myContainer.add(tf,BorderLayout.SOUTH);
		//layout
		//properties
		setBounds(500,0,500,400);
		setVisible(true);	
	}
	public void show(String s){
		ta.append("服务端："+s+"\n");
		System.out.println("服务端："+s);
	}
	/*public String showOnClient(){
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s=tf.getText();
				ta.append("我:"+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
		return s;
	}*/
	public static void main(String[] args){
		new clientFrame();
	}
}

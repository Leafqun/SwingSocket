package com.Leafqun.qq.muti;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class serverFrame1 extends JFrame{
	public JTextArea ta=new JTextArea();
	public JTextField tf=new JTextField();
	BufferedWriter bw;
	BufferedReader br;
	public serverFrame1(){
		//container
		super("Server1");
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
		ta.append("客户端："+s+"\n");
		System.out.println("客户端："+s);
	}
	public static void main(String[] args){
		new serverFrame1();
	}
}

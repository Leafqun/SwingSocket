package com.Leafqun.qq;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class serverFrame extends JFrame{
	private JTextArea ta=new JTextArea();
	//private JTextField tf=new JTextField();
	BufferedWriter bw;
	BufferedReader br;
	public serverFrame(){
		//container
		super("Server");
		Container myContainer=getContentPane();
		JScrollPane myPane=new JScrollPane(ta);
		//component
		//component add into container
		myContainer.add(myPane);
		//myContainer.add(tf,BorderLayout.SOUTH);
		//layout
		//properties
		setBounds(500,0,500,400);
		setVisible(true);	
	}
	public void show(String s){
		ta.append("�ͻ��ˣ�"+s+"\n");
		System.out.println("�ͻ��ˣ�"+s);
	}
	public static void main(String[] args){
		new serverFrame();
	}
}

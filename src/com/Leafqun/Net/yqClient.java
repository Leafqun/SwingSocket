package com.Leafqun.Net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class yqClient extends JFrame{
	private BufferedReader reader;
	private PrintWriter writer;
	String text="yq";
	Socket socket;
	private JTextArea ta=new JTextArea();
	private JTextField tf=new JTextField();
	public yqClient(String title){
		super(title);
		setLayout(new BorderLayout());
		Container myContainer=getContentPane();
		final JScrollPane myScrollPane=new JScrollPane(ta);
		//myScrollPane.setViewport(ta);
		myContainer.add(myScrollPane);
		myContainer.add(tf,BorderLayout.SOUTH);
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				writer.println(tf.getText());
				ta.append("我:"+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			    ta.append(text);
			   }

		});
		setSize(400,200);
		setVisible(true);
	}

	 void connect(){
		ta.append("尝试连接\n");
		try{
			socket=new Socket("localhost",8888);
			writer=new PrintWriter(socket.getOutputStream(),true);
			writer.write("\n");
			ta.append("完成连接\n");
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){text=reader.readLine();}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	 public static void main(String[] args){
			yqClient clien=new yqClient("Leafqun`s server");
			clien.connect();
		}
}

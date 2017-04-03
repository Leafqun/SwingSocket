package com.Leafqun.Net;

import java.awt.*;
import java.io.*;
import java.net.*;

import javax.swing.*;



public class yqServer extends JFrame{
	private BufferedReader reader;
	private BufferedWriter bw;
	private ServerSocket server;
	private Socket socket;
	private JTextArea jta=new JTextArea();
	String text="yq";
	public yqServer(){
		//container
		Container myContainer=getContentPane();
		JScrollPane myPane=new JScrollPane(jta);
		//component
		//component add into container
		myContainer.add(myPane);
		//layout
		
		//properties
		setSize(500,400);
		setVisible(true);
		/*Container myContainer=getContentPane();
		JTextArea text=new JTextArea();
		JScrollPane myScrollPane=new JScrollPane(text);
		myContainer.add(myScrollPane);
		setBounds(500,500,500,250);
		setVisible(true);*/
		
	}
	void getserver(){
		try{
			server=new ServerSocket(8888);
			System.out.println("Socket created successfully");
			
			while(true){
				System.out.println("waiting for client");
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			    bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				getClientMessage();
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	void getClientMessage(){
		try{
			while(true){
				text=reader.readLine();
				bw.write(text+"\n");
				System.out.println("客户端:"+reader.readLine());
				jta.append("客户端:"+reader.readLine()+'\n');
		   }
		}catch(Exception e){
			e.printStackTrace();
		}
		/*try{
			if(reader!=null){
				reader.close();
			}
			if(socket!=null){
				socket.close();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}*/
	}
	public static void main(String[] args){
		yqServer tcp=new yqServer();
		tcp.getserver();
	}
}

package com.Leafqun.Net;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

import javax.swing.*;

public class myServer extends JFrame{
	private JTextArea jta=new JTextArea();
	BufferedWriter bw;
	BufferedReader br;
	public myServer(){
		super("Server");
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
		
	}
	void getServer()throws Exception{
		//������������ָ���˿�
		ServerSocket server=new ServerSocket(8888);
		System.out.println("a client established ! ! ! !");
		jta.append("a client established ! ! ! !");
		//���ܿͻ������� ����ʽ
		while(true){
		Socket socket=server.accept();
		jta.append("���ڽ��ܿͻ�������");
		//��������
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		jta.append(br.readLine());
		System.out.println("Client:"+br.readLine());
		//��������
		bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.write(br.readLine());
		bw.newLine();
		//bw.newLine();
		}
	}
	public static void main(String[] args) throws Exception{
		myServer s =new myServer();
		s.getServer();
	}
}

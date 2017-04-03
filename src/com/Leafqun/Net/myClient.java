package com.Leafqun.Net;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class myClient extends JFrame{
	private JTextArea jta=new JTextArea();
	private JTextField tf=new JTextField();
	BufferedWriter bw;
	BufferedReader br;
	public myClient(){
		//container
		super("Client");
		Container myContainer=getContentPane();
		JScrollPane myPane=new JScrollPane(jta);
		//component
		//component add into container
		myContainer.add(myPane);
		myContainer.add(tf,BorderLayout.SOUTH);
		//layout
				
		//properties
		setBounds(500,0,500,400);
		setVisible(true);	
		//
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					bw.write(tf.getText()+"\n");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jta.append("��:"+tf.getText()+'\n');
				jta.setSelectionEnd(jta.getText().length());
				tf.setText("");
			}
		});
	}
	void createSocket()throws Exception{
		jta.append("��������");
		Socket socket=new Socket("localhost",8888);
		jta.append("�������");
		
		//��������
		bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		bw.newLine();
		//bw.write(msg);
		//bw.newLine();
		//��������
		while(true){
		br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String echo=br.readLine();
		System.out.println("�����:"+echo);
		jta.append("�����:"+echo);
		}
		
	}
	public static void main(String[] args)throws Exception{
		//�����ͻ��ˣ�ָ���������Ͷ˿�
		myClient c=new myClient();
		c.createSocket();
	}
}

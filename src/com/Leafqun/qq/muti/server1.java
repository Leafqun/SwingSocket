package com.Leafqun.qq.muti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.Leafqun.qq.SSocket;
import com.Leafqun.qq.server;


public class server1 extends serverFrame1{
	public SSocket ss;
	public JTextArea ta;
	public JTextField tf;
	
	public server1(){
		super();
		ss=new SSocket();
		ta=super.ta;
		tf=super.tf;
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ss.sendData(tf.getText());
				ta.append("Œ“:"+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
	}
	public void receive(){
		show(ss.acceptData());
	}
	public void connection(){
		ss.acceptClientConnection();
	}
	public static void main(String[] args){
		server1 s=new server1();
		String str=null;
		while(true){
			s.connection();
			while(true){
				s.receive();
			}
		}
	}
}

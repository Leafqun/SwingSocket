package com.Leafqun.qq;

import java.awt.event.*;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class client extends clientFrame{
	private CSocket cc;
	public JTextArea ta;
	public JTextField tf;
	
	public client(){
		super();
		tf=super.tf;
		ta=super.ta;
		cc=new CSocket();
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cc.sendData(tf.getText());
				ta.append("Œ“:"+tf.getText()+'\n');
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
	}
	public void receive(){
		show(cc.acceptData());
	}
	public static void main(String[] args){
		client c=new client();
		while(true){
			c.receive();
		}
	}
}

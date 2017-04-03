package com.Leafqun.yqFrame;

import java.awt.*;
import javax.swing.*;

public class yqScrollPane extends JFrame{
	public yqScrollPane(String title){
		super(title);
		Container myContainer=getContentPane();
		JTextArea text=new JTextArea();
		JScrollPane myScrollPane=new JScrollPane(text);
		myContainer.add(myScrollPane);
		setBounds(500,500,500,250);
		setVisible(true);
	}
}

package com.Leafqun.yqFrame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class yqFrame extends JFrame{
	//JFrame----Window is made up of Container and elements(×é¼þ)
	public yqFrame(String content){
		super(content);//Instantiate a JFrame object
		Container myContainer=this.getContentPane();//Obtain a container
		JLabel myLabel=new JLabel("Hello World");//Create a label as a element
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);//Make the text centered on the label 
		//myContainer.add(myLabel);//Add label into container
		JButton myButton=new JButton("yqButton");
		myButton.setBounds(0,0,100,50);
		myButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new yqDialog(yqFrame.this).setVisible(true);
			}
		});
		myContainer.add(myButton);
		myContainer.add(myLabel);
		myContainer.setBackground(Color.white);//Set background color
		this.setVisible(true);//Make the Window visible
		this.setSize(500,250);//Set the Window size
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Set the closing way of the window
	}

}



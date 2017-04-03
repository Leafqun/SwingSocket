package com.Leafqun.yqFrame;

import javax.swing.*;

import java.awt.*;

public class yqDialog extends JDialog{
	public yqDialog(yqFrame frame){
			super(frame,"yqDialog",true);
			Container container=getContentPane();
			JLabel label=new JLabel("yq制作的对话框");
			container.add(label);
			setBounds(120,120,100,100);
			setVisible(true);
		}
}

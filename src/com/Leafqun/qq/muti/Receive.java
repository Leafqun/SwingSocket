package com.Leafqun.qq.muti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Receive implements Runnable{
	BufferedReader br;
	public boolean isCreate=true;
	public String str;
	
	public Receive(Socket socket){
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			isCreate=false;
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public String receive(){
		String s=null;
		try {
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			isCreate=false;
		}
		return s;
	}
	public void run(){
		while(isCreate){
			str=receive();
			System.out.println(receive());
		}
	}
}

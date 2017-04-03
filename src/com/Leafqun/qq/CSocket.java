package com.Leafqun.qq;

import java.io.*;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class CSocket {
	public Socket socket;
	private BufferedWriter bw;
	private BufferedReader br;
	
	public CSocket(){
		//创建客户端，指定IP和端口，并请求连接
		try {
			socket=new Socket("localhost",8888);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//已连接
	}
	
	public void sendData(String s){
		try {
			//得到socket缓冲输出流对象
			bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(s+"\n");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String acceptData(){
		String s="wer";
		try {
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			s=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	/*public static void main(String[] args){
		createClient c=new createClient();
		c.sendData("yequn1");
	}*/
}

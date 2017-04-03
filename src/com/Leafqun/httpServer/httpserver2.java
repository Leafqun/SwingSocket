package com.Leafqun.httpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class httpserver2 {
	private ServerSocket server;
	private Socket client;
	private BufferedReader br;
	private BufferedWriter bw;
	public static final String CRLF="\r\n";
	public static final String SPACE=" ";
	/**
	 * *启动项
	 */
	public void start(){
		try {
			server=new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 **响应项 
	 */
	public void receive(){
		try {
			client=server.accept();
			StringBuilder context=new StringBuilder();
			context.append("<html><head><title>Leafqun的表单</title><head><body></body>yq123455545461566</html>");
			
			StringBuilder response=new StringBuilder();
			//1.http协议版本、状态代码、描述
			response.append("HTTP/1.1 200 OK").append(CRLF);
			//2.响应头（Response HEAD）
			response.append("Server:Leafqun Server/0.0.1").append(CRLF);
			response.append("Date:").append(new Date()).append(CRLF);
			response.append("Content-type:text/html;charset=GBK").append(CRLF);
			//正文长度:字节长度
			response.append("Content-Length:").append(context.toString().getBytes().length).append(CRLF);
			//3.正文之前
			response.append(CRLF);
			//4.正文
			response.append(context).append(CRLF);
			
			//输出流
			bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(response.toString());
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * *停止项
	 */
	public void stop(){
		
	}
	public static void main(String[] args){
		httpserver2 hs=new httpserver2();
		hs.start();
		hs.receive();
	}
}

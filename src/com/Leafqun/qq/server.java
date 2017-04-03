package com.Leafqun.qq;

public class server extends serverFrame{
	public server(){
		super();
	}
	public static void main(String[] args){
		server s=new server();
		SSocket cs=new SSocket();
		String str=null;
		while(true){
			cs.acceptClientConnection();
			while(true){
				str=cs.acceptData();
				s.show(str);
				cs.sendData(str);
			}
		}
	}
}

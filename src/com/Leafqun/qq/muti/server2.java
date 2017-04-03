package com.Leafqun.qq.muti;

public class server2 extends server1{
	public server2(){
		super();
	}
	public static void main(String[] args){
		server2 s=new server2();
		while(true){
			s.connection();
			//while(true){
				new Thread(new Receive(s.ss.socket)).start();
				
			//}
		}
	}
}

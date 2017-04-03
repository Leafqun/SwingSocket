package com.Leafqun.Net;

import java.net.*;

public class IP {
	public static void main(String[] args){
		InetAddress ip;
		try{
			ip=InetAddress.getLocalHost();
			String localname=ip.getHostName();
			String localip=ip.getHostAddress();
			System.out.println("主机名："+localname);
			System.out.println("ip地址:"+localip);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

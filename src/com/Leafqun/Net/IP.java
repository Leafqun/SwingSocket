package com.Leafqun.Net;

import java.net.*;

public class IP {
	public static void main(String[] args){
		InetAddress ip;
		try{
			ip=InetAddress.getLocalHost();
			String localname=ip.getHostName();
			String localip=ip.getHostAddress();
			System.out.println("��������"+localname);
			System.out.println("ip��ַ:"+localip);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

package com.Leafqun.Thread;

public class ThreadSafe implements Runnable{
	int num=10;
	public void run(){
		synchronized("num"){
			while(num>0){
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.println("num is "+num--);
			}
		}
	}
	public static void main(String[] args){
		ThreadSafe t=new ThreadSafe();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

package com.mustafazorbaz.singleton;

public class Sample {
	private static Sample sample; //Singleton nesnesi
	private int data; 
	 
	private Sample() {
		// TODO Auto-generated constructor stub
	}
	public static Sample CreateObject(){
		if(sample==null)
			sample=new Sample();
		return sample;
	}
	public int getData() {
		return data;
	}
	public void setData(int val) {
		data=val;
	}
}

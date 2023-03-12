package com.Api_test.API.Controller;

public class SimpleGetConnet {
private String Msg;
	public SimpleGetConnet(String message) {
	// TODO Auto-generated constructor stub
		this.Msg=message;
}
	
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
	@Override
	public String toString() {
		return "SimpleGetConnet [Msg=" + Msg + "]";
	}

	
}

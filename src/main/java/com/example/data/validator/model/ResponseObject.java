package com.example.data.validator.model;

public class ResponseObject {
	private Object data;
	private int status;
	private String message;
	
	public ResponseObject() { 
		super();
	}
	
	public ResponseObject(Object data, int status, String message) {
		super();
		this.data = data;
		this.status = status;
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

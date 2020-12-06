package com.DTO.ExceptionHandle;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
	private String msg;
	private String requestedUri;
	private int numberStatusCode;
	private HttpStatus Stringstatuscode;
	
	public HttpStatus getStringstatuscode() {
		return Stringstatuscode;
	}
	public void setStringstatuscode(HttpStatus stringstatuscode) {
		Stringstatuscode = stringstatuscode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getRequestedUri() {
		return requestedUri;
	}
	public void setRequestedUri(String requestedUri) {
		this.requestedUri = requestedUri;
	}
	public int getNumberStatusCode() {
		return numberStatusCode;
	}
	public void setNumberStatusCode(int numberStatusCode) {
		this.numberStatusCode = numberStatusCode;
	}
	
	

}

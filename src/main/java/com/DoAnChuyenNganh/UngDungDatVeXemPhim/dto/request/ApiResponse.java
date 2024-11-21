package com.DoAnChuyenNganh.UngDungDatVeXemPhim.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

//Định dạng Json trả về 

@JsonInclude(value = Include.NON_NULL)
public class ApiResponse<T>{
	private int code = 200;
	private String message;
	private T result;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}

}

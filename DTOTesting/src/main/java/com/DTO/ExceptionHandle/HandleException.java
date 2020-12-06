package com.DTO.ExceptionHandle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException 
{
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ExceptionResponse empexception(EmployeeNotFoundException emp, HttpServletRequest req)
	{
		ExceptionResponse res=new ExceptionResponse();
		res.setMsg(emp.getMessage());
		res.setRequestedUri(req.getRequestURI());
		res.setNumberStatusCode(HttpServletResponse.SC_NOT_FOUND);
		res.setStringstatuscode(HttpStatus.NOT_FOUND);
		
		return res;
		
	}
	

}

package com.DTO.Model;

public class EmployeeDTO 
{
	private String empName;
	private String deptName;
	
	public EmployeeDTO(String empName, String deptName )
	{ 
		this.empName=empName;
		this.deptName=deptName;
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	


}
